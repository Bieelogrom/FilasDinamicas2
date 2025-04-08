package model;

public class Cliente {
    private String nome;
    private int QuantidadePecas;
    private float ValorPecas;

    public Cliente(String nome, int quantidadePecas, float ValorPecas){
        this.nome = nome;
        this.QuantidadePecas = quantidadePecas;
        this.ValorPecas = ValorPecas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePecas() {
        return QuantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        QuantidadePecas = quantidadePecas;
    }

    public float getValorPecas() {
        return ValorPecas;
    }

    public void setValorPecas(float valorPecas) {
        ValorPecas = valorPecas;
    }
}
