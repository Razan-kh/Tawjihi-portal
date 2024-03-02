<%-- 
    Document   : insert
    Created on : Jul 29, 2023, 11:35:49 AM
    Author     : HP
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
      String name = (request.getParameter("name")).toString();
          String gradeString = (request.getParameter("grade")).toString();
           String city = (request.getParameter("city")).toString();
        int gradeInt=Integer.parseInt(gradeString);
         Connection conn = null;
           Statement stmt=null;
             ResultSet rs=null;
           
        try {
          
         Class.forName("com.mysql.cj.jdbc.Driver");


            // Step 2: Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tawjihi", "root", "");
              stmt = conn.createStatement();  
               String insert="INSERT INTO `students`(`name`, `grade`, `city`) VALUES ('"+name+"','"+gradeInt+"','"+city+"')";
              stmt.executeUpdate(insert);
           
            
        }
        
        finally {
            // Step 3: Close the connection in the 'finally' block to release resources
            if (conn != null) {
                try {
                    rs.close();
                  
                    conn.close();
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    %>