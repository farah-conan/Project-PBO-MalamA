/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class perhitunganpenjualan extends javax.swing.JFrame {
String namakonsumen;
String kodebarang;
String namabarang;
int hargabarang;
int jumlahbeli;
int diskon;
int totalharga;
int totalbayar;
int jumlahbayar;
int uangkembali;
    /*
     * Creates new form perhitunganpenjualan
     */
    public perhitunganpenjualan() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CmbKodeBarang = new javax.swing.JComboBox<>();
        TxtNamaKonsumen = new javax.swing.JTextField();
        TxtNamaBarang = new javax.swing.JTextField();
        TxtHargaBarang = new javax.swing.JTextField();
        CmbJumlahBeli = new javax.swing.JComboBox<>();
        TxtDiskon = new javax.swing.JTextField();
        TxtTotalHarga = new javax.swing.JTextField();
        TxtTotalBayar = new javax.swing.JTextField();
        TxtUangKembali = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtJumlahBayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("APLIKASI SISTEM BUTIK BATIK");

        jLabel2.setText("Nama Konsumen");

        jLabel3.setText("Kode Barang");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Harga Barang");

        jLabel6.setText("Jumlah Beli");

        jLabel7.setText("Diskon");

        jLabel8.setText("Total Harga");

        jLabel9.setText("Total Bayar");

        jLabel10.setText("Uang Kembali");

        CmbKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "SL", "YGY", "CRB", "MDR" }));
        CmbKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbKodeBarangActionPerformed(evt);
            }
        });

        TxtNamaKonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaKonsumenActionPerformed(evt);
            }
        });

        CmbJumlahBeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH" }));
        CmbJumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbJumlahBeliActionPerformed(evt);
            }
        });

        TxtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiskonActionPerformed(evt);
            }
        });

        jLabel11.setText("Jumlah Bayar");

        TxtJumlahBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtJumlahBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtTotalBayar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTotalHarga, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDiskon, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbJumlahBeli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CmbKodeBarang, javax.swing.GroupLayout.Alignment.LEADING, 0, 66, Short.MAX_VALUE)
                    .addComponent(TxtHargaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNamaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNamaKonsumen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtUangKembali)
                    .addComponent(TxtJumlahBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNamaKonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(TxtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CmbJumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtUangKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNamaKonsumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaKonsumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaKonsumenActionPerformed

    private void TxtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDiskonActionPerformed

    private void CmbKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbKodeBarangActionPerformed
        // TODO add your handling code here:
        if (CmbKodeBarang.getSelectedIndex() == 1){
            namabarang = "Batik Solo";
            hargabarang = 250000;   
        } else if (CmbKodeBarang.getSelectedIndex() == 2){
            namabarang = "Batik Yogyakarta";
            hargabarang = 230000;
        } else if (CmbKodeBarang.getSelectedIndex() == 3){
            namabarang = "Batik Cirebon";
            hargabarang = 270000;
        } else if (CmbKodeBarang.getSelectedIndex() == 4){
            namabarang = "Batik Madura";
            hargabarang = 240000;
        }
        TxtNamaBarang.setText(String.valueOf(namabarang));
        TxtHargaBarang.setText(String.valueOf(hargabarang));
    }//GEN-LAST:event_CmbKodeBarangActionPerformed

    private void CmbJumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbJumlahBeliActionPerformed
        // TODO add your handling code here:
        jumlahbeli = (int) CmbJumlahBeli.getSelectedIndex();
        if (jumlahbeli <=3) {
            diskon = 10000;
        } else if (jumlahbeli >=3 && jumlahbeli < 15) {
            diskon = 15000;
        } else if (jumlahbeli >=15) {
            diskon = 25000;
        }
        TxtDiskon.setText(String.valueOf(diskon));
        
        totalharga = hargabarang * jumlahbeli;
        TxtTotalHarga.setText(String.valueOf(totalharga));
        
        totalbayar = totalharga - diskon;
        TxtTotalBayar.setText(String.valueOf(totalbayar));
    }//GEN-LAST:event_CmbJumlahBeliActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        int angkaawal = 1;
        while (angkaawal <=30){
            CmbJumlahBeli.addItem(String.valueOf(angkaawal));
            angkaawal++;
        }
    }//GEN-LAST:event_formWindowActivated

    private void TxtJumlahBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtJumlahBayarActionPerformed
        // TODO add your handling code here:
        jumlahbayar = Integer.parseInt(TxtJumlahBayar.getText());
        totalbayar = Integer.parseInt(TxtTotalBayar.getText());
                
        uangkembali = jumlahbayar - totalbayar;
        TxtUangKembali.setText(String.valueOf(uangkembali));
    }//GEN-LAST:event_TxtJumlahBayarActionPerformed

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
            java.util.logging.Logger.getLogger(perhitunganpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perhitunganpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perhitunganpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perhitunganpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perhitunganpenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbJumlahBeli;
    private javax.swing.JComboBox<String> CmbKodeBarang;
    private javax.swing.JTextField TxtDiskon;
    private javax.swing.JTextField TxtHargaBarang;
    private javax.swing.JTextField TxtJumlahBayar;
    private javax.swing.JTextField TxtNamaBarang;
    private javax.swing.JTextField TxtNamaKonsumen;
    private javax.swing.JTextField TxtTotalBayar;
    private javax.swing.JTextField TxtTotalHarga;
    private javax.swing.JTextField TxtUangKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
