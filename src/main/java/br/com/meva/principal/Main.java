package br.com.meva.principal;

import br.com.meva.classes.Eletronico;
import br.com.meva.classes.Estoque;
import br.com.meva.classes.Roupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estoque estoque = new Estoque();

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 9) {

            System.out.println("\n1 - Adicionar produtos ao estoque" +
                    "\n2 - Listar produtos em estoque" +
                    "\n3 - Atualizar quantidade de produtos em estoque" +
                    "\n4 - Buscar produtos por codigo" +
                    "\n5 - Remover produtos do estoque" +
                    "\n9 - Sair");

            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {

                System.out.println("Deseja adicionar um:" +
                        "\n1 - Eletrônico" +
                        "\n2 - Roupa");

                int opcaoDesejada = scanner.nextInt();

                System.out.println("Nome do produto: ");
                scanner.nextLine();
                String nomeProduto = scanner.nextLine();

                System.out.println("Código do produto: ");
                int codigoProduto = scanner.nextInt();

                System.out.println("Preço do produto: ");
                double precoProduto = scanner.nextDouble();

                System.out.println("Quantidade do produto: ");
                int qtdProduto = scanner.nextInt();

                if (opcaoDesejada == 1) {
                    Eletronico eletronico = new Eletronico(nomeProduto, codigoProduto, precoProduto, qtdProduto);
                    estoque.adicionaProdutos(eletronico);
                } else if (opcaoDesejada == 2) {
                    Roupa roupa = new Roupa(nomeProduto, codigoProduto, precoProduto, qtdProduto);
                    estoque.adicionaProdutos(roupa);
                }
            } else if (opcaoEscolhida == 2) {
                estoque.listaProdutos();
            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o código do produto: ");
                int atualizaProduto = scanner.nextInt();

                System.out.println("Digite a quantidade: ");
                int quantidadeProduto = scanner.nextInt();

                estoque.atualizaProdutos(atualizaProduto, quantidadeProduto);
            } else if (opcaoEscolhida == 4) {
                System.out.println("Digite o código do produto a ser encontrado: ");
                int buscaProduto = scanner.nextInt();

                estoque.buscaPorCodigoProduto(buscaProduto);
            } else if (opcaoEscolhida == 5) {
                System.out.println("Digite o código do produto a ser removido: ");
                int removeProduto = scanner.nextInt();

                estoque.removeProduto(removeProduto);
            }
        }
        scanner.close();
    }
}
