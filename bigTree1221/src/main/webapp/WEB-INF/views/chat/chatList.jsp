<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  	<script src="https://code.jquery.com/jquery-3.6.0.js" type="text/javascript"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css" />
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <title>chats</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/chatList.css?after" />
  </head>

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
  <script type="text/javascript">
    $(document).ready(function () {
      $('#room1').on('click', function () {
        window.resizeTo(600, 800)
        location.replace('room1')
      })

      $('#room2').on('click', function () {
        window.resizeTo(600, 800)
        location.replace('room2')
      })
      $('#room').on('click', function (e) {
    	e.preventDefault()
        window.resizeTo(600, 800)
        var rand = Math.floor(Math.random() * 2) + 1
        if (rand == 2) {
          location.replace('room2')
        } else {
          location.replace('room1')
        }
      })
      
      $("#makeRoom").click(function(e){
    	  e.preventDefault()
    	  console.log("dd")
    	  $("#roomModal").modal('show')
      })
      
      $("#modalCloseBtn").click(function(e){
    	  $("#roomModal").modal('hide')
      })
      $("#modalRegisterBtn").click(function(e){
    	  console.log($("#roomName").val())
    	  var str=""
    	  str=""
      })
      
      
    })
    
    
  </script>
  <body>
    <div class="container anidi_services">
      <div class="row">
        <ul class="links">
          <li>
            <a id="room1" title="채팅 1번방">
              <span class="icon"><i class="fa fa-comments"></i></span>
              <span class="text">채팅방 1</span></a
            >
            <div class="clearfix"></div>
          </li>
          <li>
            <a id="room2" title="채팅 2번방">
              <span class="icon"><i class="fa fa-comments"></i></span>
              <span class="text">채팅방 2</span></a
            >
            <div class="clearfix"></div>
          </li>

          <li class="tab-bar">
            <a href="index" class="tab-bar__tab">
              <i class="fa fa-user"></i>
              <span class="tabl-bar_title">친구</span>
            </a>
            <a href="" id="room" class="tab-bar__tab">
              <i class="fa fa-commenting"></i>
              <span class="tab-bar__title">채팅</span>
            </a>
            <a href="" class="tab-bar__tab">
              <i class="fa fa-ellipsis-h"></i>
              <span class="tab-bar__title">더보기</span>
            </a>
             <a href="" id="makeRoom" class="tab-bar__tab">
              <i class="fa fa-plus"></i>
              <span class="tab-bar__title">방만들기</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    
    
      <div class="modal fade" id="roomModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">방만들기</h4>
                  </div>
                  <!-- modal-header -->
                  <div class="modal-body">
               
                      <div class="form-group">
                        <label for="">방이름</label>
                        <input type="text" class="form-control" name="roomName" id="roomName" />
                      </div>
                  </div>
                  <!-- modal-body -->
                  <div class="modal-footer">
                    <button class="btn btn-primary" id="modalRegisterBtn" type="button">만들기</button>
                    <button class="btn btn-info" id="modalCloseBtn" type="button">닫기</button>
                  </div>
                </div>
              </div>
            </div>
    
    
  </body>
</html>
