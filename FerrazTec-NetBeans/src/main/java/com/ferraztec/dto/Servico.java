package com.ferraztec.dto;

import java.util.Date;
import java.util.List;

public class Servico {
    
    // Atributos
    private int id;
    private Usuario usuario;
    private Cliente cliente;
    private double valorServico;
    private String descricaoServico;
    private double valorTotal;
    private List<Produto> produtosUtilizados;
    private Date data;
    
}
