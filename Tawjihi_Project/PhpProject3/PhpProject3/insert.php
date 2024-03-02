<?php

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */


$name=$_REQUEST["name"];
$gradeString=$_REQUEST["grade"];
$city=$_REQUEST["city"];
$gradeInt= (int)$gradeString ;
 
       
$server="localhost";
$DBname="tawjihi";
$username="root";
$pass="";
$conn= new  mysqli($server,$username,$pass,$DBname);
 if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}
/*
$stmt = $conn->prepare("INSERT INTO `students`(name, grade, city) VALUES (?, ?, ? )");
$stmt->bind_param("sis", $name, $grade, $city);
$stmt->execute();
 * */
/*
$sql = "INSERT INTO `students`(name, grade, city) VALUES  ('".$name."', '".$grade."', '".$city."')";

$conn->query($sql);
*/
    $sql="INSERT INTO `students`(name,grade,city) VALUES ('$name','$gradeInt','$city')";
    $result=mysqli_query($conn,$sql);
$conn->close();
?>