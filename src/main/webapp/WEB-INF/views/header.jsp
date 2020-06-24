<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>지구력</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
  	<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  	<script type="text/javascript">
	  	$(function() {
	        $('ul.navbar-nav li a[href$="' + window.location.pathname+ '"]').parent().addClass("active");
	 	});
  	</script>
  </head>
  <body>
  <c:if test="${!empty user }">
  	<c:set value="${user }" var="user"></c:set>
  </c:if>
    
  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
      <a class="navbar-brand" href="index.do"><img src="${pageContext.request.contextPath}/resources/images/back_logo.png" alt="logo"class="headerclogo"  width="45px" height="45px"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="oi oi-menu"></span> Menu
      </button>

      <div class="collapse navbar-collapse" id="ftco-nav">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item"><a href="index.do" class="nav-link">Home</a></li>
          <li class="nav-item"><a href="org.do" class="nav-link">환경단체</a></li>
          <li class="nav-item"><a href="projectlist.do" class="nav-link">프로젝트</a></li>
          <li class="nav-item"><a href="chunglist.do" class="nav-link">청원</a></li>
          <li class="nav-item"><a href="" class="nav-link">함께해요</a></li>
          <c:if test="${empty user }">
          	<li class="nav-item"><a href="loginForm.do" class="nav-link">로그인</a></li>     
          	<!-- <li class="nav-item"><a href="loginForm2.do" class="nav-link">로그인</a></li> -->          
          </c:if>
          <c:if test="${!empty user }">
          	<li class="nav-item"><a href="logout.do" class="nav-link">로그아웃</a></li>
	          <li class="nav-item dropdown"><a href="" class="nav-link" data-toggle="dropdown">마이페이지</a>
	          	<div class="dropdown-menu">
	          		<a class="dropdown-item" href="myPage.do">유저 마이페이지</a>
	          		<a class="dropdown-item" href="myDonate.do">유저 후원페이지</a>
	          		<a class="dropdown-item" href="myAction.do">유저 내활동페이지</a>
	          		<a class="dropdown-item" href="secession.do">탈퇴페이지</a>
	          	</div>
	          <li>    
          </c:if>
        </ul>
      </div>
    </div>
  </nav>
  <!-- END nav -->

  </body>
</html>