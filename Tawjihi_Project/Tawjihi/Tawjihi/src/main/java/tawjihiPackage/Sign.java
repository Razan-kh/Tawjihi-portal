/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tawjihiPackage;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 *
 * @author HP
 */
public class Sign extends javax.swing.JFrame {

    /**
     * Creates new form Sign
     */
    public Sign() {
        initComponents();
         urlCombo.removeAllItems();
        urlCombo.addItem("Servlet server");
        urlCombo.addItem("PHP server");
        urlCombo.addItem("JSP server");
        password.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signGet = new javax.swing.JButton();
        signPost = new javax.swing.JButton();
        back = new javax.swing.JButton();
        urlCombo = new javax.swing.JComboBox<>();
        URLtextf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("MS PGothic", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        password.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("password");

        signGet.setBackground(new java.awt.Color(255, 255, 255));
        signGet.setText("Sign in get");
        signGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signGetActionPerformed(evt);
            }
        });

        signPost.setBackground(new java.awt.Color(255, 255, 255));
        signPost.setText("Sign in Post");
        signPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signPostActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        urlCombo.setBackground(new java.awt.Color(153, 153, 255));
        urlCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        URLtextf.setText("URL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signPost, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(signGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(urlCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(URLtextf, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(915, 915, 915)
                            .addComponent(back))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URLtextf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signPost, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(signGet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signGetActionPerformed
        signIn_Get();
    }//GEN-LAST:event_signGetActionPerformed

    private void signPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signPostActionPerformed
        signIn_POST();
    }//GEN-LAST:event_signPostActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        frame f=new frame();
        f.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    
    String contentStr = "application/x-www-form-urlencoded";
    public void addParameter(String ps, String vs) {
        if (ps == null || vs == null || ps.length() == 0 || vs.length() == 0) {
            return;
        }
        if (dataStr.length() > 0) {
            dataStr += "&";
        }
        try {
            dataStr += ps + "=" + URLEncoder.encode(vs, "ASCII");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    String dataStr;
     void signIn_POST() {
        dataStr = "";
        OutputStream os;
        InputStream is;
       
      
       String user=username.getText();
       String pass=password.getText();
        addParameter("user", user); 
        addParameter("pass", pass); 
        String urlStr =null;
          
           if(urlCombo.getSelectedIndex()==0)
               urlStr="http://localhost:8084/servletProject0/signIn";
           else if(urlCombo.getSelectedIndex()==1)
                urlStr="http://localhost/Networks2HWS/PhpProject3/logIn.php";
           else if(urlCombo.getSelectedIndex()==2)
                urlStr="http://localhost:8084/servletProject0/signIn.jsp";
           
                
        try {
            URL myURL = new URL(urlStr);
            URLConnection myConn = myURL.openConnection();
            myConn.setDoOutput(true);
            myConn.setDoInput(true);
            myConn.setRequestProperty("Content-Type", contentStr);
            myConn.setUseCaches(false);
            //dataStr = "T1=67&T2=88";
            this.URLtextf.setText("POST: sending to " + urlStr+" data:"+dataStr);
            BufferedOutputStream out = new BufferedOutputStream(myConn.getOutputStream());
            out.write(dataStr.getBytes());//"ACTION=add&NUMPTS=2&DATA=L0001\nL0002");
            out.close();

            //out.close();
            String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
               
                    SS = SS + (char) b;
                };
                
                SS=SS.strip();
               if(SS.equals("authorized++"))
               {
                  
                   gradesInserting frame=new gradesInserting();
                   frame.show();
                   dispose();
                   
               }
          
           
            }
            // this.jTextField1.setText(SS);
            
         catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }
     
      void signIn_Get() {
        DataInputStream dis;
         String urlStr=null; ;
          
           if(urlCombo.getSelectedIndex()==0)
               urlStr="http://localhost:8084/servletProject0/signIn";
           else if(urlCombo.getSelectedIndex()==1)
                urlStr="http://localhost/Networks2HWS/PhpProject3/logIn.php";
           else if(urlCombo.getSelectedIndex()==2)
                urlStr="http://localhost:8084/servletProject0/signIn.jsp";
  /*    urlCombo.addItem("http://localhost/Networks2HWS/phpTawjihi/tawjihi.php");
  
        urlCombo.addItem("http://localhost:8084/servletProject0/tawjihi");
        urlCombo.addItem("http://localhost/Networks2HWS/PhpProject3/index.php");*/
        try {
          
            String user=username.getText();
            String pass=password.getText();
            String str = urlStr+ "?user=" +user+"&pass="+pass;
            URL u = new URL(str);
            this.URLtextf.setText("GET: sending to " + str);

            dis = new DataInputStream(u.openConnection().getInputStream());
           
            int b;
            String t = "";
            String SS = "";

            URLConnection myConn = u.openConnection();
            InputStream is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
              
                    SS = SS + (char) b;
               

            }
            SS=SS.strip();
          if(SS.equals("authorized++"))
               {
                   gradesInserting frame=new gradesInserting();
                   frame.show();
                   dispose();
                   
               }
           

        } catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }
     
    /**
    /**
     * @param args the command line arguments
     */
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField URLtextf;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signGet;
    private javax.swing.JButton signPost;
    private javax.swing.JComboBox<String> urlCombo;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
