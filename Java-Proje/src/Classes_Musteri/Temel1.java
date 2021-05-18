package Classes_Musteri;


import java.sql.*;

public class Temel1 implements Interface_Musteri.Interface3
{
    private int MusteriNo;
    private String MusteriAd;
    private String MusteriSoyad;
    private String MusteriTel;
    private String MusteriAdres;
    private String MusteriEposta;
    
    public void setMusteriNo(int mNo)
    {
        MusteriNo=mNo;
    }
    public int getMusteriNo()
    {
        return MusteriNo;
    }
    public void setMusteriAd(String mAd)
    {
        MusteriAd=mAd;
    }
    public String getMusteriAd()
    {
        return MusteriAd;
    }
    public void setMusteriSoyad(String mSoyad)
    {
        MusteriSoyad=mSoyad;
    }
    public String getMusteriSoyad()
    {
        return MusteriSoyad;
    }
    public void setMusteriTel(String mTel)
    {
        MusteriTel=mTel;
    }
    public String getMusteriTel()
    {
        return MusteriTel;
    }
    public void setMusteriAdres(String mAdres)
    {
        MusteriAdres=mAdres;
    }
    public String getMusteriAdres()
    {
        return MusteriAdres;
    }
    public void setMusteriEposta(String mEposta)
    {
        MusteriEposta=mEposta;
    }
    public String getMusteriEposta()
    {
        return MusteriEposta;
    }
    
    public Temel1()
    {
        MusteriNo=0;
        MusteriAd="";
        MusteriSoyad="";
        MusteriTel="";
        MusteriAdres="";
        MusteriEposta="";
    }
    
    
    Temel2 t=new Temel2();
    
    public static class Baglanti
    {
        public static String EkleBaglan()
        {
            String sql = "INSERT INTO tbl_musteri (musteriNo,musteriAd,musteriSoyad,musteriTel,musteriAdres,musteriEposta) VALUES (?,?,?,?,?,?)";
            return sql;
        }
        public static String GuncelleBaglan()
        {
            String sql = "UPDATE tbl_musteri SET musteriAd=?,musteriSoyad=?,musteriTel=?,musteriAdres=?,musteriEposta=? where musteriNo=?";
            return sql;
        }
    }
    
    public void mEkle()
    {
        try {
           
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
            final Connection baglanti = null;
//            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/DbKargoTakip", "root", "");

            
                
            //System.out.println(sql);
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.EkleBaglan());
            pstm.setInt(1, MusteriNo);
            pstm.setString(2, MusteriAd);
            pstm.setString(3, MusteriSoyad);
            pstm.setString(4, MusteriTel);
            pstm.setString(5, MusteriAdres);
            pstm.setString(6, MusteriEposta);
            
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
     public void mGuncelle()
    {
        try {
           
            final Connection baglanti = null;

            
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(Baglanti.GuncelleBaglan());
            //System.out.println(sql);
            
            pstm.setString(1, MusteriAd);
            pstm.setString(2, MusteriSoyad);
            pstm.setString(3, MusteriTel);
            pstm.setString(4, MusteriAdres);
            pstm.setString(5, MusteriEposta);
            pstm.setInt(6, MusteriNo);
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
    public void mAra()
    {
        try {
            final Connection baglanti = null;
            
            Statement st = null;
            ResultSet rs = null;
            //String sql = "SELECT * FROM tbl_musteri where musteriNo='"+MusteriNo+"'";
           
            st = t.DbBaglanti(baglanti).createStatement();
            rs = st.executeQuery("SELECT * FROM tbl_musteri where musteriNo='"+MusteriNo+"'");
            //PreparedStatement pstm = baglanti.prepareStatement(sql);
            //System.out.println(sql);
           
            //pstm.setInt(1, MusteriNo);
            if(rs.next()){
                    
                setMusteriAd(rs.getString("musteriAd"));
                setMusteriSoyad(rs.getString("musteriSoyad"));
                setMusteriTel(rs.getString("musteriTel"));
                setMusteriAdres(rs.getString("musteriAdres"));
                setMusteriEposta(rs.getString("musteriEposta"));
            }
                
           
//            pstm.setInt(1, MusteriNo);
//            pstm.execute();
            t.DbBaglanti(baglanti).close();
                System.out.println("Arama Basarili ");
        } catch (Exception e) {
            System.out.println("Arama Başarasız ");
        }
           
    }
    
    public void mSil()
    {
        try {
            final Connection baglanti = null;
            
            String sql = "DELETE FROM tbl_musteri WHERE musteriNo='"+MusteriNo+"'";
            PreparedStatement pstm = t.DbBaglanti(baglanti).prepareStatement(sql);
            //pstm.setInt(1, MusteriNo);
            pstm.execute();
            t.DbBaglanti(baglanti).close();
            System.out.println("Silme İşlemi Başarılı");
        } catch (Exception e) {
            System.out.println("Silme İşlemi Başarılamadı");
        }
          
    }
    
    
    
}
