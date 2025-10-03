/*Questão 1 – Controle de Estoque com Contador Estático
● Crie uma classe ControleEstoque com atributos não estáticos: nome, preco e
quantidade.
● Use um atributo estático totalProdutos que conta quantos produtos
(objetos diferentes) já foram cadastrados. (dica: incrementar no
construtor)
● Crie um método não estático que calcule (e retorne) o valor total em
estoque (preco * quantidade).
● Crie uma classe Produto que use Scanner para cadastrar 3
produtos diferentes e teste tudo.
● Exiba o valor total de cada produto e, ao final, o número total de
produtos cadastrados.
 */



import java.util.Scanner;

public class ControleEstoque {
    String nome;
    double preco;
    int quantidade;

    static int totalControleEstoque = 0;

    ControleEstoque(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        totalControleEstoque++;
    }

    double valorTotal(double preco, int quantidade){
        return preco * quantidade;
    }
}

class Produto{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Produto 1: ");
        String nome = ler.nextLine();
        System.out.println("Quantidade: ");
        int quantidade = ler.nextInt();
        ler.nextLine();
        System.out.println("Preco: ");
        double preco = ler.nextDouble();
        ler.nextLine();

        ControleEstoque p1 = new ControleEstoque(nome, preco, quantidade);

        System.out.println("Produto 2: ");
        String nome2 = ler.nextLine();
        System.out.println("Quantidade: ");
        int quantidade2 = ler.nextInt();
        ler.nextLine();
        System.out.println("Preco: ");
        double preco2 = ler.nextDouble();
        ler.nextLine();

        ControleEstoque p2 = new ControleEstoque(nome2, preco2, quantidade2);

        System.out.println("Produto 3: ");
        String nome3 = ler.nextLine();
        System.out.println("Quantidade: ");
        int quantidade3 = ler.nextInt();
        ler.nextLine();
        System.out.println("Preco: ");
        double preco3 = ler.nextDouble();
        ler.nextLine();

        ControleEstoque p3 = new ControleEstoque(nome3, preco3, quantidade3);

        System.out.println("Valor total do Produto 1: "+p1.valorTotal(preco,quantidade));
        System.out.println("Valor total do Produto 2: "+p2.valorTotal(preco2,quantidade2));
        System.out.println("Valor total do Produto 3: "+p3.valorTotal(preco3,quantidade3));

        System.out.println("Total de produtos cadastrados"+ControleEstoque.totalControleEstoque);

    }
}