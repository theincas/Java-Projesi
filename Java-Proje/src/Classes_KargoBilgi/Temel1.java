/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_KargoBilgi;

import java.sql.*;

/**
 *
 * @author theincas
 */
public class Temel1 implements Interface_KargoBilgi.Interface3 {
    private int KargoNo;
    private int KargoHacim;
    private int KargoUcret;
    private String KargoDurum;
    private String GonderiTarih;
    private String GonderiAdres;
    private int MusteriNum;
    private int PersonelNum;
    
    public void setKargoNo(int kNo)
    {
        KargoNo=kNo;
    }
    public int getKargoNo()
    {
        return KargoNo;
    }
    public void setKargoHacim(int kH)
    {
        KargoHacim=kH;
    }
    public int getKargoHacim()
    {
        return KargoHacim;
    }
    public void setKargoUcret(int kU)
    {
        KargoUcret=kU;
    }
    public int getKargoUcret()
    {
        return KargoUcret;
    }
    public void setKargoDurum(String kDurum)
    {
        KargoDurum=kDurum;
    }
    public String getKargoDurum()
    {
        return KargoDurum;
    }
   
    public void setGonderiTarih(String gTarih)
    {
        GonderiTarih=gTarih;
    }
    public String getGonderiTarih()
    {
        return GonderiTarih;
    }
     public void setGonderiAdres(String gAdres)
    {
        GonderiAdres=gAdres;
    }
    public String getGonderiAdres()
    {
        return GonderiAdres;
    }
    public void setMusteriNum(int mNo)
    {
        MusteriNum=mNo;
    }
    public int getMusteriNum()
    {
        return MusteriNum;
    }
    public void setPersonelNum(int pNo)
    {
        PersonelNum=pNo;
    }
    public int getPersonelNum()
    {
        return PersonelNum;
    }
    
    public Temel1()
    {
     KargoNo=0;
     KargoHacim=0;
     KargoUcret=0;
     KargoDurum="";
     GonderiTarih="";
     GonderiAdres="";
     MusteriNum=0;
     PersonelNum=0;
    }
    
    Temel2 t=new Temel2();
    
    public static class Baglanti
    {
        public static String EkleBaglan()
        {
            String sql = "INSERT INTO tbl_kargobilgileri (kargoNo,kargoHacim,kargoUcret,kargoDurum,gonderiTarih,gonderiAdres,musteriNoFk,personelNoFk) VALUES (?,?,?,?,?,?,?,?)";
            return sql;
        }
        public static String GuncelleBaglan()
        {
            String sql = "UPDATE tbl_kargobilgileri SET kargoHacim=?,kargoUcret=?,kargoDurum=?,gonderiTarih=?,gonderiAdres=?,musteriNoFk=?,personelNoFk=? where kargoNo=?";
            return sql;
        }
    }
    
    public void kEkle()
    {
        try {
           
            final Connection baglanti = null;
            
//            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/DbKargoTakip", "root", "");

                
            //System.out.println(sql);
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.EkleBaglan());
            pstm.setInt(1, KargoNo);
            pstm.setInt(2, KargoHacim);
            pstm.setInt(3, KargoUcret);
            pstm.setString(4, KargoDurum);
            pstm.setString(5, GonderiTarih);
            pstm.setString(6, GonderiAdres);
            
            pstm.setInt(7, MusteriNum);
            pstm.setInt(8, PersonelNum);
            pstm.execute();
            
            t.DbBaglanti(baglanti).close();
            System.out.println("Ekleme Basarili ");
            pstm.close();
        }
        catch (Exception e) 
        {
            System.out.println("Ekleme Basarısız ");
        }
    } 
     public void kGuncelle()
    {
        try {
           
            final Connection baglanti = null;

            
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.GuncelleBaglan());
            //System.out.println(sql);
            
            pstm.setInt(1, KargoHacim);
            pstm.setInt(2, KargoUcret);
            pstm.setString(3, KargoDurum);
            pstm.setString(4, GonderiTarih);
            pstm.setString(5, GonderiAdres);
            pstm.setInt(6, MusteriNum);
            pstm.setInt(7, PersonelNum);
            pstm.setInt(8, KargoNo);
            pstm.executeUpdate();
            
            t.DbBaglanti(baglanti).close();
            System.out.println("Update Basarili ");
            pstm.close();
        }
        catch (Exception e) 
        {
            System.out.println("Update Basarısız ");
        }
    } 
    public void kAra()
    {
        try {
           final Connection baglanti = null;
            
            Statement st = null;
            ResultSet rs = null;
            //String sql = "SELECT * FROM tbl_musteri where musteriNo='"+KargoNo+"'";
           
            st = t.DbBaglanti(baglanti).createStatement();
            rs = st.executeQuery("SELECT * FROM tbl_kargobilgileri where kargoNo='"+KargoNo+"'");
            //PreparedStatement pstm = baglanti.prepareStatement(sql);
            //System.out.println(sql);
           
            //pstm.setInt(1, KargoNo);
            if(rs.next()){
                    
                setKargoHacim(rs.getInt("kargoHacim"));
                setKargoUcret(rs.getInt("kargoUcret"));
                setKargoDurum(rs.getString("kargoDurum"));
                setGonderiTarih(rs.getString("gonderiTarih"));
                setGonderiAdres(rs.getString("gonderiAdres"));
                setMusteriNum(rs.getInt("musteriNoFk"));
                setPersonelNum(rs.getInt("personelNoFk"));
            }
                
           
//            pstm.setInt(1, KargoNo);
//            pstm.execute();
            t.DbBaglanti(baglanti).close();
                System.out.println("Arama Basarili ");
        } catch (Exception e) {
            System.out.println("Arama Başarasız ");
        }
           
    }
    
    public void kSil()
    {
        try {
            final Connection baglanti = null;
            
            String sql = "DELETE FROM tbl_kargobilgileri WHERE kargoNo='"+KargoNo+"'";
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(sql);
            //pstm.setInt(1, KargoNo);
            pstm.execute();
            t.DbBaglanti(baglanti).close();
            System.out.println("Silme İşlemi Başarılı");
        } catch (Exception e) {
            System.out.println("Silme İşlemi Başarılamadı");
        }
          
    }
    
    
}
