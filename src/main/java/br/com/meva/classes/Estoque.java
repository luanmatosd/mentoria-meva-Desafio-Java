package br.com.meva.classes;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> arrayDeProdutos;

    //Construtor
    public Estoque() {
        this.arrayDeProdutos = new ArrayList<>();
    }

    public void adicionaProdutos(Produto produto) {
        arrayDeProdutos.add(produto);
    }

    public void listaProdutos() {
        if (arrayDeProdutos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            arrayDeProdutos.forEach(System.out::println);
        }
    }

    public void atualizaProdutos(int codigo, int quantidade) {
        for (Produto produto : arrayDeProdutos) {
            if (produto.getCodigo() == codigo) {
                produto.setQuantidade(quantidade);
                System.out.println("Quantidade atualizada.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void buscaPorCodigoProduto(int codigo) {
        for (Produto produto : arrayDeProdutos) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Produto encontrado: ");
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removeProduto(int codigo) {
        for (Produto produto : arrayDeProdutos) {
            if (produto.getCodigo() == codigo) {
                arrayDeProdutos.remove(produto);
                System.out.println("Produto removido.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
