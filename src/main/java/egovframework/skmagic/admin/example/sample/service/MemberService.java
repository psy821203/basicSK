package egovframework.skmagic.admin.example.sample.service;

import java.util.List;

/**
 * 
 * @패키지명 : egovframework.example.sample.service
 * @클래스명 : MemberService.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 1.
 * @설명 : 샘플예제
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 1.   K.S.B   최초생성
 */
public interface MemberService {

	/**
	 * 
	 * @ 내용 : 회원 목록을 조회한다
	 * @ 작성자 : K.S.B
	 * @ Method : selectSampleList
	 * @ @param searchVO  - 조회할 정보가 담긴 VO
	 * @ @return 글 목록
	 * @ @throws Exception
	 */
	List<?> selectSampleList(DefaultVO searchVO) throws Exception;

	/**
	 * 
	 * @ 내용 : 회원 총 갯수를 조회한다.
	 * @ 작성자 : K.S.B
	 * @ Method : selectSampleListTotCnt
	 * @ @param searchVO - 조회할 정보가 담긴 VO
	 * @ @return 글 총 갯수
	 */
	int selectSampleListTotCnt(DefaultVO searchVO);
	
	/**
	 * @ 내용 : 글을 등록한다.
	 * @ 작성자 : K.S.B
	 * @ Method : insertUser
	 * @ @param memberVo - 등록할 정보가 담긴 VO
	 * @ @return
	 * @ @throws Exception
	 */
	String insertSampleUser(MemberVO memberVo) throws Exception;
}

