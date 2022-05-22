package com.ferraztec.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Atendimento {
    
    private int id;
    private LocalDateTime dataHoraAtendimento;
    private Cliente cliente;
    private Usuario usuario;
    private double precoTotal;
    private List<Produto> produtosUtilizados;
    
    
}
