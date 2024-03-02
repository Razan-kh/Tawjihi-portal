<%-- 
    Document   : signIn
    Created on : Jul 28, 2023, 6:48:17 PM
    Author     : HP
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String user;%>
<%! String pass;%>
<%! Connection conn = null;
Statement stmt=null;
ResultSet rs=null;
%>
<%
   user = (request.getParameter("user")).toString();
           pass = (request.getParameter("pass")).toString();
      
             try{
          
         Class.forName("com.mysql.cj.jdbc.Driver");
 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tawjihi", "root", "");
              stmt = conn.createStatement();  
               String query="SELECT * FROM `authorized` WHERE 1";
            rs=  stmt.executeQuery(query);
              while(rs.next())
              {
                  if(rs.getString("username").equals(user)&&rs.getString("password").equals(pass))
                  {
                      out.print("authorized++");
                      break;
                  }
              }
            
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