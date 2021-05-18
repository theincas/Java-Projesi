/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Personel;

import java.sql.*;
/**
 *
 * @author theincas
 */
public class Temel1 implements Interface_Personel.Interface3{
    
    private int PersonelNo;
    private String PersonelAd;
    private String PersonelSoyad;
    private String PersonelTel;
    private String PersonelAdres;
    private String PersonelEposta;
    
    public void setPersonelNo(int pNo)
    {
        PersonelNo=pNo;
    }
    public int getPersonelNo()
    {
        return PersonelNo;
    }
    public void setPersonelAd(String pAd)
    {
        PersonelAd=pAd;
    }
    public String getPersonelAd()
    {
        return PersonelAd;
    }
    public void setPersonelSoyad(String pSoyad)
    {
        PersonelSoyad=pSoyad;
    }
    public String getPersonelSoyad()
    {
        return PersonelSoyad;
    }
    public void setPersonelTel(String pTel)
    {
        PersonelTel=pTel;
    }
    public String getPersonelTel()
    {
        return PersonelTel;
    }
    public void setPersonelAdres(String pAdres)
    {
        PersonelAdres=pAdres;
    }
    public String getPersonelAdres()
    {
        return PersonelAdres;
    }
    public void setPersonelEposta(String pEposta)
    {
        PersonelEposta=pEposta;
    }
    public String getPersonelEposta()
    {
        return PersonelEposta;
    }
    
    public Temel1()
    {
        PersonelNo=0;
        PersonelAd="";
        PersonelSoyad="";
        PersonelTel="";
        PersonelAdres="";
        PersonelEposta="";
    }
    
    Temel2 t=new Temel2();
    
    
    public static class Baglanti
    {
        public static String EkleBaglan()
        {
            String sql = "INSERT INTO tbl_personel (personelNo,personelAdi,personelSoyadi,personelTel,personelAdres,personelEposta) VALUES (?,?,?,?,?,?)";
            return sql;
        }
        public static String GuncelleBaglan()
        {
            String sql = "UPDATE tbl_personel SET personelAdi=?,personelSoyadi=?,personelTel=?,personelAdres=?,personelEposta=? where personelNo=?";
            return sql;
        }
    }
    
    
    public void pEkle()
    {
        try {
           
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
            final Connection baglanti = null;
//            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/DbKargoTakip", "root", "");

            
                
            //System.out.println(sql);
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.EkleBaglan());
            pstm.setInt(1, PersonelNo);
            pstm.setString(2, PersonelAd);
            pstm.setString(3, PersonelSoyad);
            pstm.setString(4, PersonelTel);
            pstm.setString(5, PersonelAdres);
            pstm.setString(6, PersonelEposta);
            
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
     public void pGuncelle()
    {
        try {
           
            final Connection baglanti = null;

            
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.GuncelleBaglan());
            //System.out.println(sql);
            
            pstm.setString(1, PersonelAd);
            pstm.setString(2, PersonelSoyad);
            pstm.setString(3, PersonelTel);
            pstm.setString(4, PersonelAdres);
            pstm.setString(5, PersonelEposta);
            pstm.setInt(6, PersonelNo);
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
    public void pAra()
    {
        try {
           final Connection baglanti = null;
            
            Statement st = null;
            ResultSet rs = null;
            //String sql = "SELECT * FROM tbl_musteri where musteriNo='"+PersonelNo+"'";
           
            st = t.DbBaglanti(baglanti).createStatement();
            rs = st.executeQuery("SELECT * FROM tbl_personel where personelNo='"+PersonelNo+"'");
            //PreparedStatement pstm = baglanti.prepareStatement(sql);
            //System.out.println(sql);
           
            //pstm.setInt(1, PersonelNo);
            if(rs.next()){
                    
                setPersonelAd(rs.getString("personelAdi"));
                setPersonelSoyad(rs.getString("personelSoyadi"));
                setPersonelTel(rs.getString("personelTel"));
                setPersonelAdres(rs.getString("personelAdres"));
                setPersonelEposta(rs.getString("personelEposta"));
            }
                
           
//            pstm.setInt(1, PersonelNo);
//            pstm.execute();
            t.DbBaglanti(baglanti).close();
                System.out.println("Arama Basarili ");
        } catch (Exception e) {
            System.out.println("Arama Başarasız ");
        }
           
    }
    
    public void pSil()
    {
        try {
            final Connection baglanti = null;
            
            String sql = "DELETE FROM tbl_personel WHERE personelNo='"+PersonelNo+"'";
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(sql);
            //pstm.setInt(1, PersonelNo);
            pstm.execute();
            t.DbBaglanti(baglanti).close();
            System.out.println("Silme İşlemi Başarılı");
        } catch (Exception e) {
            System.out.println("Silme İşlemi Başarılamadı");
        }
          
    }
    
    
    
    
    
    
}
