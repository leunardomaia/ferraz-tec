package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    public void cadastrar(Produto produto) throws Exception{
        String sql = "INSERT INTO produto (nome, descricao, quantidade, preco) VALUES (?, ?, ?, ?)";
        
        try (Connection conexao = Conexao.criarConexao(); PreparedStatement pstm = conexao.prepareStatement(sql)) {
            
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            
            pstm.executeUpdate();
        }
    }
    
    public List<Produto> buscarPorNome(String busca) throws Exception {
        String sql = "SELECT * FROM produto WHERE nome LIKE '%" + busca + "%'";
        List<Produto> produtos = new ArrayList<>();

        try (Connection conexao = Conexao.criarConexao(); 
                PreparedStatement pstm = conexao.prepareStatement(sql); ResultSet rset = pstm.executeQuery()) {
            while (rset.next()) {
                Produto produto = new Produto();
                
                produto.setId(rset.getInt("id"));
                produto.setNome(rset.getString("nome"));
                produto.setDescricao(rset.getString("descricao"));
                produto.setQuantidade(rset.getInt("quantidade"));
                produto.setPreco(rset.getDouble("preco"));
                
                produtos.add(produto);
            }
        }
        return produtos;
    }
    
    public Produto buscarPorID(int id) throws Exception {
        String sql = "SELECT * FROM produto WHERE id = " + id;
        Produto produto = new Produto();
        
        try (Connection conexao = Conexao.criarConexao();
                PreparedStatement pstm = conexao.prepareStatement(sql); ResultSet rset = pstm.executeQuery()) {
            while (rset.next()) {
                produto.setId(rset.getInt("id"));
                produto.setNome(rset.getString("nome"));
                produto.setDescricao(rset.getString("descricao"));
                produto.setQuantidade(rset.getInt("quantidade"));
                produto.setPreco(rset.getDouble("preco"));
            }
        }
        return produto;
    }
    
    public void editar(Produto produto) throws Exception{
        String sql = "UPDATE produto SET nome = ?, descricao = ?, quantidade = ?, preco = ? WHERE id = ?";
        
        try (Connection conexao = Conexao.criarConexao(); PreparedStatement pstm = conexao.prepareStatement(sql)) {    
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.setInt(5, produto.getId()); 
            
            pstm.executeUpdate();    
        }
    }

}
