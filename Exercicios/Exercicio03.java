
import java.util.Scanner;


public class Exercicio03 {
  public static void main (String[] args){
  Scanner scanner = new Scanner (System.in);

  System.out.println("Medida do lado a: ");
  int A = scanner.nextInt();

  System.out.println("Medida do lado b: ");
  int B = scanner.nextInt();

  System.out.println("Medida do lado c: ");
  int C = scanner.nextInt();

  scanner.close();

if (A > B + C) {
    System.out.println("Nao forma triangulo algum");
    return;
}  


if (A*A == B*B + C*C) {
    System.out.println("Formam um triangiulo retangulo");
    return;
} else if (A*A > B*B  + C*C) {
   System.out.println("Formam um triangulo obtusangulo");
   return;
} else ( A*A  <  B*B  + C*C); { // ERRO (The left-hand side of an assignment must be a variable) 
  System.out.println("Forma um triangulo acutangulo");
}

if (A == B && B == C && A == C) {
  System.out.println("Forma um triangulo equilatero");
  return;
} else  (A == B || B == C || A == C); {
  System.out.println("Formam um triangulo isosceles");
}







  }
  }