/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.diagonal;


import java.util.List;

/**
 *
 * @author Elkin
 */
public class Panel extends javax.swing.JFrame {

    /**
     * variables
     */
    String num1 = "";
    String num = "";
    int count = 0;
    Interfaz general = new Interfaz();
    public Panel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     
    private void acumuladorNumeros(String num)
    {   
        num1 += num;
        if (count == 0)
        {
            txt1.setText(num1);
        }
        else if (count == 1)
        {
            
            txt1.setEditable(false);
            txt1.setEnabled(false);
            
            txt2.setText(num1);
        }
        else if (count == 2)
        {
            
            txt2.setEditable(false);
            txt2.setEnabled(false);
            
            txt3.setText(num1);
        }
        else if (count == 3)
        {
            
            txt3.setEditable(false);
            txt3.setEnabled(false);
            
            txt4.setText(num1);
        }
        else if (count == 4)
        {
            txt4.setEditable(false);
            txt4.setEnabled(false);
            
            txt5.setText(num1);
        }
        else if (count == 5)
        {
            txt5.setEditable(false);
            txt5.setEnabled(false);
            
            txt6.setText(num1);
        }
        else if (count == 6)
        {
            txt6.setEditable(false);
            txt6.setEnabled(false);
            
            txt7.setText(num1);
        }
        else if (count == 7)
        {
            txt7.setEditable(false);
            txt7.setEnabled(false);
            
            txt8.setText(num1);
        }
        else if (count == 8)
        {
            txt8.setEditable(false);
            txt8.setEnabled(false);
            
            txt9.setText(num1);
        }
        /*else
        {
            txt9.setEditable(false);
            txt9.setEnabled(false);
        }*/
        
    }
    
