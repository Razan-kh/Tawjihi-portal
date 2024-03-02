<%-- 
    Document   : statistics
    Created on : Jul 28, 2023, 4:21:23 PM
    Author     : HP
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%> 
 <%@page import="java.sql.SQLException" %>
 <%@ page import="java.sql.*" %>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.sql.DriverManager"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%! String city ; %>
<%! Connection conn ; %>
<%! Statement stmt;%>
<%! ResultSet rs;%>
<%! ResultSet rs1;%>
<%! ArrayList<String> names = new ArrayList<>(); %> 
<%! ArrayList<Integer> grades = new ArrayList<>();%>
<%! ArrayList<String> cities = new ArrayList<>(); %>
<%!  String topGrades;%>
<%!int PalSuccess=0 ;%> 
<%!int PalFail=0;%> 
<%!float PalAvg=0;%> 
<%!float Palsum=0;%> 
<%!int palNum=0;%> 
<%!DecimalFormat df=new DecimalFormat("#0.00");%>
<%! ResultSet cityGrades;%>
<%!int numfail;%>
<%! int sum=0;%>
<%! int num=0;%>
<%!float avg=0;%>
 <%
            city= request.getParameter("city");
          
            %>
            
        <%
             try {
         
         Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tawjihi", "root", "");
              stmt = conn.createStatement();  
              rs = stmt.executeQuery("SELECT * FROM `students` ORDER BY grade DESC;");
              
            
          
             while(rs.next())
      {
         names.add(rs.getString("name"));
         grades.add(rs.getInt("grade"));
          cities.add(rs.getString("city"));
      }
 
          topGrades=names.get(0)+","+grades.get(0)+","+cities.get(0)+","
                   +names.get(1)+","+grades.get(1)+","+cities.get(1)+","
                   +names.get(2)+","+grades.get(2)+","+cities.get(2);
                   rs1=stmt.executeQuery("SELECT * FROM `students` ORDER BY grade DESC;");
      
         while(rs1.next())
         {
             
             if(rs1.getInt("grade")>=50)
                 PalSuccess++;
             else if(rs1.getInt("grade")<50)
                 PalFail++;
             Palsum+=rs1.getInt("grade");
             palNum++;
         }
        
           PalAvg=Palsum/palNum;

       String s="SELECT grade FROM `students` where city='"+city+"' AND grade >='50'";
           cityGrades=stmt.executeQuery(s);
        int numsuccess=0;
        while (cityGrades.next())
        {
            numsuccess++;
        }
         String s1="SELECT grade FROM `students` where city='"+city+"' AND grade <'50'";
           cityGrades=stmt.executeQuery(s1);
           
         numfail=0;
        while (cityGrades.next())
        {
          numfail++;
        }
         String s2="SELECT grade FROM `students` where city='"+city+"'";
           cityGrades=stmt.executeQuery(s2);
         sum=0;
         num=0;
        while (cityGrades.next())
        {
            sum+=cityGrades.getInt("grade");
          num++;
        }
       
         avg=(float)sum/num;
      
        if(city.equals("Palestine"))
        {
            out.print(PalSuccess+","+PalFail+","+topGrades+","+ df.format(PalAvg));
        }
        else
            out.print(numsuccess+","+numfail+","+topGrades+","+df.format(avg));
            
       
            }//try
           catch(Exception e)
            {
            e.printStackTrace();
            }
            
            %>
            
 