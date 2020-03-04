package com.skmagic.admin.bbs.notice.service;

import java.util.Date;

/**
 * 클래스설명 : 
 * @version : 2020. 3. 4.
 * @author : chansung
 * @분류 : 
 * skMagic / package com.skmagic.admin.bbs.notice.service;
 */

public class NoticeVO {

	private int ntcid;			// 공지사항ID(자동증가)
	private String ntcToDate;	// 공지사항 종료일자(99990101)
	private String ntcFromDate;	// 공지사항 시작일자(99990101)
	private String ntcTitle;	// 공지사항 제목
	private String ntcCnts;		// 공지사항 내용
	private String ntcStsCd;	// 공지사항 상태 (1-대기,2-시작,3-종료)
	private int readCnt;		// 조회수
	private Date regDate;		// 날짜
	private String regId;		// 등록자아이디
	
	public int getNtcid() {
		return ntcid;
	}
	public void setNtcid(int ntcid) {
		this.ntcid = ntcid;
	}
	public String getNtcToDate() {
		return ntcToDate;
	}
	public void setNtcToDate(String ntcToDate) {
		this.ntcToDate = ntcToDate;
	}
	public String getNtcFromDate() {
		return ntcFromDate;
	}
	public void setNtcFromDate(String ntcFromDate) {
		this.ntcFromDate = ntcFromDate;
	}
	public String getNtcTitle() {
		return ntcTitle;
	}
	public void setNtcTitle(String ntcTitle) {
		this.ntcTitle = ntcTitle;
	}
	public String getNtcCnts() {
		return ntcCnts;
	}
	public void setNtcCnts(String ntcCnts) {
		this.ntcCnts = ntcCnts;
	}
	public String getNtcStsCd() {
		return ntcStsCd;
	}
	public void setNtcStsCd(String ntcStsCd) {
		this.ntcStsCd = ntcStsCd;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
	
}
