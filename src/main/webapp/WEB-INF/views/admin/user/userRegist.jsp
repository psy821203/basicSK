<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"         uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"      uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring"    uri="http://www.springframework.org/tags"%>
<!--For Commons Validator Client Side-->
<!-- 
<script type="text/javascript" src="<c:url value='/cmmn/memberValidator.do'/>"></script>
<validator:javascript formName="memberVO" staticJavascript="false" xhtml="true" cdata="false"/>
 -->
 
<script type="text/javaScript" language="javascript" defer="defer">
/* 글 등록 function */
function fn_egov_save() {
	frm = document.detailForm;
	//if(!validateMemberVO(frm)){
    //    return;
    //}else{
    	frm.action = "/insertSampleUser.do";
        frm.submit();
    //}
}
</script>

<!-- Content Header (Page header) -->
<section class="content-header">
	<div class="container-fluid">
		<div class="row mb-2">
			<div class="col-sm-6">
			<h1>회원등록</h1>
			</div>
			<div class="col-sm-6">
				<ol class="breadcrumb float-sm-right">
					<li class="breadcrumb-item"><a href="#">Home</a></li>
					<li class="breadcrumb-item active">회원등록</li>
				</ol>
			</div>
		</div>
	</div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
	<div class="card">
		<div class="card-header">
			<div class="row">
				<div class="col-6">
					<h3 class="card-title">회원등록</h3>
				</div>
			</div>
		</div>
		<!-- /.card-header -->
  		<!-- form start -->
         <form:form commandName="memberVO" id="detailForm" name="detailForm" class="form-horizontal">
           <div class="card-body">
             <div class="form-group row">
               <label for="userId" class="col-sm-2 col-form-label">아이디(사번)</label>
               <div class="col-sm-10">
                 <input type="text" class="form-control" name="userId" placeholder="아이디(사번)을 입력하세요.">
               </div>
             </div>
             <div class="form-group row">
               <label for="pw" class="col-sm-2 col-form-label">비밀번호</label>
               <div class="col-sm-10">
                 <input type="password" class="form-control" name="pw" placeholder="비밀번호를 입력하세요.">
               </div>
             </div>
             <div class="form-group row">
               <label for="name" class="col-sm-2 col-form-label">이름</label>
               <div class="col-sm-10">
                 <input type="text" class="form-control" name="name" placeholder="이름을 입력하세요.">
               </div>
             </div>
             <div class="form-group row">
               <label for="hp" class="col-sm-2 col-form-label">휴대전화</label>
               <div class="col-sm-10">
                 <input type="text" class="form-control" name="hp" placeholder="연락처를 입력하세요.">
               </div>
             </div>
             <div class="form-group row">
               <label for="gradeCd" class="col-sm-2 col-form-label">회원등급</label>
               <div class="col-sm-10">
                 <select class="form-control" name="gradeCd">
                 	<option value="2">사원</option>
                 	<option value="10">관리자</option>
                 </select>
               </div>
             </div>
             <div class="form-group row">
               <label for="memo" class="col-sm-2 col-form-label">홍보문구</label>
               <div class="col-sm-10">
                 <textarea class="form-control" name="memo"></textarea>
               </div>
             </div>
             <div class="form-group row">
               <label for="memo" class="col-sm-2 col-form-label">회원이미지</label>
               <div class="col-sm-10">
                 <input type="file" class="form-control" name="myImage" />
               </div>
             </div>
             <div class="form-group row">
               <label for="groupCd" class="col-sm-2 col-form-label">회원그룹</label>
               <div class="col-sm-10">
                 <select class="form-control" name="groupCd">
					<option value="1">TY렌탈채권팀</option>
					<option value="2">렌탈상담실</option>
					<option value="3">제품1팀</option>
					<option value="4">제품2팀</option>
					<option value="5">제품3팀</option>
					<option value="6">제품5팀</option>
				 </select>
               </div>
             </div>
             
             <div class="form-group row">
               <label for="levaeDt" class="col-sm-2 col-form-label">탈퇴일자</label>
               <div class="col-sm-10">
                 <input type="text" class="" name="levaeDt">
                 <input type="checkbox" class="" id="levaeDt">
                 <label class="form-check-label" for="levaeDt">탈퇴일자를 오늘로 지정</label>
               </div>
             </div>
             <div class="form-group row">
               <label for="blockDt" class="col-sm-2 col-form-label">접근차단일자</label>
               <div class="col-sm-10">
               	 <input type="text" class="" name="blockDt">
                 <input type="checkbox" class="" id="blockDt">
                 <label class="form-check-label" for="blockDt">접근차단일자를 오늘로 지정</label>
               </div>
             </div>
             
           </div>
           <!-- /.card-body -->
           <div class="card-footer">
             <button type="button" class="btn btn-default ">목록</button>
             <button type="button" class="btn btn-info float-right" onClick="fn_egov_save();">저장</button>
           </div>
           <!-- /.card-footer -->
         <!-- 검색조건 유지 -->
		    <input type="hidden" name="searchCondition" value="<c:out value='${searchVO.searchCondition}'/>"/>
		    <input type="hidden" name="searchKeyword" value="<c:out value='${searchVO.searchKeyword}'/>"/>
		    <input type="hidden" name="pageIndex" value="<c:out value='${searchVO.pageIndex}'/>"/>
		</form:form>
		<!-- /.card-body -->
	</div>
	<!-- /.card -->
</section>
<!-- /.content -->
 



