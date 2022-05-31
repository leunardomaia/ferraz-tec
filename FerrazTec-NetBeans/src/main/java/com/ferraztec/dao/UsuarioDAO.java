package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    // Métodos
    public boolean cadastrar(Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (nome_completo, usuario, telefone, email, senha) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conexao = Conexao.criarConexao();  PreparedStatement pstm = conexao.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNomeCompleto());
            pstm.setString(2, usuario.getLogin());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getSenha());
            pstm.executeUpdate();
        }
        return true;
    }

    public void buscar(){
        
    } 
    
}
