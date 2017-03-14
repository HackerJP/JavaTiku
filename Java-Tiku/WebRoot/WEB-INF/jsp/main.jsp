<%@page import="tiku.domain.Exercises"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>java试题库</title>
		<!-- Bootstrap -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
		<link rel="stylesheet" href="css/style.css">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
		<div id="wrapper">
			<div class="overlay"></div>
			
			<!-- Sidebar -->
			<nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
				<ul class="nav sidebar-nav">
					<li class="sidebar-brand">
						<a href="#">
							Bootstrap 3
						</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-home"></i> Home</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-folder"></i> Page one</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-file-o"></i> Second page</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-cog"></i> Third page</a>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">Dropdown heading</li>
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-bank"></i> Page four</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-dropbox"></i> Page 5</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-fw fa-twitter"></i> Last page</a>
					</li>
				</ul>
			</nav>
			<!-- /#sidebar-wrapper -->
			<!-- Page Content -->
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container-fluid">
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav navbar-left" >
							<li><div id="page-content-wrapper">
								<button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas" >
								<span class="hamb-top"></span>
								<span class="hamb-middle"></span>
								<span class="hamb-bottom"></span>
								</button>
							</div></li>
						</ul>
					</div>
				</div>
			</nav>
			<div class="row">
				<div class="col-md-2">
					<a href="#">
						<img src="img/test.jpg" style="margin-left: 60px;margin-bottom: 30px;margin-top: 80px"; alt="..." class="img-circle">
					</a>
					<div>
						<div class = "list-group">
							<a href="#" class="list-group-item">
								<span class="glyphicon glyphicon-menu-right"></span> 出题
							</a>
							<a href="#" class="list-group-item">
								<span class="glyphicon glyphicon-menu-right"></span>录入题目
							</a>
							<a href="loginForm.jsp" class="list-group-item">
								<span class="glyphicon glyphicon-log-out"></span> 登出
							</a>
						</a>
					</div>
				</div>
			</div>
			<div class="col-md-8">
				<br>
				<br>
				<br>
				<table class="table">
					<tbody>
						<tr>
							<td><p>按难度：</p></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox1" value="option1"> 1
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox2" value="option2"> 2
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 3
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 4
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 5
							</label></td>
						</tr>
						<tr>
							<td><p>按知识点：</p></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox1" value="option1"> 1
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox2" value="option2"> 2
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 3
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 4
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 5
							</label></td>
						</tr>
						<tr>
							<td><p>按类型：</p></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox1" value="option1"> 选择题
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox2" value="option2"> 判断题
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 填空题
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 简答题
							</label></td>
							<td><label class="checkbox-inline">
								<input type="checkbox" id="inlineCheckbox3" value="option3"> 程序设计题
							</label></td>
							<td><button class="btn btn-default" type="submit" style="margin-left: 60px;">确定</button></td>
						</tr>
					</tbody>
				</table>
				<div class="row">
					<div class="col-md-12">
						<div class="panel-group" id="accordion">
							<c:forEach items="${exercises}" var="e_item">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
									<p>
									${ e_item.getEdesc()}
									</p>
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne">
										点击看答案
									</a>
									<button class="btn btn-default" type="submit">添加</button>
									<button class="btn btn-default" type="submit">编辑</button>
									<button class="btn btn-default" type="submit">删除</button>
									</h4>
								</div>
								<div id="collapseOne" class="panel-collapse collapse in">
									<div class="panel-body">
										${e_item.getEanswer()}
									</div>
								</div>
							</div>
							</c:forEach>
						</div>
						<nav aria-label="Page navigation">
							<ul class="pagination">
								<li>
									<a href="#" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">6</a></li>
								<li><a href="#">7</a></li>
								<li><a href="#">8</a></li>
								<li><a href="#">9</a></li>
								<li><a href="#">10</a></li>
								<li>
									<a href="#" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /#page-content-wrapper -->
</div>
</body>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://cdn.bootcss.com/jquery/1.12.4/jquery.min.js" type="text/javascript"></script>
<script>window.jQuery || document.write('<script src="http://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"><\/script>')</script>
<script type="text/javascript">
	$(document).ready(function () {
	var trigger = $('.hamburger'),
	overlay = $('.overlay'),
	isClosed = false;
	trigger.click(function () {
	hamburger_cross();
	});
	function hamburger_cross() {
	if (isClosed == true) {
	overlay.hide();
	trigger.removeClass('is-open');
	trigger.addClass('is-closed');
	isClosed = false;
	} else {
	overlay.show();
	trigger.removeClass('is-closed');
	trigger.addClass('is-open');
	isClosed = true;
	}
	}
	
	$('[data-toggle="offcanvas"]').click(function () {
	$('#wrapper').toggleClass('toggled');
	});
	});
</script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>