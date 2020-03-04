package com.skmagic.admin.bbs.notice.service;

import java.util.List;

/**
 * 클래스설명 : 
 * @version : 2020. 3. 4.
 * @author : chansung
 * @분류 : 
 * skMagic / package com.skmagic.admin.bbs.notice.service;
 */

public interface NoticeService {

	/**
	 * @ 내용 : 공지사항 목록
	 * @ 작성자 : chansung
	 * @ Method : selectNoticeList
	 * @ @param noticeVO
	 * @ @return
	 * @ @throws Exception
	 */
	List<?> selectNoticeList(NoticeVO noticeVO) throws Exception;
}
