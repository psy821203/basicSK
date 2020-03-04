package egovframework.skmagic.admin.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import egovframework.skmagic.admin.example.sample.service.DefaultVO;
import egovframework.skmagic.admin.example.sample.service.MemberService;
import egovframework.skmagic.admin.example.sample.service.MemberVO;

/**
 * @패키지명 : egovframework.example.sample.web
 * @클래스명 : MemberController.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 1.
 * @설명 : 샘플 회원관리
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 1.   K.S.B   최초생성
 */
@Controller
public class MemberController {

	/** EgovSampleService */
	@Resource(name = "memberService")
	private MemberService memberService;

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/** Validator */
	@Resource(name = "beanValidator")
	protected DefaultBeanValidator beanValidator;
	
	
	/**
	 * @ 내용 : 메인 페이지
	 * @ 작성자 : K.S.B
	 * @ Method : adminMainView
	 * @ @return
	 * 임시
	 */
	@RequestMapping(value = "/adminMainView.do")
	public String adminMainView() {
		return "home/main";
	}

	/**
	 * @ 내용 : 회원 리스트 페이지
	 * @ 작성자 : K.S.B
	 * @ Method : userMainView
	 * @ @param searchVO
	 * @ @param model
	 * @ @return
	 * @ @throws Exception
	 */
	@RequestMapping(value = "/userSampleMainView.do")
	public String userSampleMainView(@ModelAttribute("searchVO") DefaultVO searchVO, ModelMap model) throws Exception {

		/** EgovPropertyService.sample */
		searchVO.setPageUnit(propertiesService.getInt("pageUnit")); 	// Record count per page
		searchVO.setPageSize(propertiesService.getInt("pageSize")); 	// 페이지네이션 링크 수

		/** pageing setting */
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());  		// 페이지 번호
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit()); 	// 페이지 당 행수 설정
		paginationInfo.setPageSize(searchVO.getPageSize());  			// 페이지 링크 수

		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex()); 	// 한 화면에 보여 줄 리스트의 마지막 행수
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		int totCnt = memberService.selectSampleListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		List<?> sampleList = memberService.selectSampleList(searchVO);
		model.addAttribute("resultList", sampleList);
		
		// views/admin 까지 생략한다.(타일즈 설정 참고)
		return "user/userList";
	}
	
	/**
	 * @ 내용 : 글 등록 화면을 조회한다.
	 * @ 작성자 : K.S.B
	 * @ Method : insertUserView
	 * @ @param searchVO
	 * @ @param model
	 * @ @return 
	 * @ @throws Exception
	 */
	@RequestMapping(value = "/insertUserTestView.do", method = RequestMethod.GET)
	public String insertUserSampleView(@ModelAttribute("searchVO") DefaultVO searchVO, Model model) throws Exception {
		model.addAttribute("memberVO", new MemberVO());
		return "user/userRegist";
	}
	
	/**
	 * 글을 등록한다.
	 * @param sampleVO - 등록할 정보가 담긴 VO
	 * @param searchVO - 목록 조회조건 정보가 담긴 VO
	 * @param status
	 * @return "forward:/egovSampleList.do"
	 * @exception Exception
	 */
	@RequestMapping(value = "/insertTestUser.do", method = RequestMethod.POST)
	public String insertSampleUser( @ModelAttribute("searchVO") DefaultVO searchVO
						    , MemberVO memberVO
						    , BindingResult bindingResult
						    , Model model
						    , SessionStatus status)
			 throws Exception {

		// Server-Side Validation
		/*beanValidator.validate(memberVO, bindingResult);

		if (bindingResult.hasErrors()) {
			model.addAttribute("memberVO", memberVO);
			return "user/userRegist";
		}*/

		memberService.insertSampleUser(memberVO);
		//status.setComplete();
		return "forward:/userSampleMainView.do";
	}
}
