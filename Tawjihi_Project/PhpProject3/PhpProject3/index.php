<?php
$city =$_REQUEST["city"];
//$city="Nablus";
//$city = mysqli_real_escape_string($conn, $city);
$server="localhost";
$DBname="tawjihi";
$username="root";
$pass="";
$conn= new  mysqli($server,$username,$pass,$DBname);
 if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}
$sql = "SELECT * FROM `students` ORDER BY grade DESC";
$result = $conn->query($sql);
$topGrades="";
if ($result->num_rows >=3) {

  for($i=0;$i<=2;$i++){
      $row = $result->fetch_assoc();
    $topGrades.= $row['name'].",". $row['grade'].",". $row['city'].",";
  }
  
} else {
 $topGrades="noTop";
}
$result->close();

$PalSuccess=0;
         $PalFail=0;
         $PalAvg=0.0;
         $Palsum=0.0;
         $palNum=0;
$sql1 = "SELECT * FROM `students` ORDER BY grade DESC";
$result1 = $conn->query($sql1);

while($row=$result1->fetch_assoc())
{
    $g=$row["grade"];
     if($g>=50)
    $PalSuccess++;
    else if($g<50)
    $PalFail++;
             $Palsum+=$g;
             $palNum++;
}
$result1->close();
//DecimalFormat df = new DecimalFormat("0.00");
           $PalAvg=$Palsum/$palNum;

 $sql2="SELECT * FROM `students`";
$result2 = $conn->query($sql2);
  $numsuccess=0;
        $numfail=0;
         $sum=0;
        $num=0;
        while ($row=$result2->fetch_assoc())
        {
            $c=$row["city"];
            if($c==$city)
            {
                $g=$row["grade"];
                if($g>=50)
                $numsuccess++;
                else if($g<50)
                 $numfail++; 
                
                    $sum+=$g;
                    $num++;
            }//if
            
        }
        if($num !=0)
        $avg=(float)$sum/$num;
        else $avg=0;
    /*    $result2->close();

         $sql3="SELECT grade FROM `students` where city= ? AND grade <'50'";
          $result3=$conn->prepare($sql3);
                $result3->execute([$city]); 
        $numfail=0;
        $numfail=$result3->num_rows();
       /* while (cityGrades.next())
        {
          $numfail++;
        }
        $result3->close();
         $sql4="SELECT grade FROM `students` where city= ?";
           $result4=$conn->prepare($sql4);
           $result4=$result4->execute([$city]);
        $sum=0;
        $num=0;
      /*  while ($row=$result4->fetch_object())
        {
            $sum+=$row['grade'];
             $num++;
        }*/
      //  $result4->close();
      //  $avg=(float)sum/num;
     // $avg=0;
        if($city=="Palestine")
        {
            echo $PalSuccess.",".$PalFail.",".$topGrades.$PalAvg;
        }
        else
            echo $numsuccess.",".$numfail.",".$topGrades.$avg;
            
       
mysqli_close($conn);
?>
