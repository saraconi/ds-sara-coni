
import java.util.Scanner;
public class Exercicio02 {
  public static void main (String[] args){


    Scanner entrada = new Scanner (System.in);

    int bonus; 

    System.out.println ("Seu sexo: ");
    String sexo = entrada.nextLine();

    System.out.println("Seu tempo de trabalho: ");
    int tempo = entrada.nextInt();

    System.out.println("Seu salario: ");
    int salario = entrada.nextInt();

   entrada.close();


   if (sexo.equalsIgnoreCase("M") && tempo > 15) {
     bonus = (salario/100)*20;
   }
   else if  (sexo.equalsIgnoreCase("F") && tempo > 10); {
      bonus = (salario/100)*25;
   } 
   else {
      bonus = (salario/100)*100;
   }

  }
}

  