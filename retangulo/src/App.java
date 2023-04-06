import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;


/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e a altura do retangulo:");
        retangulo.largura = input.nextDouble();
        retangulo.altura = input.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        input.close();
    }
}