    private void restart()
    {
        txt1.setEnabled(true);
        txt1.setEditable(true);
        txt1.setText("");
        txt2.setEnabled(true);
        txt2.setEditable(true);
        txt2.setText("");
        txt3.setEnabled(true);
        txt3.setEditable(true);
        txt3.setText("");
        txt4.setEnabled(true);
        txt4.setEditable(true);
        txt4.setText("");
        txt5.setEnabled(true);
        txt5.setEditable(true);
        txt5.setText("");
        txt6.setEnabled(true);
        txt6.setEditable(true);
        txt6.setText("");
        txt7.setEnabled(true);
        txt7.setEditable(true);
        txt7.setText("");
        txt8.setEnabled(true);
        txt8.setEditable(true);
        txt8.setText("");
        txt9.setEnabled(true);
        txt9.setEditable(true);
        txt9.setText("");
        
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
        But1 = new javax.swing.JButton();
        But2 = new javax.swing.JButton();
        But3 = new javax.swing.JButton();
        But4 = new javax.swing.JButton();
        But5 = new javax.swing.JButton();
        But6 = new javax.swing.JButton();
        But7 = new javax.swing.JButton();
        But8 = new javax.swing.JButton();
        But9 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        But0 = new javax.swing.JButton();
        result = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        But1.setText("1");
        But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But1ActionPerformed(evt);
            }
        });

        But2.setText("2");
        But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But2ActionPerformed(evt);
            }
        });

        But3.setText("3");
        But3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But3ActionPerformed(evt);
            }
        });

        But4.setText("4");
        But4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But4ActionPerformed(evt);
            }
        });

        But5.setText("5");
        But5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But5ActionPerformed(evt);
            }
        });

        But6.setText("6");
        But6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But6ActionPerformed(evt);
            }
        });

        But7.setText("7");
        But7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But7ActionPerformed(evt);
            }
        });

        But8.setText("8");
        But8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But8ActionPerformed(evt);
            }
        });

        But9.setText("9");
        But9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But9ActionPerformed(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jLabel1.setText("El resultado de la suma es:");

        But0.setText("0");
        But0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But0ActionPerformed(evt);
            }
        });

        result.setText("RESULTADO");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        jButton1.setText("NEXT");
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
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(result))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(But0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(But4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(But5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(But6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(But2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt2)
                                        .addComponent(txt5)
                                        .addComponent(txt8))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(But3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt3)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(But7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(But8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(But9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But1)
                    .addComponent(But2)
                    .addComponent(But3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But4)
                    .addComponent(But5)
                    .addComponent(But6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But7)
                    .addComponent(But8)
                    .addComponent(But9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(But0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But1ActionPerformed
  
        String uno = "1";
        general.setUno(uno);
        num = general.getUno();
        acumuladorNumeros(num);
        
    }//GEN-LAST:event_But1ActionPerformed

    private void But0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But0ActionPerformed
        String cero = "0";
        general.setCero(cero);
        num = general.getCero();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But0ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
 
    }//GEN-LAST:event_txt1ActionPerformed

    private void But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But2ActionPerformed
        String dos = "2";
        general.setDos(dos);
        num = general.getDos();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But2ActionPerformed

    private void But3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But3ActionPerformed
        String tres= "3";
        general.setTres(tres);
        num = general.getTres();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But3ActionPerformed

    private void But4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But4ActionPerformed
        String cuatro="4";
        general.setCuatro(cuatro);
        num = general.getCuatro();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But4ActionPerformed

    private void But5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But5ActionPerformed
        String cinco = "5";
        general.setCinco(cinco);
        num = general.getCinco();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But5ActionPerformed

    private void But6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But6ActionPerformed
        String seis = "6";
        general.setSeis(seis);
        num = general.getSeis();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But6ActionPerformed

    private void But7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But7ActionPerformed
        String siete = "7";
        general.setSiete(siete);
        num = general.getSiete();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But7ActionPerformed

    private void But8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But8ActionPerformed
        String ocho = "8";
        general.setOcho(ocho);
        num = general.getOcho();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But8ActionPerformed

    private void But9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But9ActionPerformed
        String nueve = "9";
        general.setNueve(nueve);
        num = general.getNueve();
        acumuladorNumeros(num);
    }//GEN-LAST:event_But9ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        //variables -------------------------------
        List unificada;
        int  caja1,caja2,caja3,caja4,caja5,caja6,caja7,caja8,caja9;
        //lectura de cajas de texto---------------------
        //se convierten en enteros
        caja1 = Integer.parseInt(txt1.getText());
        caja2 = Integer.parseInt(txt2.getText());
        caja3 = Integer.parseInt(txt3.getText());
        caja4 = Integer.parseInt(txt4.getText());
        caja5 = Integer.parseInt(txt5.getText());
        caja6 = Integer.parseInt(txt6.getText());
        caja7 = Integer.parseInt(txt7.getText());
        caja8 = Integer.parseInt(txt8.getText());
        caja9 = Integer.parseInt(txt9.getText());
        
        
        //se crea un objeto de la clase ValoresDeTexto para enviar valores alli
        ValoresDeTexto value = new ValoresDeTexto();
        value.setCaja1(caja1);
        value.setCaja2(caja2);
        value.setCaja3(caja3);
        value.setCaja4(caja4);
        value.setCaja5(caja5);
        value.setCaja6(caja6);
        value.setCaja7(caja7);
        value.setCaja8(caja8);
        value.setCaja9(caja9);
        
        //se crea un objeto llamado arr, que es donde se van almacenar los datos
//de los vectores        
        ListadeArrays arr = new ListadeArrays();
        //se llaman las entradas de cada uno de los valores de los vectores
        arr.setInput(value.getCaja1());
        arr.setInput2(value.getCaja2());
        arr.setInput3(value.getCaja3());
        arr.setInput4(value.getCaja4());
        arr.setInput5(value.getCaja5());
        arr.setInput6(value.getCaja6());
        arr.setInput7(value.getCaja7());
        arr.setInput8(value.getCaja8());
        arr.setInput9(value.getCaja9());
        
        //se arma la lista de lista donde esta la matriz 3x3
        unificada  = arr.arr();
        //se llama un objeto de la clase SumaCua donde va hacer la suma diagonal
        SumaCua diagonal =  new SumaCua(unificada);
        diagonal.Diagonal();
        
        //resultado de la suma diagonal
        int r = diagonal.getR();
        System.out.println(r);
        String rr;
        rr = String.valueOf(r);
        txtresult.setText(rr);
        restart();
        
        
    }//GEN-LAST:event_resultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        count += 1;
        if (count <10){
            num1 = "";
            acumuladorNumeros("");
            System.out.println(count);
        }
        else 
        {
            
            count = 0;
           
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton But0;
    private javax.swing.JButton But1;
    private javax.swing.JButton But2;
    private javax.swing.JButton But3;
    private javax.swing.JButton But4;
    private javax.swing.JButton But5;
    private javax.swing.JButton But6;
    private javax.swing.JButton But7;
    private javax.swing.JButton But8;
    private javax.swing.JButton But9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton result;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables
}
