
import Classes_Musteri.Temel1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theincas
 */
public class MusteriForm extends javax.swing.JFrame {

    /**
     * Creates new form MusteriForm
     */
    public MusteriForm() {
        initComponents();
        mListele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Musteri = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_Home = new javax.swing.JButton();
        btn_MusteriEkle = new javax.swing.JButton();
        btn_Guncelle = new javax.swing.JButton();
        btn_Sil = new javax.swing.JButton();
        btn_Ara = new javax.swing.JButton();
        btn_Temizle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBox_Soyadi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBox_TC = new javax.swing.JTextField();
        txtBox_Adi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBox_Tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBox_Eposta = new javax.swing.JTextField();
        txtBox_Adres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1400, 1000));

        jTable_Musteri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Musteri);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(247, 730));

        btn_Home.setBackground(new java.awt.Color(102, 0, 102));
        btn_Home.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(255, 255, 255));
        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btn_Home.setText("ANASAYFA");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        btn_MusteriEkle.setBackground(new java.awt.Color(102, 0, 102));
        btn_MusteriEkle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_MusteriEkle.setForeground(new java.awt.Color(255, 255, 255));
        btn_MusteriEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_MusteriEkle.setText("Ekle");
        btn_MusteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MusteriEkleActionPerformed(evt);
            }
        });

        btn_Guncelle.setBackground(new java.awt.Color(102, 0, 102));
        btn_Guncelle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Guncelle.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btn_Guncelle.setText("Guncelle");
        btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuncelleActionPerformed(evt);
            }
        });

        btn_Sil.setBackground(new java.awt.Color(102, 0, 102));
        btn_Sil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Sil.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_Sil.setText("Sil");
        btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SilActionPerformed(evt);
            }
        });

        btn_Ara.setBackground(new java.awt.Color(102, 0, 102));
        btn_Ara.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Ara.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_Ara.setText("Ara");
        btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AraActionPerformed(evt);
            }
        });

        btn_Temizle.setBackground(new java.awt.Color(102, 0, 102));
        btn_Temizle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Temizle.setForeground(new java.awt.Color(255, 255, 255));
        btn_Temizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_Temizle.setText("Temizle");
        btn_Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
            .addComponent(btn_MusteriEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_MusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(132, 0, 140));
        jPanel2.setPreferredSize(new java.awt.Dimension(1027, 205));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Soyadınız");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("T.C. Kimlik Numarası");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adınız");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adres");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-posta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefonu");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBox_Soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBox_TC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtBox_Adi, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBox_Adres, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtBox_Eposta)
                    .addComponent(txtBox_Tel))
                .addGap(197, 197, 197))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBox_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBox_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBox_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtBox_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBox_Soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBox_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void mListele()
    {
        DefaultTableModel table=new DefaultTableModel();
        Temel1 t=new Temel1();
        table.addColumn("musteriNo");
        table.addColumn("musteriAd");
        table.addColumn("musteriSoyad");
        table.addColumn("musteriTel");
        table.addColumn("musteriAdres");
        table.addColumn("musteriEposta");
        ResultSet rs;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection baglanti=null;
            baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/DbKargoTakip","root","");
            String query =("Select * from tbl_musteri");
            //PreparedStatement pstm = baglanti.prepareStatement(query);
            //rs=pstm.executeQuery();
            
            //pstm.execute();
             Statement S=baglanti.createStatement();
             ResultSet R=S.executeQuery(query);
             while(R.next())
             {
                 table.addRow(new Object[]{
                    R.getInt(1),
                    R.getString(2),
                    R.getString(3),
                    R.getString(4),
                    R.getString(5),
                    R.getString(6)
                 });
             }
             jTable_Musteri.setModel(table);
            
            baglanti.close();
        } catch (Exception e) {
            System.out.println("Listeleme Basarisiz oldu");
        }
         
    }
    private void btn_MusteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MusteriEkleActionPerformed
        
        Temel1 t=new Temel1();
        
        try {
            t.setMusteriNo(Integer.parseInt(txtBox_TC.getText()));
            t.setMusteriAd(txtBox_Adi.getText());
            t.setMusteriSoyad(txtBox_Soyadi.getText());
            t.setMusteriTel(txtBox_Tel.getText());
            t.setMusteriAdres(txtBox_Adres.getText());
            t.setMusteriEposta(txtBox_Eposta.getText());
            t.mEkle();
            mListele();
        } catch (Exception e) {
            System.out.println("Hata");
        }
       
       
        
    }//GEN-LAST:event_btn_MusteriEkleActionPerformed

    private void btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuncelleActionPerformed
        Temel1 t=new Temel1();
        
        try {
            t.setMusteriNo(Integer.parseInt(txtBox_TC.getText()));
            t.setMusteriAd(txtBox_Adi.getText());
            t.setMusteriSoyad(txtBox_Soyadi.getText());
            t.setMusteriTel(txtBox_Tel.getText());
            t.setMusteriAdres(txtBox_Adres.getText());
            t.setMusteriEposta(txtBox_Eposta.getText());
            t.mGuncelle();
            mListele();
        } catch (Exception e) {
            System.out.println("Hata");
        }
    }//GEN-LAST:event_btn_GuncelleActionPerformed

    private void btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AraActionPerformed
        Temel1 t=new Temel1();
        
        try {
            t.setMusteriNo(Integer.parseInt(txtBox_TC.getText()));
//            t.setMusteriAd(txtBox_Adi.getText());
//            t.setMusteriSoyad(txtBox_Soyadi.getText());
//            t.setMusteriTel(txtBox_Tel.getText());
//            t.setMusteriAdres(txtBox_Adres.getText());
//            t.setMusteriEposta(txtBox_Eposta.getText());
            
            t.mAra();
            txtBox_Adi.setText(t.getMusteriAd());
            txtBox_Soyadi.setText(t.getMusteriSoyad());
            txtBox_Tel.setText(t.getMusteriTel());
            txtBox_Adres.setText(t.getMusteriAdres());
            txtBox_Eposta.setText(t.getMusteriEposta());
            mListele();
        } catch (Exception e) {
            System.out.println("Hata");
        }
    }//GEN-LAST:event_btn_AraActionPerformed

    private void btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SilActionPerformed
        Temel1 t=new Temel1();
        
        try {
            t.setMusteriNo(Integer.parseInt(txtBox_TC.getText()));

            
            t.mSil();
//            txtBox_Adi.setText(t.getMusteriAd());
//            txtBox_Soyadi.setText(t.getMusteriSoyad());
//            txtBox_Tel.setText(t.getMusteriTel());
//            txtBox_Adres.setText(t.getMusteriAdres());
//            txtBox_Eposta.setText(t.getMusteriEposta());
            mListele();
        } catch (Exception e) {
            System.out.println("Hata");
        }
    }//GEN-LAST:event_btn_SilActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        Anasayfa aForm=new Anasayfa();
        aForm.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TemizleActionPerformed
        txtBox_Adi.setText("");
        txtBox_Adres.setText("");
        txtBox_Eposta.setText("");
        txtBox_Soyadi.setText("");
        txtBox_TC.setText("");
        txtBox_Tel.setText("");
    }//GEN-LAST:event_btn_TemizleActionPerformed

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
            java.util.logging.Logger.getLogger(MusteriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ara;
    private javax.swing.JButton btn_Guncelle;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_MusteriEkle;
    private javax.swing.JButton btn_Sil;
    private javax.swing.JButton btn_Temizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Musteri;
    private javax.swing.JTextField txtBox_Adi;
    private javax.swing.JTextField txtBox_Adres;
    private javax.swing.JTextField txtBox_Eposta;
    private javax.swing.JTextField txtBox_Soyadi;
    private javax.swing.JTextField txtBox_TC;
    private javax.swing.JTextField txtBox_Tel;
    // End of variables declaration//GEN-END:variables
}
