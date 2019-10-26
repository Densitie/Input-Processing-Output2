/*
 * This is a GUI purchasing program
 * Septembre 21 2019
 */

/**
 *
 * @author arkir7294
 */
public class GUISTORE extends javax.swing.JFrame {

    /**
     * Creates new form GUISTORE
     */
    public GUISTORE() {
        initComponents();
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
        CPU = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        i9 = new javax.swing.JLabel();
        i9price = new javax.swing.JTextField();
        Ryzen9 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        Ryzen7 = new javax.swing.JLabel();
        i7price = new javax.swing.JTextField();
        Ryzen7price = new javax.swing.JTextField();
        Ryzen9price = new javax.swing.JTextField();
        Subtotal = new javax.swing.JLabel();
        HST = new javax.swing.JLabel();
        Final = new javax.swing.JLabel();
        SubtotalText = new javax.swing.JTextField();
        HSTtext = new javax.swing.JTextField();
        FinalText = new javax.swing.JTextField();
        GTX2080 = new javax.swing.JLabel();
        GTX1080 = new javax.swing.JLabel();
        RX5700XT = new javax.swing.JLabel();
        Sapphire = new javax.swing.JLabel();
        RXprice = new javax.swing.JTextField();
        RTXprice = new javax.swing.JTextField();
        GTXprice = new javax.swing.JTextField();
        SapphirePrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Great Purchase CPUS and VIDEO CARDS");

        CPU.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        CPU.setText("CPU");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("VIDEO CARDS");

        i9.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        i9.setText("Intel i9 9900k (638.99$):");

        i9price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i9priceActionPerformed(evt);
            }
        });

        Ryzen9.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Ryzen9.setText("AMD Ryzen 9 3900X (699.99$): ");

        i7.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        i7.setText("Intel i7 9700k (499.99$):");

        Ryzen7.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Ryzen7.setText("AMD Ryzen 7 3700X (529.99$) ");

        i7price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i7priceActionPerformed(evt);
            }
        });

        Ryzen7price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ryzen7priceActionPerformed(evt);
            }
        });

        Ryzen9price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ryzen9priceActionPerformed(evt);
            }
        });

        Subtotal.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Subtotal.setText("Subtotal:");

        HST.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        HST.setText("HST:");

        Final.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Final.setText("Final:");

        SubtotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtotalTextActionPerformed(evt);
            }
        });

        HSTtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSTtextActionPerformed(evt);
            }
        });

        GTX2080.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        GTX2080.setText("NVIDIA RTX 2080Ti 11GB (1 859.99$):");

        GTX1080.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        GTX1080.setText("NVIDIA GTX 1080 Ti 11GB ( 1 789.00$): ");

        RX5700XT.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        RX5700XT.setText("AMD Radeon RX 5700 XT 8GB (549.99$):");

        Sapphire.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Sapphire.setText("AMD SAPPHIRE Radeon VII 16GB (1 566.90$):");

        RTXprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTXpriceActionPerformed(evt);
            }
        });

        GTXprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GTXpriceActionPerformed(evt);
            }
        });

        SapphirePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SapphirePriceActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(CPU, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ryzen9)
                            .addComponent(i7)
                            .addComponent(Ryzen7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ryzen9price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(i9price, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(i7price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                            .addComponent(Ryzen7price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GTX1080)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RX5700XT)
                                    .addComponent(Sapphire))
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GTX2080)
                        .addGap(49, 49, 49)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RXprice)
                    .addComponent(RTXprice)
                    .addComponent(GTXprice)
                    .addComponent(SapphirePrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1)))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Subtotal)
                    .addComponent(HST, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Final, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubtotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FinalText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HSTtext, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i9)
                            .addComponent(i9price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GTX2080)
                            .addComponent(RTXprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i7)
                            .addComponent(i7price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GTX1080)
                            .addComponent(GTXprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ryzen9)
                            .addComponent(Ryzen9price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RX5700XT)
                            .addComponent(RXprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ryzen7)
                            .addComponent(Ryzen7price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sapphire)
                            .addComponent(SapphirePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subtotal)
                            .addComponent(SubtotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HST)
                            .addComponent(HSTtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Final)
                            .addComponent(FinalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 110, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void i9priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i9priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i9priceActionPerformed

    private void i7priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i7priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i7priceActionPerformed

    private void Ryzen7priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ryzen7priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ryzen7priceActionPerformed

    private void Ryzen9priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ryzen9priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ryzen9priceActionPerformed

    private void RTXpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTXpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RTXpriceActionPerformed

    private void GTXpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GTXpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GTXpriceActionPerformed

    private void SapphirePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SapphirePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SapphirePriceActionPerformed

    private void SubtotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubtotalTextActionPerformed

    private void HSTtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSTtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HSTtextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
//      Variable Declaration Area
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        double num6;
        double num7;
        double num8;
        double subtotal;
        double hst;
        double finaltotal;
        
//      Calculator Area
        num1 = Integer.parseInt(i9price.getText());
        num1 = num1 * 638.99;
        
        num2 = Integer.parseInt(i7price.getText());
        num2 = num2 * 499.99;
        
        num3 = Integer.parseInt(Ryzen9price.getText());
        num3 = num3 * 699.99;
        
        num4 = Integer.parseInt(Ryzen7price.getText());
        num4 = num4 * 529.99;
        
        num5 = Integer.parseInt(RTXprice.getText());
        num5 = num5 * 1859.99;
        
        num6 = Integer.parseInt(GTXprice.getText());
        num6 = num6 * 1789;
        
        num7 = Integer.parseInt(SapphirePrice.getText());
        num7 = num7 * 549.99;
        
        num8 = Integer.parseInt(RXprice.getText());
        num8 = num8 * 1566.90;
       
//      Subtotal Calculation
        subtotal = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
        subtotal = Math.round(subtotal);
        SubtotalText.setText(String.valueOf(subtotal));
        
//      HST Calculation  
        hst = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) * 0.13;
        hst = Math.round(hst);
        HSTtext.setText(String.valueOf(hst));
        
//      Final Total Calculation
        finaltotal = subtotal + hst;
        FinalText.setText(String.valueOf(finaltotal));
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUISTORE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISTORE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISTORE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISTORE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISTORE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPU;
    private javax.swing.JLabel Final;
    private javax.swing.JTextField FinalText;
    private javax.swing.JLabel GTX1080;
    private javax.swing.JLabel GTX2080;
    private javax.swing.JTextField GTXprice;
    private javax.swing.JLabel HST;
    private javax.swing.JTextField HSTtext;
    private javax.swing.JTextField RTXprice;
    private javax.swing.JLabel RX5700XT;
    private javax.swing.JTextField RXprice;
    private javax.swing.JLabel Ryzen7;
    private javax.swing.JTextField Ryzen7price;
    private javax.swing.JLabel Ryzen9;
    private javax.swing.JTextField Ryzen9price;
    private javax.swing.JLabel Sapphire;
    private javax.swing.JTextField SapphirePrice;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JTextField SubtotalText;
    private javax.swing.JLabel i7;
    private javax.swing.JTextField i7price;
    private javax.swing.JLabel i9;
    private javax.swing.JTextField i9price;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
