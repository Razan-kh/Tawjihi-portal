/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/tawjihi"})
public class tawjihi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
          String city = (request.getParameter("city")).toString();
         Connection conn = null;
           Statement stmt=null;
             ResultSet rs=null;
             ResultSet cityGrades=null;
              ResultSet rs1=null;
        try (PrintWriter out = response.getWriter()) {
           // Class.forName("com.mysql.cj.jdbc.Driver");
         Class.forName("com.mysql.cj.jdbc.Driver");


            // Step 2: Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tawjihi", "root", "");
              stmt = conn.createStatement();  
              rs = stmt.executeQuery("SELECT * FROM `students` ORDER BY grade DESC;");
       
       ArrayList<String> names = new ArrayList<String>();  
       ArrayList<Integer> grades = new ArrayList<Integer>();  
       ArrayList<String> cities = new ArrayList<String>();  
      while(rs.next())
      {
         names.add(rs.getString("name"));
         grades.add(rs.getInt("grade"));
          cities.add(rs.getString("city"));
      }
 
         String topGrades=names.get(0)+","+grades.get(0)+","+cities.get(0)+","
                   +names.get(1)+","+grades.get(1)+","+cities.get(1)+","
                   +names.get(2)+","+grades.get(2)+","+cities.get(2);
         rs1=stmt.executeQuery("SELECT * FROM `students` ORDER BY grade DESC;");
         int PalSuccess=0;
         int PalFail=0;
         float PalAvg=0;
         float Palsum=0;
         int palNum=0;
         while(rs1.next())
         {
             
             if(rs1.getInt("grade")>=50)
                 PalSuccess++;
             else if(rs1.getInt("grade")<50)
                 PalFail++;
             Palsum+=rs1.getInt("grade");
             palNum++;
         }
          DecimalFormat df = new DecimalFormat("0.00");
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
        int numfail=0;
        while (cityGrades.next())
        {
          numfail++;
        }
         String s2="SELECT grade FROM `students` where city='"+city+"'";
           cityGrades=stmt.executeQuery(s2);
        int sum=0;
        int num=0;
        while (cityGrades.next())
        {
            sum+=cityGrades.getInt("grade");
          num++;
        }
       
        float avg=(float)sum/num;
      
        if(city.equals("Palestine"))
        {
            out.print(PalSuccess+","+PalFail+","+topGrades+","+ df.format(PalAvg));
        }
        else
            out.print(numsuccess+","+numfail+","+topGrades+","+ df.format(avg));
            
        }
        finally {
            // Step 3: Close the connection in the 'finally' block to release resources
            if (conn != null) {
                try {
                    rs.close();
                   cityGrades.close();
                    conn.close();
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(tawjihi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tawjihi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(tawjihi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tawjihi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
