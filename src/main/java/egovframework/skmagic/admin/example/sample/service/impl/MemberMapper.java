package egovframework.skmagic.admin.example.sample.service.impl;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.skmagic.admin.example.sample.service.DefaultVO;
import egovframework.skmagic.admin.example.sample.service.MemberVO;

/**
 * @패키지명 : egovframework.skmagic.admin.sample.service.impl
 * @클래스명 : MemberMapper.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 2.
 * @설명 : 샘플 매퍼 클래스
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 2.   K.S.B   최초생성
 */
@Mapper("memberMapper")
public interface MemberMapper {

	/**
	 * @ 내용 : 글 목록을 조회한다.
	 * @ 작성자 : K.S.B
	 * @ Method : selectSampleList
	 * @ @param searchVO - 조회할 정보가 담긴 VO
	 * @ @return
	 * @ @throws Exception
	 */
	List<?> selectSampleList(DefaultVO searchVO) throws Exception;
	
	/**
	 * @ 내용 : 글 총 갯수를 조회한다.
	 * @ 작성자 : K.S.B
	 * @ Method : selectSampleListTotCnt
	 * @ @param searchVO - 조회할 정보가 담긴 VO
	 * @ @return
	 */
	int selectSampleListTotCnt(DefaultVO searchVO);
	
	/**
	 * @ 내용 : 글을 등록한다.
	 * @ 작성자 : K.S.B
	 * @ Method : insertUser
	 * @ @param mvo - 등록할 정보가 담긴 vo
	 * @ @throws Exception
	 */
	void insertSampleUser(MemberVO mvo) throws Exception;
}
