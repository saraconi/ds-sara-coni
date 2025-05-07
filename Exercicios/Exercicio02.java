import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Seu sexo (M/F): ");
    String sexo = entrada.nextLine();

    System.out.print("Seu tempo de trabalho (em anos): ");
    int tempo = entrada.nextInt();

    System.out.print("Seu salário: ");
    int salario = entrada.nextInt();

    entrada.close();

    int bonus;

    if (sexo.equalsIgnoreCase("M") && tempo > 15) {
      bonus = (salario / 100) * 20;
    } else if (sexo.equalsIgnoreCase("F") && tempo > 10) {
      bonus = (salario / 100) * 25;
    } else {
      bonus = (salario / 100) * 100;
    }

    System.out.println("Este é o seu bonus: R$ " + bonus);
  }
}
