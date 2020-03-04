package com.skmagic.admin.bbs.notice.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skmagic.admin.bbs.notice.service.NoticeService;
import com.skmagic.admin.bbs.notice.service.NoticeVO;

/**
 * 클래스설명 : 
 * @version : 2020. 3. 4.
 * @author : chansung
 * @분류 : 
 * skMagic / package com.skmagic.admin.bbs.notice.web.service.impl;
 */

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Resource(name="noticeMapper")
	private NoticeMapper mapper;
	
	@Override
	public List<?> selectNoticeList(NoticeVO noticeVO) throws Exception {
		System.out.println("@@@mapper.selectNoticeList(noticeVO)@@@"+mapper.selectNoticeList(noticeVO));
		return mapper.selectNoticeList(noticeVO);
	}

}
