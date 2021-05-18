/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Personel;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author theincas
 */
public class Temel2 implements Interface_Personel.Interface2{
    
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
