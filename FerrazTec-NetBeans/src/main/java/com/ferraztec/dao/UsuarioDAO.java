package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    
     // Métodos
    public boolean cadastrar(Usuario usuario) throws Exception{
        String sql = "INSERT INTO usuarios (nome_completo, usuario, telefone, email, senha) VALUES (?, ?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, usuario.getNomeCompleto());
            pstm.setString(2, usuario.getUsuario());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getSenha());
            
            pstm.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        } finally{
            if(pstm!=null){
                pstm.close();
            }
            if(conexao!=null){
                conexao.close();
            }
        }
        
    }
    
    public void buscar(){
        
    } 
    
}
