import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Produto produto = new Produto();
        System.out.println("Entre com o numero de produtos");

        System.out.println("Nome: ");
        produto.nome = input.nextLine();

        System.out.println("Preco: ");
        produto.preco = input.nextDouble();

        System.out.println("Quantidade no estoque: ");
        produto.quantidade = input.nextInt();
        //Termino da leitura de dados do produto.

        System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);

        input.close();
    }
}
