package com.ferraztec.dto.atendente;

public enum Sexo {
    M("M"), 
    F("F");
    
    private String descricao;
    
    
    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
