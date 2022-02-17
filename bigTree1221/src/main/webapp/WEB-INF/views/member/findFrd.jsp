<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>
<html lang="ko">
  <meta charset="UTF-8" />
  <head>
  	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/findFrd.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-alarm" viewBox="0 0 16 16">
  <path d="M8.5 5.5a.5.5 0 0 0-1 0v3.362l-1.429 2.38a.5.5 0 1 0 .858.515l1.5-2.5A.5.5 0 0 0 8.5 9V5.5z"/>
  <path d="M6.5 0a.5.5 0 0 0 0 1H7v1.07a7.001 7.001 0 0 0-3.273 12.474l-.602.602a.5.5 0 0 0 .707.708l.746-.746A6.97 6.97 0 0 0 8 16a6.97 6.97 0 0 0 3.422-.892l.746.746a.5.5 0 0 0 .707-.708l-.601-.602A7.001 7.001 0 0 0 9 2.07V1h.5a.5.5 0 0 0 0-1h-3zm1.038 3.018a6.093 6.093 0 0 1 .924 0 6 6 0 1 1-.924 0zM0 3.5c0 .753.333 1.429.86 1.887A8.035 8.035 0 0 1 4.387 1.86 2.5 2.5 0 0 0 0 3.5zM13.5 1c-.753 0-1.429.333-1.887.86a8.035 8.035 0 0 1 3.527 3.527A2.5 2.5 0 0 0 13.5 1z"/>
</svg>
    
    <title>BIGTREE친구찾기</title>
  </head>
  <body>
    <div id="mycard">
    
      <!-- Header -->
      <div id="mycard--header">
        <h1 id="title">
          BIGTREE <span id="title--bold-part">친구찾기</span>
        </h1>
      </div>
<i class="bi bi-alarm"></i>
      <!-- Body -->
      <form class="form-horizontal" method="post" action="findFrd" name='findform'>
      <div id="mycard--body">
        <div class="row pb-3">
          <div class="col-sm-12">    
              <div class="row">
                <div class="col-sm-8">
                  <input type="text" name="user_id" id="user_id" class="form-control" placeholder="찾으실 친구의 아이디를 입력해주세요.." />
                </div>
                <div id="user-select" class="col-sm-4">
                  <!-- Select -->
                </div>
              </div>
          </div>
        </div>

        <div class="row pt-3">
          <div class="col-sm-12">
            <button type="submit" class="btn btn-default mr-2" id="find-btn"><i class="fa fa-users"></i> 찾아보기</button>
          </div>
        </div>
      
		<c:if test="${checkid == 1}">
				<script>
					opener.document.findform.user_id.value = "";
				</script>
				<label> 입력하신 아이디의 정보가 존재하지 않습니다.</label>
		</c:if>
	
			<!-- 이름과 비밀번호가 일치하지 않을 때 -->
		<c:if test="${checkid == 0 }">
			<table id="feiendResult" class="table table-bordered table-hover">
				<tr>
					<th scope='row'> I D </th>
					<td> ${find.user_id} </td>
				</tr>	
				<tr>
					<th> N A M E</th>
					<td> ${find.user_name }</td>
					
				</tr>
			</table>
			
				<div class="form-label-group">
					<input class="btn btn-lg btn-secondary btn-block text-uppercase"
						type="button" value="친구추가" onclick="login()">
				</div>
				<div class="form-label-group">
					<input class="btn btn-block text-uppercase"
						type="button" value="메세지 보내기" onclick="resetPwd()">
				</div>
		</c:if>
		</div>
		</form>
    </div>
    
  </body>
</html>
