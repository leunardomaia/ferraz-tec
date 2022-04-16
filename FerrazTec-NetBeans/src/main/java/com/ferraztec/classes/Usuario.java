/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferraztec.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Leonardo
 */
public class Usuario {
    
    // Atributos
    private int id;
    private String nomeCompleto;
    private String usuario;
    private String telefone;
    private String email;
    private String senha;
    
    // Métodos
    public void cadastrar() throws Exception{
        String sql = "INSERT INTO usuarios (nome_completo, usuario, telefone, email, senha) VALUES (?, ?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, this.getNomeCompleto());
            pstm.setString(2, this.getUsuario());
            pstm.setString(3, this.getTelefone());
            pstm.setString(4, this.getEmail());
            pstm.setString(5, this.getSenha());
            
            pstm.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally{
            if(pstm!=null){
                pstm.close();
            }
            if(conexao!=null){
                conexao.close();
            }
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
