/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class existingbike extends javax.swing.JFrame {
    int id;
    /**
     * Creates new form existingbike
     */
    public existingbike() {
        initComponents();
         fillCombo();
       
    }
    Connection con;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bikename = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spare = new javax.swing.JTextField();
        purchaseprice = new javax.swing.JTextField();
        sellingprice = new javax.swing.JTextField();
        qnty = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        purchaseprice1 = new javax.swing.JTextField();
        sellingprice1 = new javax.swing.JTextField();
        qnty1 = new javax.swing.JTextField();
        click = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(252, 118, 118));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 430));

        jLabel1.setText("SELECT BIKE");

        bikename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikenameActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(252, 118, 118));

        jLabel2.setText("SPARE PART NAME");

        jLabel3.setText("PURCHASE PRICE");

        jLabel4.setText("SELLING PRICE");

        jLabel5.setText("QUANTITY");

        spare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spareActionPerformed(evt);
            }
        });
        spare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spareKeyTyped(evt);
            }
        });

        purchaseprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                purchasepriceKeyTyped(evt);
            }
        });

        sellingprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingpriceKeyTyped(evt);
            }
        });

        qnty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qntyKeyTyped(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spare, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(purchaseprice)
                                        .addComponent(sellingprice, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(purchaseprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("new spare part", jPanel3);

        jPanel5.setBackground(new java.awt.Color(252, 118, 118));

        jLabel6.setText("select spare part");

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jLabel7.setText("PURCHASE PRICE");

        jLabel8.setText("SELLING PRICE");

        jLabel9.setText("QUANTITY");

        jButton3.setText("submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        purchaseprice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseprice1ActionPerformed(evt);
            }
        });
        purchaseprice1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                purchaseprice1KeyTyped(evt);
            }
        });

        sellingprice1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingprice1KeyTyped(evt);
            }
        });

        qnty1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qnty1KeyTyped(evt);
            }
        });

        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qnty1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(23, 23, 23)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(purchaseprice1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(sellingprice1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(32, 32, 32)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(click, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(purchaseprice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sellingprice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(qnty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("existing spare part", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(bikename, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bikename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             getcon1();
        String bknm=bikename.getSelectedItem().toString();
         
        String sparepart=spare.getText();
        String pp=purchaseprice.getText();
        String sp=sellingprice.getText();
        String q=qnty.getText();
       
        
       
         PreparedStatement st;
        
        String query="select id from bikemodel where name='"+bknm+"'";
         try {
             st=con.prepareStatement(query);
             ResultSet rs=st.executeQuery();
             rs.next();
             id=rs.getInt(1);
           
         } catch (SQLException ex) {
             Logger.getLogger(newbike.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         String qwer="insert into spareparts(name,bike_id,bp,sp,qnty) values(?,?,?,?,?) ";
         try {
             st=con.prepareStatement(qwer);
              st.setString(1,sparepart);
              st.setInt(2, id);
              st.setString(3,pp);
              st.setString(4, sp);
              st.setString(5, q);
              st.executeUpdate();
               con.close();
         } catch (Exception ex) {
             System.out.println("error");
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void spareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spareActionPerformed
        
        
        
    }//GEN-LAST:event_spareActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
              getcon1();
               
        String bknm=bikename.getSelectedItem().toString();
        String sparepart=cb1.getSelectedItem().toString();
        String pp=purchaseprice1.getText();
        String sp=sellingprice1.getText();
        String q=qnty1.getText();
       
         PreparedStatement qst;
        
        String query="select id from bikemodel where name='"+bknm+"'";
         try {
             qst=con.prepareStatement(query);
             ResultSet rs=qst.executeQuery();
             rs.next();
             id=rs.getInt(1);
           
         } catch (SQLException ex) {
             Logger.getLogger(newbike.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
         String qwer="update spareparts set bp=?,sp=?,qnty=? where name='"+sparepart+"'";
         try {
             qst=con.prepareStatement(qwer);
              qst.setString(1,sparepart);
              qst.setString(1, pp);
              qst.setString(2,sp);
              qst.setString(3,q );
             
              qst.executeUpdate();
         } catch (Exception ex) {
             System.out.println("oops");
         }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
     
                

    }//GEN-LAST:event_cb1ActionPerformed

    private void bikenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikenameActionPerformed
        
        String biken=bikename.getSelectedItem().toString();
        System.out.println(biken);
        String quer="select id from bikemodel where name='"+biken+"'";
        int rid = 0;
        Automobile az=new Automobile();
        
        az.getcon();
         try {
             az.st=az.con.prepareStatement(quer);
             ResultSet rs=az.st.executeQuery(quer);
             rs.next();
             rid=rs.getInt(1);
             System.out.println(rid);
           
         } catch (SQLException ex) {
             Logger.getLogger(newbike.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        
        String qaz="select * from spareparts where bike_id="+rid;
           
         try {
                cb1.removeAllItems();
               Automobile am=new Automobile();
               am.getcon();
               
               ResultSet rs=am.st.executeQuery(qaz);
              
              
               while(rs.next())
               {
                   String name=rs.getString("name");
                  
                   System.out.println(name);
                   cb1.addItem(name);
               }    
         } catch (SQLException ex) {
             Logger.getLogger(newbike.class.getName()).log(Level.SEVERE, null, ex);
         }
         
      
    }//GEN-LAST:event_bikenameActionPerformed

    private void purchaseprice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseprice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseprice1ActionPerformed

    private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
        
        
        int tp = 0,p,r = 0;
         String sparepart=cb1.getSelectedItem().toString();
         String biken=bikename.getSelectedItem().toString();
         String ws = null;
        
        Automobile a=new Automobile();
        a.getcon();
        String i="select * from bikemodel where name='"+biken+"'";
        try {
            a.st=a.con.createStatement();
             ResultSet rq=a.st.executeQuery(i);
             rq.next();
             ws=rq.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(existingbike.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        a.getcon();
        String er="select * from spareparts where name='"+sparepart+"' and bike_id="+ws;
        try {
            a.st=a.con.createStatement();
            ResultSet rs=a.st.executeQuery(er);
            rs.next();
            tp=rs.getInt(4);
            p=rs.getInt(5);
            r=rs.getInt(6);
            String s=""+tp+"";
            String q=""+p+"";
            String t=""+r+"";
            
            purchaseprice1.setText(s);
            sellingprice1.setText(q);
            qnty1.setText(t);
            
        } catch (SQLException ex) {
            Logger.getLogger(existingbike.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_clickActionPerformed

    private void spareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spareKeyTyped
        
          char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_spareKeyTyped

    private void purchasepriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchasepriceKeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_purchasepriceKeyTyped

    private void sellingpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingpriceKeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_sellingpriceKeyTyped

    private void qntyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntyKeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_qntyKeyTyped

    private void purchaseprice1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchaseprice1KeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_purchaseprice1KeyTyped

    private void sellingprice1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingprice1KeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_sellingprice1KeyTyped

    private void qnty1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qnty1KeyTyped
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_qnty1KeyTyped

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
            java.util.logging.Logger.getLogger(existingbike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(existingbike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(existingbike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(existingbike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new existingbike().setVisible(true);
            }
        });
    }
     public Connection getcon1() 
    { 
         
       
       
        try{
        String url="jdbc:mysql://localhost:3306/dbms";
        String user="root";
        String password="Rahul@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url, user, password);
        
      
        }
        catch(Exception e)
        {
            System.err.println("connection not established");
        }
         return null;
    }
      public void fillCombo(){
           String qaz="select * from bikemodel";
           
         try {
               Automobile am=new Automobile();
               am.getcon();
               
               ResultSet rs=am.st.executeQuery(qaz);
               while(rs.next())
               {
                   String name=rs.getString("name");
                  
                   bikename.addItem(name);
               }  
               am.con.close();
         } catch (SQLException ex) {
             Logger.getLogger(newbike.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bikename;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton click;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField purchaseprice;
    private javax.swing.JTextField purchaseprice1;
    private javax.swing.JTextField qnty;
    private javax.swing.JTextField qnty1;
    private javax.swing.JTextField sellingprice;
    private javax.swing.JTextField sellingprice1;
    private javax.swing.JTextField spare;
    // End of variables declaration//GEN-END:variables
}
