<?php

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */

$user =$_REQUEST["user"];
$pass1 =$_REQUEST["pass"];

$server="localhost";
$DBname="tawjihi";
$username="root";
$pass="";
$conn= new  mysqli($server,$username,$pass,$DBname);
 if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}
$sql = "SELECT * FROM `authorized` WHERE 1";
$result = $conn->query($sql);

while($row=$result->fetch_object())
{   

    if($row->username == $user && $row->password == $pass1)
        echo "authorized++";
    
}
$result->close();
?>