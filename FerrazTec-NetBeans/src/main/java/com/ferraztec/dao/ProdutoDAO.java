package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {
    
    public void cadastrar(Produto produto) throws Exception{
        String sql = "INSERT INTO produtos (nome, descricao, quantidade, preco) VALUES (?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);

            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getValor());

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
    
    public void editar(Produto produto) throws Exception{
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, quantidade = ?, preco = ? WHERE id = ?";
        Connection conexao = null;
        PreparedStatement pstm = null;
        
        
        try {
            conexao = Conexao.criarConexao();
            pstm = conexao.prepareStatement(sql);

            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getValor());
            pstm.setInt(5, produto.getId());

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
    
}
