package com.skmagic.admin.bbs.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 클래스설명 : 
 * @version : 2020. 3. 4.
 * @author : chansung
 * @분류 : 
 * skMagic / package com.skmagic.admin.bbs.notice.web;
 */

@Controller
public class NoticeController {

	/**
	 * @ 내용 : 공지사항 메인 페이지
	 * @ 작성자 : chansung
	 * @ Method : selectNoticeList
	 * @ @return
	 */
	@RequestMapping(value="/noticeMainView.do")
	public String selectNoticeList() {
		return "notice/noticeMainView";
	}
}
