package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      Triangle x,y;
      x = new Triangle();
      y = new Triangle();

      System.out.println("Entre com as medidas do triangulo X: ");
      x.a = input.nextDouble();
      x.b = input.nextDouble();
      x.c = input.nextDouble();

      System.out.println("Entre com as medidas do triangulo Y: ");
      y.a = input.nextDouble();
      y.b = input.nextDouble();
      y.c = input.nextDouble();

     
      double areaX = x.area();

      double areaY = y.area();
      
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
