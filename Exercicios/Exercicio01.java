import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira suas horas de trabalho: ");
        int horas = scanner.nextInt();

        System.out.print("Insira seu salario por hora: ");
        float vPorHora = scanner.nextFloat();

        System.out.print("Insira a quantidade de filhos com menos de 14 anos: ");
        int filhos14 = scanner.nextInt();

        System.out.print("Insira a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Insira seu tempo de serviço (em anos): ");
        int tempoServ = scanner.nextInt();

        System.out.print("Insira o valor do salário família por filho: ");
        float salarioFamilia = scanner.nextFloat();

        float SalarioBruto = horas * vPorHora;
        float INPS = (SalarioBruto / 100) * 8.5f;
        float SalarioFam = salarioFamilia * filhos14;

        float IR;
        if (SalarioBruto < 500) {
            IR = 0;
        } else if (SalarioBruto <= 1500) {
            IR = (SalarioBruto / 100) * 8;
        } else {
            IR = (SalarioBruto / 100) * 15;
        }

        float Adic = 0;
        if (idade < 40) {
            Adic = (SalarioBruto / 100) * 2;
        }

        float Adic2 = 0;
        if (tempoServ > 15) {
            Adic2 = (idade / 100f) * 3.5f;
        } else if (tempoServ > 5 && tempoServ <= 15 && idade > 30) {
            Adic2 = (SalarioBruto / 100) * 1.5f;
        }

        float SalarioLiquido = SalarioBruto + Adic + Adic2 + SalarioFam - INPS - IR;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário bruto: R$ " + SalarioBruto);
        System.out.println("Salário família: R$ " + SalarioFam);
        System.out.println("INPS: R$ " + INPS);
        System.out.println("Imposto de Renda: R$ " + IR);
        System.out.println("Adicional por idade: R$ " + Adic);
        System.out.println("Adicional por tempo de serviço: R$ " + Adic2);
        System.out.println("Salário líquido: R$ " + SalarioLiquido);

        scanner.close();
    }
}
