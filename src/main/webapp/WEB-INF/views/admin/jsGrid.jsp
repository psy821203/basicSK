<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- page script -->
<script>  
$(function () {
  $("#jsGrid1").jsGrid({
      height: "100%",
      width: "100%",
      sorting: true,
      paging: true, 
      fields: [
          { name: "Name", type: "text", width: 150 },
          { name: "Age", type: "number", width: 50 },
          { name: "Address", type: "text", width: 200 },
          { name: "Country", type: "select", items: db.countries, valueField: "Id", textField: "Name" },
          { name: "Married", type: "checkbox", title: "Is Married" }
      ],
      data: db.clients,
      rowClick: function(args) {
          console.log(args);
          modalOpen("#modal-default");
      }
  });
});

// 팝업오픈
function modalOpen(modalId){
	$(modalId).modal("show");
}
</script>

<!-- Content Header (Page header) -->
<section class="content-header">
	<div class="container-fluid">
		<div class="row mb-2">
			<div class="col-sm-6">
			<h1>jsGrid</h1>
			</div>
			<div class="col-sm-6">
				<ol class="breadcrumb float-sm-right">
					<li class="breadcrumb-item"><a href="#">Home</a></li>
					<li class="breadcrumb-item active">jsGrid</li>
				</ol>
			</div>
		</div>
	</div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
	<div class="card">
		<div class="card-header">
		  <h3 class="card-title">jsGrid</h3>
		</div>
		<!-- /.card-header -->
		<div class="card-body">
			<div id="jsGrid1"></div>
		</div>
		<!-- /.card-body -->
	</div>
	<!-- /.card -->
</section>
<!-- /.content -->
 
 
 
<!-- The Modal -->
<div class="modal fade" id="modal-default">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Default Modal</h4>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				내용
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!--End Modal-->
 

 



