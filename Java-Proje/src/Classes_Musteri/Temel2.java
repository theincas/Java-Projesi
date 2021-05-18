package Classes_Musteri;

import java.sql.*;

public class Temel2 implements Interface_Musteri.Interface2{
    
    public Connection DbBaglanti(Connection baglanti)
    {
        
        try {
            
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/DbKargoTakip", "root", "");;
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            
            return baglanti;
        } catch (Exception e) {
        }
        return baglanti;
    }
}
