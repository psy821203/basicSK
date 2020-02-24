<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style type="text/css">
html { font-size: 12px; }
/* 첨부파일태그 */
.fileTag { display:none; } 
/* 댓글 입력창 */
.comment-input-group { position: relative; }
.comment-input-group-btn { position: absolute; right: 10px; padding: 3px; }
.comment-input-group-btn span { border-left: 1px dotted #495057; padding-left: 6px; }

/* 버튼 설정 */
.comment-input-group-btn span,
.comment-input-group-btn i,
.commont-btn span { cursor: pointer; color: #495057; font-weight: 600; font-size: 10px; }

.commont-btn span { border-left: 1px solid #495057; padding: 0px 4px; }
.commont-btn span:first-child { border-left: 0px; }

/* 댓글 파일 이미지 미리보기 */
ul.comment-photo { margin-top: 10px; }
ul.comment-photo li { border: 1px solid #eee; float: left; margin-bottom: 10px; margin-right: 10px; width: 150px; position: relative; max-height: 132.5px; padding: 0;}
/* ul.comment-photo div.img-area { max-height: 132.5px; padding: 0; } */
ul.comment-photo li img { height: auto !important; width: 100% !important; }
ul.comment-photo span.previewClose { position: absolute; right: 9px; color: #fff; }

.card-comments .username { font-size: 13px; }
.img-circle { padding: 4px; background: #fff; }
</style>

<script type="text/javascript">
    $(function () {
        $('.btn-upload').click(function (e) {
            e.preventDefault();
            var fileId = $(this).attr('data-fileId');
            console.log(fileId);
            $('#'+fileId).click();
        });
        
        $('.previewClose').click(function(e){
        	$(this).parents('li').remove();
        });
        
        $('.add-comment').click(function(e){
        	// add-comment
        	var html = $('.comment-input-group').clone(true);
        	$(this).parents().find('.comment-area').append(html);
        });
    });
</script>

    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Project Detail</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Project Detail</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
    	<div class="card card-widget">
	        <div class="card-header">
	        	<div class="row">
		        	<div class="col-6">
		        		2020-02-17 16:03:10
		        	</div>
		        	<div class="col-6 text-right">
		        		<i class="fas fa-heart fa-lg mr-2"></i>1
		        		<button type="button" class="btn btn-default btn-sm">목록</button>
		        	</div>
	        	</div>
	        </div>
	        <div class="card-body">
			내용
	        </div>
	        <!-- /.card-body -->

	 	    <div class="card-body comment">
				<span class="text-muted">댓글 3</span>
				<hr />
				<div class="row comment-input-group">
				      <input type="text" class="form-control form-control-sm" placeholder="댓글을 적어주세요.">
				      <input type="file" class="fileTag" id="file1" name="file"  />
				      
				      <div class="comment-input-group-btn">
				        <i class="fas fa-file-image fa-lg mr-2 btn-upload" data-fileId="file1"></i>
				        <span>등록</span>
				      </div>
			    </div>
			    
		    	<!-- /.input-group -->
				<ul class="list-inline comment-photo">
					<li>
						<span class="previewClose">X</span>
						<img src="/resources/dist/img/photo1.png" alt="Attachment">
					</li>
					<li>
						<span class="previewClose">X</span>
						<img src="/resources/dist/img/photo1.png" alt="Attachment">
					</li>
					<li>
						<span class="previewClose">X</span>
						<img src="/resources/dist/img/photo1.png" alt="Attachment">
					</li>
				</ul>
	          	<!-- 이미지 미리보기 -->
	 	    </div>
	 	    
	 		<div class="card-footer card-comments">
	          <div class="card-comment">
	            <!-- User image -->
	            <img class="img-circle img-sm" src="/images/sk_logo.png" alt="User Image">
	            <div class="comment-text">
	              <div class="row">
	                	<div class="col-6">
	                		<h6 class="username">관리자</h6>
	                		<h6 class="text-muted">2020-02-17 오후 2:50</h6>
						</div>
	                	<div class="col-6 commont-btn text-right">
	                		<h6 class="text-muted">
	                			<span>수정</span>
	                			<span>삭제</span>
	                		</h6>
	                		<h6 class="text-muted">
	                			<span class="add-comment">▶댓글달기</span>
	                		</h6>
	                	</div>
	                	<div class="col-12 comment-area">
	                		네~ 적극 반영하도록 하겠습니다. <br/>
	                		감사합니다.
	                	</div>
	                </div>
	            </div>
	            <!-- /.comment-text -->
	          </div>
	          <!-- /.card-comment -->
	          
	          <div class="card-comment">
	            <!-- User image -->
	            <img class="img-circle img-sm" src="/images/sk_logo.png" alt="User Image">
	            <div class="comment-text">
	              <div class="row">
	                	<div class="col-6">
	                		<h6 class="username">관리자</h6>
	                		<h6 class="text-muted">2020-02-17 오후 2:50</h6>
						</div>
	                	<div class="col-6 commont-btn text-right">
	                		<h6 class="text-muted">
	                			<span>수정</span>
	                			<span>삭제</span>
	                		</h6>
	                		<h6 class="text-muted">
	                			<span class="add-comment">▶댓글달기</span>
	                		</h6>
	                	</div>
	                	<div class="col-12 comment-area">
	                		네~ 적극 반영하도록 하겠습니다. <br/>
	                		감사합니다.
	                	</div>
	                	
	                	
	                	<div class="col-12">
	                		<div class="row comment-input-group">
							      <input type="text" class="form-control form-control-sm" placeholder="댓글을 적어주세요.">
							      <input type="file" class="fileTag" id="file1" name="file"  />
							      
							      <div class="comment-input-group-btn">
							        <i class="fas fa-file-image fa-lg mr-2 btn-upload" data-fileId="file1"></i>
							        <span>등록</span>
							      </div>
						    </div>
						    <ul class="list-inline comment-photo">
								<li>
									<span class="previewClose">X</span>
									<img src="/resources/dist/img/photo1.png" alt="Attachment">
								</li>
							</ul>
	                	</div>
	                	
	                </div>
	            </div>
	            <!-- /.comment-text -->
	          </div>
	          <!-- /.card-comment -->
	        </div>
	 	</div>

    </section>
    <!-- /.content -->

