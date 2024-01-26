package br.com.meva.classes;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //toString()
    @Override
    public String toString() {
        return "Produto {" +
                "nome = '" + nome + '\'' +
                ", codigo = " + codigo +
                ", preco = " + preco +
                ", quantidade = " + quantidade + "}";
    }
}
