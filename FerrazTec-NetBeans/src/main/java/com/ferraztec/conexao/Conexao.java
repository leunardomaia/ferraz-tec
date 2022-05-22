package com.ferraztec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    // Atributos
    
    private static final String URL = "jdbc:mysql://localhost:3306/ferraztec";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
            
    // Métodos
    public static Connection criarConexao() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        return connection;
    }
    
}
