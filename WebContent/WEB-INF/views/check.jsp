<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flames Calculator</title>
<link rel="stylesheet" href="./assets/style.css">
</head>
<body class="mainpage">

<main class="main">
<header>
<img class="logo" src="./assets/Logo.svg" alt="logo"></img>
<div class="title">FLAMES</div>
</header>
<div class="content">
Want To Know The Relationship Between You And Your Crush?
</div>
<div class="content-small">
Find it out with FLAMES
</div>
 <div class="myform">
     <form method="post" action="${pageContext.request.contextPath}/flames">
      <div class="textbox-1">
      	
        <input type="text" placeholder="Enter your name" name="your" required>
        <img class="bg-image" src="./assets/User symbol.svg"><img>
       </div>
        <div class="textbox-2">
          <input class="bg-image" type="text" class="form-control" placeholder="Enter your crush's name" name="crush" required>
           <img class="bg-image" src="./assets/User symbol.svg"><img>
        </div>
        <button type="submit" class="button">FLAME IT UP</button>
  </form>
 </div>

</div> 
 </main>

<footer class="footer"><p class="footer-text">Made with <img src="./assets/prograd-heart.svg"> by ProGrad</p></footer>
</body>
</html>
