package com.ferraztec.dao;

import com.ferraztec.conexao.Conexao;
import com.ferraztec.dto.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public void cadastrar(Cliente cliente) throws Exception{
        String sql = "INSERT INTO cliente (nome, telefone, cpf) VALUES (?, ?, ?)";
        
        try (Connection conexao = Conexao.criarConexao(); PreparedStatement pstm = conexao.prepareStatement(sql)) {
           
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getTelefone());
            pstm.setString(3, cliente.getCpf());   
            
            pstm.executeUpdate();
        }
    }
    public List<Cliente> buscarPorNome(String busca) throws Exception {
        String sql = "SELECT * FROM cliente WHERE nome LIKE '%" + busca + "%'";
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexao = Conexao.criarConexao(); 
                PreparedStatement pstm = conexao.prepareStatement(sql); ResultSet rset = pstm.executeQuery()) {
            while (rset.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(rset.getInt("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setTelefone(rset.getString("telefone"));
                cliente.setCpf(rset.getString("cpf"));
                
                clientes.add(cliente);
            }
        }
        return clientes;
    }
}
