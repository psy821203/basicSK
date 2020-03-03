package egovframework.skmagic.admin.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.skmagic.admin.example.sample.service.DefaultVO;
import egovframework.skmagic.admin.example.sample.service.MemberService;
import egovframework.skmagic.admin.example.sample.service.MemberVO;

/**
 * 
 * @패키지명 : egovframework.example.sample.service.impl
 * @클래스명 : MemberServiceImpl.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 1.
 * @설명 : 샘플예제
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 1.   K.S.B   최초생성
 */
@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);

	 @Resource(name="memberMapper")
	 private MemberMapper mapper;

	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;

	@Override
	public List<?> selectSampleList(DefaultVO searchVO) throws Exception {
		return mapper.selectSampleList(searchVO);
	}
	
	@Override
	public int selectSampleListTotCnt(DefaultVO searchVO) {
		return mapper.selectSampleListTotCnt(searchVO);
	}
	
	/**
	 * 글을 등록한다.
	 * @param memberVo - 등록할 정보가 담긴 MemberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	@Override
	public String insertUser(MemberVO mvo) throws Exception {
		LOGGER.debug(mvo.toString());

		/** ID Generation Service */
		//String id = egovIdGnrService.getNextStringId();
		//memberVo.setId(id);
		//LOGGER.debug(memberVo.toString());

		mapper.insertUser(mvo);
		return mvo.getUserId();
	}
}
