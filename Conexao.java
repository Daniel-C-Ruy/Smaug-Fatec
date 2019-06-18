package jogo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;


public class Conexao {
    
   
    static Connection contato = null;

    public static Connection getConexao() {

        String url = "jdbc:sqlserver://dan-PC:1433;databaseName=smaug";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         
        } catch (ClassNotFoundException e) {
           // JOptionPane.showMessageDialog(null, "não pode fazer a conexão com o banco"
             //       + e.getMessage(), "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
        try {
            contato = DriverManager.getConnection(url, "sa", "12345");
            JOptionPane.showMessageDialog(null, "Conexão Realizada");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Erro"
                //    + e.getMessage(), "Erro de conexão", JOptionPane.ERROR_MESSAGE);

        }
        return contato;

    }

    public static ResultSet Consulta(String consulta) {
        Connection conecta = getConexao();
        Statement declara;
        try {
            declara = conecta.createStatement();
            ResultSet resposta = declara.executeQuery(consulta);
            Credito.janela.drawText(resposta.toString(), 50, 50, Color.yellow);
           // JOptionPane.showMessageDialog(null, "Conexão Realizada");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Erro"
              //      + e.getMessage(), "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
        return null;
        
    }    
        

}
