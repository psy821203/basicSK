<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- page script -->
<script type="text/javaScript" language="javascript" defer="defer">
      /* 글 수정 화면 function */
      function fn_egov_select(id) {
      		document.listForm.selectedId.value = id;
         	document.listForm.action = "#";
         	//document.listForm.submit();
      }
      
      /* 글 등록 화면 function */
      function fn_egov_addView() {
    	  location.href = "/insertUserSampleView.do";
      }
      
      /* 글 목록 화면 function */
      function fn_egov_selectList() {
      	document.listForm.action = "/userSampleMainView.do";
         	document.listForm.submit();
      }
      
      /* pagination 페이지 링크 function */
      function fn_egov_link_page(pageNo){
      	document.listForm.pageIndex.value = pageNo;
      	document.listForm.action = "/userSampleMainView.do";
         	document.listForm.submit();
      }
      
</script>

<!-- Content Header (Page header) -->
<section class="content-header">
	<div class="container-fluid">
		<div class="row mb-2">
			<div class="col-sm-6">
			<h1>회원목록</h1>
			</div>
			<div class="col-sm-6">
				<ol class="breadcrumb float-sm-right">
					<li class="breadcrumb-item"><a href="#">Home</a></li>
					<li class="breadcrumb-item active">회원목록</li>
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
					<h3 class="card-title">회원목록</h3>
				</div>
				<div class="col-6 text-right">
					<button type="button" class="btn btn-sm btn-default" onClick="fn_egov_addView();">회원등록</button>
				</div>
			</div>
		</div>
		<!-- /.card-header -->
		<div class="card-body">
		<form:form commandName="searchVO" id="listForm" name="listForm" method="post">
		<input type="hidden" name="selectedId" />
		
			<div id="search">
        		<ul>
        			<li>
        			    <label for="searchCondition" >검색타입</label>
        				<form:select path="searchCondition" cssClass="use">
        					<form:option value="0" label="사번" />
        					<form:option value="1" label="이름" />
        				</form:select>
        			</li>
        			<li><label for="searchKeyword">검색어</label>
                        <form:input path="searchKeyword" cssClass="txt"/>
                    </li>
        			<li>
        	            <span class="btn_blue_l">
        	                <a href="javascript:fn_egov_selectList();">검색</a>
        	            </span>
        	        </li>
                </ul>
        	</div>
			
			<table class="table table-bordered">
			<thead>                  
				<tr>
					<th style="width: 10px"></th>
					<th>아이디 (사번)</th>
					<th>이름</th>
					<th>가입일</th>
					<th>최종접속일</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="result" items="${resultList}" varStatus="status">
				<tr>
					<td></td>
					<td>${result.userId}</td>
					<td>${result.name}</td>
					<td>${result.regDt}</td>
					<td>${result.regDt}</td>
					<td>
						<button type="button" class="btn btn-sm btn-default" onClick="fn_egov_select('${result.userId}');">수정</button>
					</td>
				</tr>
				</c:forEach>
			</tbody>
			</table>
		</div>
		<!-- /.card-body -->
		<div class="card-footer clearfix">
			<div id="paging">
        		<ui:pagination paginationInfo = "${paginationInfo}" type="image" jsFunction="fn_egov_link_page" />
        		<form:hidden path="pageIndex" />
        	</div>
		</div>
	</form:form>
	</div>
	<!-- /.card -->
</section>
<!-- /.content -->
 

 



