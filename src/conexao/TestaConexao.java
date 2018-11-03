/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QoS Dev
 */
public class TestaConexao {
    public static void main(String[] args) {
        
        Connection con = null;
   
        System.out.println("Conectando ao banco...");
            try {
              Class.forName("com.mysql.jdbc.Driver");
              con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/etoque","root","Thecure81");
              System.out.println("Conectado.");
            } catch (ClassNotFoundException ex) {
            
        System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch(SQLException e) {
              System.out.println(e);
              throw new RuntimeException(e);
            }

}
        
        
    }
    

