/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferraztec.classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Produto {
    
    // Atributos
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;
    
    // Métodos
    public void cadastrar() throws Exception{
        String sql = "INSERT INTO produtos (nome, descricao, quantidade, valor) VALUES (?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);

            pstm.setString(1, this.getNome());
            pstm.setString(2, this.getDescricao());
            pstm.setInt(3, this.getQuantidade());
            pstm.setDouble(4, this.getValor());

            pstm.executeUpdate();
      
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(pstm!=null){
                pstm.close();
            }
            if (conexao!=null){
                conexao.close();
            }
        }
    }
    
    
    public ResultSet buscarPorNome(String busca) throws Exception{
        String sql = "SELECT * FROM produtos WHERE nome LIKE '%"+busca+"%'";
        
        Connection conexao = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Produto buscarPorID(int id) throws Exception{
        String sql = "SELECT * FROM produtos WHERE id = "+id;
        
        Produto p = new Produto();
        
        Connection conexao = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            
            while(rset.next()){
                
                p.setId(rset.getInt("id"));
                p.setNome(rset.getString("nome"));
                p.setDescricao(rset.getString("descricao"));
                p.setQuantidade(rset.getInt("quantidade"));
                p.setValor(rset.getDouble("valor"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rset!=null){
                rset.close();
            }
            if(pstm!=null){
                pstm.close();
            }
            if (conexao!=null){
                conexao.close();
            }
        }
        return p;
    }
    
    public void editar() throws Exception{
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, quantidade = ?, valor = ? WHERE id = ?";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);

            pstm.setString(1, this.getNome());
            pstm.setString(2, this.getDescricao());
            pstm.setInt(3, this.getQuantidade());
            pstm.setDouble(4, this.getValor());
            pstm.setInt(5, this.getId());

            pstm.executeUpdate();
      
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(pstm!=null){
                pstm.close();
            }
            if (conexao!=null){
                conexao.close();
            }
        }
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
