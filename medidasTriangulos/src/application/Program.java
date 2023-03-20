package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      double xA, xB, xC; //Triângulo X
      double yA, yB, yC; //Triângulo Y

      System.out.println("Entre com as medidas do triangulo X: ");
      xA = input.nextDouble();
      xB = input.nextDouble();
      xC = input.nextDouble();

      System.out.println("Entre com as medidas do triangulo Y: ");
      yA = input.nextDouble();
      yB = input.nextDouble();
      yC = input.nextDouble();

      double p = (xA + xB + xC) / 2.0;
      double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); // FormulaParaCalcularArea Triângulo X

      p = (yA + yB + yC) / 2.0;
      double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // FormulaParaCalcularArea Triângulo Y
      
      System.out.printf("Area do triangulo X: %.4f%n", areaX);
      System.out.printf("Area do triangulo Y: %.4f%n", areaY);

      //Analisando qual é a maior.
      if(areaX > areaY){
        System.out.println("Maior area: X");
      }
      else{
        System.out.println("Maior area: Y");
      }


      input.close();
  }
}
