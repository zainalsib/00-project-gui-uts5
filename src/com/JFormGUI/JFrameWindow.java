/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.JFormGUI;

/**
 *
 * @author Ibrahimy Space
 */
public class JFrameWindow extends javax.swing.JFrame {

    /**
     * Creates new form JFrameWindow
     */
    int x,y; // Deklarasi Untuk Drag & Drop Title Bar
    public JFrameWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        txtTempat = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        rbPria = new javax.swing.JRadioButton();
        rbWanita = new javax.swing.JRadioButton();
        cmbAngkatan = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnLeave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1180, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.setBorder(null);
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 220, 20));

        txtTempat.setBorder(null);
        jPanel1.add(txtTempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 220, 10));

        txtTanggal.setBorder(null);
        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 220, 20));

        buttonGroup1.add(rbPria);
        jPanel1.add(rbPria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 30, 30));

        buttonGroup1.add(rbWanita);
        jPanel1.add(rbWanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 20, 30));

        cmbAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknologi Informasi 2019", "Teknologi Informasi 2020", "Teknologi Informasi 2021", "Teknologi Informasi 2022" }));
        jPanel1.add(cmbAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 210, -1));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/btsSave.png"))); // NOI18N
        btnSimpan.setBorder(null);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, -1, -1));

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/btnDelete.png"))); // NOI18N
        btnHapus.setBorder(null);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 360, -1, -1));

        btnLeave.setBackground(new java.awt.Color(0, 102, 255));
        btnLeave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/btnLeave.png"))); // NOI18N
        btnLeave.setBorder(null);
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 170, 50));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setBorder(null);
        txtArea.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 540, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/Header.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/Sidebar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 650));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/TitleBar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/FormWrapper.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/JFormGUI/Assets/OutputWrapping.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        // (START) ~ Deklarasi Untuk Field Inputan Nama, Tempat Lahir, Tanggal Lahir, Jenis Kelamin
        String nama;
        String tempat;
        String tanggal;
        String JK;
        // (END) ~ Deklarasi Untuk Field Inputan Nama, Tempat Lahir, Tanggal Lahir, Jenis Kelamin
        
        nama = txtNama.getText(); // Ngambil Inputan Dari Field Nama
        tempat = txtTempat.getText(); // Ngambil Inputan Dari Field Tempat
        tanggal = txtTanggal.getText(); // Ngambil Inputan Dari Field Tanggal
        
        // (START) ~ Seleksi Pemilihan Jenis Kelamin
        if(rbPria.isSelected()){
            JK = "Laki - Laki";
        }else{
            JK = "Perempuan";
        }
        // (END) ~ Seleksi Pemilihan Jenis Kelamin
        
        // (START) ~ Menampilkan data yang diambil menggunakan getText
        txtArea.append("Nama Mahasiswa : "+nama);
        txtArea.append("\n\nKelahiran : "+tempat);
        txtArea.append("\n\nPada Tanggal : "+tanggal);
        txtArea.append("\n\nJenis Kelamin : "+JK);
        // (END) ~ Menampilkan data yang diambil menggunakan getText
        txtArea.append("\n\nTermasuk Mahasiswa Prodi : "+cmbAngkatan.getSelectedItem()); // Menampilkan setText Inputan khusus ComboBox
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLeaveActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // Variabel Untuk Title Bar
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // Variabel Untuk Title Bar
        int xx =evt.getXOnScreen();
        int yy =evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
        txtArea.setText("");
        txtNama.setText("");
        txtTempat.setText("");
        txtTanggal.setText("");
        rbPria.setSelected(false);
        rbWanita.setSelected(false);
        
        
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAngkatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables
}
