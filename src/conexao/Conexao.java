/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlo Melo
 */
public class Conexao {
 
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/etoque?ssl=true";
    final private String usuario = "root";
    final private String senha = "Thecure81";
    
    private Connection conexao;
    
    public Statement statement;
    public ResultSet resultSet;
    
    
    public boolean conecta(){
        boolean result = true;
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
                        
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver não localizado: " +Driver );
            result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Erro de conexão" + "Com a fonte de dados "+Fonte);
            result = false;
        }
        return result;
    }
    
    public void desconecta(){
        
        boolean result = true;
        
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Desconectado");
            
        }catch(SQLException erroSQL){
            JOptionPane.showMessageDialog(null, "Não foi possivel" + "desconectar "+erroSQL.getMessage());
            result = false;
        }
    }
    
    public void executaSQL(String sql) throws SQLException{
        
        try{
            statement = conexao.createStatement();
            resultSet = statement.executeQuery(sql);
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null, "Não foi possível executar SQL" + sqlex.getMessage());
        }
}
 

}    

