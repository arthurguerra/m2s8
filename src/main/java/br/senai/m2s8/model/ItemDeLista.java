package br.senai.m2s8.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ItemDeLista{

    @NotEmpty(message = "{campo.obrigatorio}")
    private String descricao;

    @NotNull(message = "{campo.obrigatorio}")
    private Float quantidade;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String medida;


    public ItemDeLista() {
    }

    public ItemDeLista(String descricao, Float quantidade, String medida) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.medida = medida;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return String.format("%.1f %s(s) de %s", quantidade, medida, descricao);
    }
}
