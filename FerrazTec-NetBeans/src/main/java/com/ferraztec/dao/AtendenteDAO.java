package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Atendente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class AtendenteDAO {
    
    
        public int cadastrar(Atendente atendente) throws Exception {
        String sql = "INSERT INTO atendente (nome, telefone, email, sexo) VALUES (?, ?, ?, ?)";
        int idCadastrado = 0;
        try ( Connection conexao = Conexao.criarConexao();  PreparedStatement pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, atendente.getNome());
            pstm.setString(2, atendente.getTelefone());
            pstm.setString(3, atendente.getEmail());
            pstm.setString(4, atendente.getSexo().getDescricao());
            pstm.executeUpdate();
            
            ResultSet generatedKeys = pstm.getGeneratedKeys();  
            generatedKeys.next();
            idCadastrado = generatedKeys.getInt(1);
        }
        return idCadastrado;
        
    }


}
