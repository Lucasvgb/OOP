import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Produto produto = new Produto();
        System.out.println("Entre com os dados dos produtos");

        System.out.println("Nome: ");
        produto.nome = input.nextLine();

        System.out.println("Preco: ");
        produto.preco = input.nextDouble();

        System.out.println("Quantidade no estoque: ");
        produto.quantidade = input.nextInt();
        //Termino da leitura de dados do produto.

        System.out.println();
        System.out.printf("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Entre com o numero de produtos para serem adicionados no estoque");
        int quantidade = input.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.printf("Atualizar dados: " + produto);

        System.out.println();
        System.out.print("Entre com o numero de produtos para serem removidos do estoque");
        quantidade = input.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Atualizar dados: " + produto);

        input.close();
    }
}
