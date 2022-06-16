package com.ferraztec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://www.adrianobraga.com.br:3306/adrianob_2022grupo4";
    private static final String USUARIO = "adrianob_2022user4";
    private static final String SENHA = "UsrGrp20224";
            
    public static Connection criarConexao() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        return connection;
    }
    
}
