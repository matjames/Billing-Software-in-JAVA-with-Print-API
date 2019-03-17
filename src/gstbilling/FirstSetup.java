/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstbilling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Rishabh
 */
public class FirstSetup extends javax.swing.JFrame {

    /**
     * Creates new form FirstSetup
     */
 
    public FirstSetup()  {
        initComponents();
       
        dbname.setText(DbDatabase.getDbname());
        dbuser.setText(DbDatabase.getDbuser());
        dbpass.setText(DbDatabase.getDbpass());
        portnum.setText(DbDatabase.getPort());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dbuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dbpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        dbname = new javax.swing.JTextField();
        portnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        dbuser.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dbuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbuserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setText("Default Database Setting");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel2.setText("Database Name");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel3.setText("Port no");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        dbpass.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel5.setText("Username");

        dbname.setEditable(false);
        dbname.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbnameActionPerformed(evt);
            }
        });

        portnum.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        portnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portnumActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dbname))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dbpass)
                            .addComponent(portnum)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dbuser)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portnum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dbuser)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dbpass)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbuserActionPerformed

    private void dbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbnameActionPerformed

    private void portnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portnumActionPerformed
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:"+DbDatabase.getPort()+"/";

   //  Database credentials
   static final String USER = DbDatabase.getDbuser();
   static final String PASS = DbDatabase.getDbpass();
    public static void funcon() {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
    //  System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
     // System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE if not exists gstseven";
      stmt.executeUpdate(sql);
     // System.out.println("Database created successfully...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
 //  System.out.println("Goodbye!");
}
File f= null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1=portnum.getText()+","+dbuser.getText()+","+dbpass.getText()+","+dbname.getText();
          try {
              
        f = new File("test.txt");
        f.delete();
if(!f.exists())
    f.createNewFile();
        FileOutputStream fos=new FileOutputStream(f);
        String out=s1;
        char[] ch=out.toCharArray();
        for(int i=0;i<ch.length;i++){
            char mm=ch[i];
            fos.write(mm);
        }
        fos.close();
        fos.flush();
        funcon();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
          
         Connection con;
        try {
            con = Connect.connect();
            
             PreparedStatement ps1 =con.prepareStatement("CREATE TABLE IF NOT EXISTS companydetail (companyname varchar(200) DEFAULT NULL,state varchar(200) DEFAULT NULL,registrationtype varchar(200) DEFAULT NULL,gstinnumber varchar(200) DEFAULT NULL,applicablefrom date DEFAULT NULL,pannumber varchar(200) DEFAULT NULL,cinnumber varchar(200) DEFAULT NULL,modifieddate date DEFAULT NULL)");
             PreparedStatement ps2 =con.prepareStatement("INSERT INTO `companydetail` (`companyname`, `state`, `registrationtype`, `gstinnumber`, `applicablefrom`, `pannumber`, `cinnumber`, `modifieddate`) select 'RANA PVT LTD', 'Uttar Pradesh', 'Regular Dealer', 'UIN5330222', '2017-09-18', 'BHOP53347r456', 'id533048', '2018-04-27' from dual where not exists (select companyname from companydetail where companyname='RANA PVT LTD')");
             PreparedStatement ps3 =con.prepareStatement("CREATE TABLE IF NOT EXISTS `invoicecustomer` (`sno` int(11) NOT NULL AUTO_INCREMENT,`invoiceno` varchar(100) NOT NULL,`customername` varchar(200) DEFAULT NULL,`aadharno` varchar(200) DEFAULT NULL,`phoneno` varchar(200) DEFAULT NULL,`emailid` varchar(200) DEFAULT NULL,`invoicedeclaredby` varchar(200) NOT NULL,PRIMARY KEY (`sno`),UNIQUE KEY `invoiceno` (`invoiceno`))");
            PreparedStatement ps4 =con.prepareStatement("INSERT INTO `invoicecustomer` (`sno`, `invoiceno`, `customername`, `aadharno`, `phoneno`, `emailid`, `invoicedeclaredby`) select 1, 'INV2018001', 'rishabh', '123456789012', '8933840842', 'ri@gmail.com', 'mohit' from dual where not exists (select sno from invoicecustomer where sno='1')");
          PreparedStatement ps5 =con.prepareStatement("CREATE TABLE IF NOT EXISTS `invoicedata` (`sno` varchar(500),`productname` varchar(200) DEFAULT NULL,`invoiceno` varchar(100) NOT NULL,`price` varchar(200) DEFAULT NULL,`cgst` varchar(200) DEFAULT NULL,`sgst` varchar(200) DEFAULT NULL,`igst` varchar(200) DEFAULT NULL,`amount` varchar(200) DEFAULT NULL,`unit` varchar(10) DEFAULT NULL,`quantity` int(5) DEFAULT NULL,`discount` varchar(50) DEFAULT NULL)");
           PreparedStatement ps6 =con.prepareStatement("INSERT INTO `invoicedata` (`sno`, `productname`, `invoiceno`, `price`, `cgst`, `sgst`, `igst`, `amount`, `unit`, `quantity`, `discount`) select '1', 'liquer', 'INV2018001', '1500', '45.0', '45.0', '45.0', '4500.0', 'Meter', 3, NULL from dual where not exists (select sno from invoicedata where sno='1')");
           PreparedStatement ps7 =con.prepareStatement("INSERT INTO `invoicedata` (`sno`, `productname`, `invoiceno`, `price`, `cgst`, `sgst`, `igst`, `amount`, `unit`, `quantity`, `discount`) select '2', 'apple', 'INV2018001', '40', '3.6', '4.8', '4.8', '120.0', 'Piece', 3, NULL from dual where not exists (select sno from invoicedata where sno='2')");
          PreparedStatement ps8 =con.prepareStatement("CREATE TABLE IF NOT EXISTS `login` (`sno` int(11) NOT NULL primary key auto_increment ,`username` varchar(100) NOT NULL unique,`password` varchar(2000) DEFAULT NULL,`name` varchar(100) DEFAULT NULL,`role` enum('Admin','Employee') DEFAULT NULL,`email` varchar(200) NOT NULL unique,`modified_date` date DEFAULT NULL)");
           PreparedStatement ps9 =con.prepareStatement("INSERT INTO `login` (`sno`, `username`, `password`, `name`, `role`, `email`, `modified_date`) select 1, 'rishabh', 'bb7461ccc2d9d0010d16a129775151c858304975', 'rishabh', 'Admin', 'rishabhjaishwal7@gmail.com', '2017-11-17' from dual where not exists (select username from login where username='rishabh')");
           PreparedStatement ps10 =con.prepareStatement("CREATE TABLE IF NOT EXISTS `productcreated` (`sno` int(11) NOT NULL AUTO_INCREMENT,`productid` varchar(200) NOT NULL,`productname` varchar(200) DEFAULT NULL,`Hsnnumber` varchar(500) DEFAULT NULL,`productdescibe` varchar(600) DEFAULT NULL,`isgst` enum('Yes','No') DEFAULT NULL,`natureoftransac` varchar(300) DEFAULT NULL,`price` int(11) NOT NULL,`igstper` int(11) DEFAULT NULL,`cgstper` int(11) DEFAULT NULL,`sgstper` int(11) DEFAULT NULL,`producttype` enum('Goods','Service') DEFAULT NULL,`modifieddate` date DEFAULT NULL,PRIMARY KEY (`sno`),UNIQUE KEY `productid` (`productid`))");
          PreparedStatement ps11 =con.prepareStatement("INSERT INTO `login` (`sno`, `username`, `password`, `name`, `role`, `email`, `modified_date`) select 2, 'ravi', 'aa153b5d1fcb55096034df7a27565f4297f195d2', 'ravi', 'Employee', 'ravikr@gmail.com', '2017-11-17' from dual where not exists (select username from login where username='ravi')");
              PreparedStatement ps12 =con.prepareStatement("INSERT INTO `login` (`sno`, `username`, `password`, `name`, `role`, `email`, `modified_date`) select 3, 'mohit', 'a9b249127ecbd1cdf6c8d203151427a50053d4f3', 'mohit', 'Employee', 'mohit97@gmail.com', '2017-11-18' from dual where not exists (select username from login where username='mohit')");
             PreparedStatement ps13 =con.prepareStatement("INSERT INTO `login` (`sno`, `username`, `password`, `name`, `role`, `email`, `modified_date`) select 4,'karan', '356a192b7913b04c54574d18c28d46e6395428ab', 'karan', 'Admin', 'karan@gmail.com', '2017-11-19' from dual where not exists (select username from login where username='karan')");
          PreparedStatement ps14 =con.prepareStatement("INSERT INTO `productcreated` (`sno`, `productid`, `productname`, `Hsnnumber`, `productdescibe`, `isgst`, `natureoftransac`, `price`, `igstper`, `cgstper`, `sgstper`, `producttype`, `modifieddate`) select 1, 'prod1534', 'sugar', '29400000', 'Sugars Chemically Pure Other Than Sucrose Lactose Maltose Glucose And Fructose', 'Yes', 'Sales Taxable', 38, 0, 9, 9, 'Goods', '2017-11-18' from dual where not exists (select productid from productcreated where productid='prod1534')");
         PreparedStatement ps15 =con.prepareStatement("INSERT INTO `productcreated` (`sno`, `productid`, `productname`, `Hsnnumber`, `productdescibe`, `isgst`, `natureoftransac`, `price`, `igstper`, `cgstper`, `sgstper`, `producttype`, `modifieddate`) select 2, 'prod14525', 'liquer', '164141dd', 'alchohal', 'Yes', 'Nill Sales', 1500, 1, 1, 1, 'Goods', '2017-11-18' from dual where not exists (select productid from productcreated where productid='prod14525')");
         PreparedStatement ps16 =con.prepareStatement("INSERT INTO `productcreated` (`sno`, `productid`, `productname`, `Hsnnumber`, `productdescibe`, `isgst`, `natureoftransac`, `price`, `igstper`, `cgstper`, `sgstper`, `producttype`, `modifieddate`) select 3, 'prodapple', 'apple', 'ndjb15', 'mkn', NULL, 'Sales Taxable', 40, 1, 3, 4, 'Goods', '2018-04-10' from dual where not exists (select productid from productcreated where productid='prodapple')");
           ps1.executeUpdate();
           ps3.executeUpdate();
           ps5.executeUpdate();
           ps8.executeUpdate();
           ps10.executeUpdate();
           ps2.execute();
           ps4.execute();
          ps6.execute();
          ps7.execute();
          ps9.execute();
          ps10.execute();
          ps11.execute();
          ps12.execute();
          ps13.execute();
          ps14.execute();
          ps15.execute();
           ps16.execute();
          JOptionPane.showMessageDialog(this, "Successfully Updated and tables created","Information Message",JOptionPane.INFORMATION_MESSAGE); 
        } catch (Exception ex) {
            Logger.getLogger(FirstSetup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Successfully updated please restart software","Information Message",JOptionPane.INFORMATION_MESSAGE);
        }
           
           
          
          
          
          
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dbname;
    private javax.swing.JPasswordField dbpass;
    private javax.swing.JTextField dbuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField portnum;
    // End of variables declaration//GEN-END:variables
}
