import java.util.Scanner;


public class Exercicio01 {
  public static void main (String[] args){


    
    Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Insira seu nome: ");  
        String Nome = Scanner1.nextLine();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Insira suas horas de trabalho: ");  
        int Horas = Scanner2.nextInt();

        Scanner Scanner3 = new Scanner(System.in);
        System.out.println("Insira seu salario por hora: ");  
        float VporHora = Scanner3.nextFloat();

        Scanner Scanner4 = new Scanner(System.in);
        System.out.println("Insira a quantidade de seus filhos de idade inferior a 14 anos: ");  
        int Filho14 = Scanner4.nextInt();

        Scanner Scanner5 = new Scanner(System.in);
        System.out.println("Insira a sua iadade: ");  
        int idade = Scanner5.nextInt();

        Scanner Scanner6 = new Scanner(System.in);
        System.out.println("Insira seu tempo de serviço (Em anos): ");  
        int TempoServ = Scanner6.nextInt();

        Scanner Scanner7 = new Scanner(System.in);
        System.out.println("Insira o valor do salario familia por filho:  ");  
        int SalarFamilia = Scanner7.nextInt();

        

     int SalarBrt = (Horas/VporHora); 
     int INPS = ((SalarBrt/100)*8.5);
     int SalarioFam = (SalarFamilia * Filho14);
     int IR = 0;
     int Adic = 0;
     int Adic2 = 0;
     int SalarLiq = (SalarBrt + Adic + Adic2 + SalarFam - Imposto);


   
    if (SalarBrt < 1500) {
        IR = ((SalarBrt/100)*15);
        System.out.println("Seu Imposto de renda" + IR);
    } else if (SalarBrt > 500) {
         IR = ((SalarBrt/100)*8);
        System.out.println("Seu Imposto de renda " + IR);

    } else  (SalarBrt = 500) {
        System.out.println("Seu Imposto de renda: 0" );
    }


    if (Idade < 40){
       Adic = ((SalarBrt/100)*2);
      System.out.println("Seus adcionais:" + Adic);
    }  
   


    if  ( TempoServ > 15){
        int Adic2 = ((Idade/100)*3.5);
        System.out.println("Seus adcionais: " + Adic2);
    } else (TempoServ <= 15 && TempoServ > 5 && idade > 30){
        int Adic2 = ((SalarBrt/100)*1.5);
        System.out.println("Seus adcionais: " + Adic2)
    }



System.out.println("Nome do funcionario: " + Nome);
System.out.println("Valor do salario liquido: " + SalarLiq);
System.out.println("Valor do salario bruto: " + SalarBrt);
System.out.println("Valor total dos descontos: " + (Imposto + INPS));
System.out.println("Valor total dos adcionais " + (Adic + Adic2));


    Scanner1.close();
    Scanner2.close();
    Scanner3.close();
    Scanner4.close();
    Scanner5.close();
    Scanner6.close();
    Scanner7.close();

    }
    }

