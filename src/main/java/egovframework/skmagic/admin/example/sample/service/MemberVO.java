package egovframework.skmagic.admin.example.sample.service;


import java.sql.Date;

/**
 * 
 * @패키지명 : egovframework.skmagic.admin.sample.service
 * @클래스명 : MemberVO.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 3.
 * @설명 : 샘플
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 3.   K.S.B   최초생성
 */
public class MemberVO extends DefaultVO {
	
	private String userId;    // 아이디(사번)
	private String pw;        // 패스워드
	private String name;      // 이름
	private String hp;        // 핸드폰
	private String gradeCd;   // 회원등급
	private String memo;      // 홍보문구(메모)
	private String myImage;   // 회원이미지
	private String groupCd;   // 
	private String pushYn;    // 푸시여부
	private Date regDt;       // 등록일자
	private Date blockDt;     // 접근차단일자
	private Date levaeDt;     // 탈퇴일자
	private String useYn;     // 사용여부
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getGradeCd() {
		return gradeCd;
	}
	public void setGradeCd(String gradeCd) {
		this.gradeCd = gradeCd;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMyImage() {
		return myImage;
	}
	public void setMyImage(String myImage) {
		this.myImage = myImage;
	}
	public String getGroupCd() {
		return groupCd;
	}
	public void setGroupCd(String groupCd) {
		this.groupCd = groupCd;
	}
	public String getPushYn() {
		return pushYn;
	}
	public void setPushYn(String pushYn) {
		this.pushYn = pushYn;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public Date getBlockDt() {
		return blockDt;
	}
	public void setBlockDt(Date blockDt) {
		this.blockDt = blockDt;
	}
	public Date getLevaeDt() {
		return levaeDt;
	}
	public void setLevaeDt(Date levaeDt) {
		this.levaeDt = levaeDt;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
}
