<html>
<head>
<title>Sticky Form</title>
</head>
<body>
<form action="<?php echo $_SERVER['PHP_SELF']?>" METHOD=POST>
<input type=text name=textuname value="<?php if(isset($_POST['txtuname']))echo $_POST['txtuname'];?>">
<br>
<input type=password name=textupass value="<?php if(isset($_POST['txtupass']))echo $_POST['txtupass'];?>">
</br>
<input type=submit value="Login" name=submit>

<?php
if(isset($_POST['submit'])){
  $nm=$_POST['txtuname'];
  $ps=$_POST['txtupass'];
  
  $flag=0;
  if(($nm=="ABC")&&($ps=="ABC")){
      $flag=1;
   }
   if($flag==1)
    echo "Log in validdated";
   else
    echo "usernsmr or passworld "}
