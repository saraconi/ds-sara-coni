
import java.util.Scanner;

public class Exercicio02 {
  public static void main (String[] args){
 Scanner scanner = new Scanner (System.in);

 System.out.println ("Seu codigo:  ");
  String codigo = scanner.nextLine();

 System.out.println ("Seu sexo: ");
  String sexo = scanner.nextLine();

 System.out.println("Seu tempo de trabalho: ");
  int tempo = scanner.nextInt();

 System.out.println("Seu salario: ");
  int salario = scanner.nextInt();

 scanner.close();

if (sexo == "masculino" && tempo > 15) {
    int bonus = (salario/100)*20;
}
else if (sexo == "feminino" && tempo > 10) {
    int bonus = (salario/100)*25;
} 
else (tempo <= 10) { // Erro (The left-hand side of an assignment must be a variable) 
    int bonus = (salario/100)*100;
} 

// OS DEMAIS FUNCIONARIOS DEVEM RECBER BONUS DE 100% (?????????) (como fazer isso?)


  }

  }