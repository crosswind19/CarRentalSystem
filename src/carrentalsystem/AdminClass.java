/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author bende
 */
public class AdminClass extends javax.swing.JFrame {

    /**
     * Creates new form AdminClass
     */
    public AdminClass() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_new_car = new javax.swing.JButton();
        edit_car = new javax.swing.JButton();
        delete_car = new javax.swing.JButton();
        edit_cus_booking = new javax.swing.JButton();
        generate_pdf = new javax.swing.JToggleButton();
        view_log = new javax.swing.JButton();
        view_car = new javax.swing.JButton();
        delete_booking_btn = new javax.swing.JButton();
        quit_btn = new javax.swing.JButton();
        booking_confirmation = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        view_cus_booking = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Admin Panel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Please Select Below Function");

        add_new_car.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        add_new_car.setText("Add new Car");
        add_new_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_carActionPerformed(evt);
            }
        });

        edit_car.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        edit_car.setText("Edit Car Information");
        edit_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_carActionPerformed(evt);
            }
        });

        delete_car.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        delete_car.setText("Delete Car");
        delete_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_carActionPerformed(evt);
            }
        });

        edit_cus_booking.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        edit_cus_booking.setText("Edit Customer Booking");
        edit_cus_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_cus_bookingActionPerformed(evt);
            }
        });

        generate_pdf.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        generate_pdf.setText("Generate PDF");

        view_log.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        view_log.setText("View Customer Log");
        view_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_logActionPerformed(evt);
            }
        });

        view_car.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        view_car.setText("View All Car Details");
        view_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_carActionPerformed(evt);
            }
        });

        delete_booking_btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        delete_booking_btn.setText("Delete Customer Booking");
        delete_booking_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_booking_btnActionPerformed(evt);
            }
        });

        quit_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quit_btn.setText("Quit");
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });

        booking_confirmation.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        booking_confirmation.setText("Booking Confirmation");
        booking_confirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_confirmationActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("Approve Car Return");

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setText("Edit Customer Payment");

        view_cus_booking.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        view_cus_booking.setText("View Customer Booking");
        view_cus_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_cus_bookingActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton4.setText("Delete Customer Payment");

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton3.setText("View Customer Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(add_new_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(view_car, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(booking_confirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view_log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit_cus_booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete_booking_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generate_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view_cus_booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_new_car, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_cus_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_booking_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_car, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_cus_booking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(booking_confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view_log))
                    .addComponent(generate_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_new_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_carActionPerformed
        AddCar add_car = new AddCar();
        add_car.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_add_new_carActionPerformed

    private void view_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_carActionPerformed
        ViewCar view_car = new ViewCar();
        view_car.setVisible(true);
        dispose();
    }//GEN-LAST:event_view_carActionPerformed

    private void edit_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_carActionPerformed
        EditCar edit_car = new EditCar();
        edit_car.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_edit_carActionPerformed

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        dispose();
    }//GEN-LAST:event_quit_btnActionPerformed

    private void delete_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_carActionPerformed
        DeleteCar delete_car = new DeleteCar();
        delete_car.setVisible(true);
        dispose();
    }//GEN-LAST:event_delete_carActionPerformed

    private void booking_confirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_confirmationActionPerformed
        BookingConfirmation booking = new BookingConfirmation();
        booking.setVisible(true);
        dispose();
    }//GEN-LAST:event_booking_confirmationActionPerformed

    private void edit_cus_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_cus_bookingActionPerformed
        EditCusBooking edit_cus = new EditCusBooking();
        edit_cus.setVisible(true);
        dispose();
    }//GEN-LAST:event_edit_cus_bookingActionPerformed

    private void view_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_logActionPerformed
        ViewLog view_log = new ViewLog();
        view_log.setVisible(true);
        dispose();
    }//GEN-LAST:event_view_logActionPerformed

    private void view_cus_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_cus_bookingActionPerformed
        ViewCusBooking view_booking = new ViewCusBooking();
        view_booking.setVisible(true);
        dispose();
    }//GEN-LAST:event_view_cus_bookingActionPerformed

    private void delete_booking_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_booking_btnActionPerformed
        DeleteCusBooking delete_booking = new DeleteCusBooking();
        delete_booking.setVisible(true);
        dispose();
    }//GEN-LAST:event_delete_booking_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_car;
    private javax.swing.JButton booking_confirmation;
    private javax.swing.JButton delete_booking_btn;
    private javax.swing.JButton delete_car;
    private javax.swing.JButton edit_car;
    private javax.swing.JButton edit_cus_booking;
    private javax.swing.JToggleButton generate_pdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton quit_btn;
    private javax.swing.JButton view_car;
    private javax.swing.JButton view_cus_booking;
    private javax.swing.JButton view_log;
    // End of variables declaration//GEN-END:variables
}
