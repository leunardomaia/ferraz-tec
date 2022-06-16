package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public void cadastrar(Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (login, senha, atendente_id) VALUES ( ?, criptografar(?), ?)";
        
        try ( Connection conexao = Conexao.criarConexao();  PreparedStatement pstm = conexao.prepareStatement(sql)) {
            pstm.setString(1, usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            pstm.setInt(3, usuario.getAtendente().getId());
            pstm.executeUpdate(); 
        }
    }
  
}
