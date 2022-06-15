package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Atendente;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AtendenteDAO {
    
    
        public boolean cadastrar(Atendente atendente) throws Exception {
        String sql = "INSERT INTO atendente (nome, telefone, email, sexo) VALUES (?, ?, ?, ?)";
        try ( Connection conexao = Conexao.criarConexao();  PreparedStatement pstm = conexao.prepareStatement(sql)) {
            pstm.setString(1, atendente.getNome());
            pstm.setString(3, atendente.getTelefone());
            pstm.setString(4, atendente.getEmail());
            pstm.setString(5, atendente.getSexo().getDescricao());
            pstm.executeUpdate();
        }
        return true;
    }

    
}
