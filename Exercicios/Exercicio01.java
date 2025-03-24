import java.util.Scanner;


public class Exercicio01 {
  public static void main (String[] args){

    
    
    Scanner NomeFunc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");  
        String Nome = NomeFunc.nextLine();

        Scanner HorasTrab = new Scanner(System.in);
        System.out.println("Insira suas horas de trabalho: ");  
        int Horas = HorasTrab.nextInt();


        Scanner Salar = new Scanner(System.in);
        System.out.println("Insira seu salario: ");  
        int Salario = Salar.nextInt();

        Scanner VporH = new Scanner(System.in);
        System.out.println("Insira seu salario por hora: ");  
        float VporHora = VporH.nextFloat();

        Scanner Filho14 = new Scanner(System.in);
        System.out.println("Insira a quantidade de seus filhos de idade inferior a 14 anos: ");  
        int Finf14 = Filho14.nextInt();


        Scanner Suaidade = new Scanner(System.in);
        System.out.println("Insira a sua iadade: ");  
        int Idade = Suaidade.nextInt();

        Scanner TempoServ = new Scanner(System.in);
        System.out.println("Insira seu tempo de serviço (Em anos): ");  
        int Tempo = TempoServ.nextInt();

        Scanner SalarFam = new Scanner(System.in);
        System.out.println("Insira o valor do salario familia por filho:  ");  
        int Familia = SalarFam.nextInt();

        

    NomeFunc.close();
    Salar.close();
    VporH.close();
    Filho14.close();
    Suaidade.close();
    TempoServ.close();
    SalarFam.close();

    int  SalarBrt = (byte) Horas/VporHora ; 
    int SalarioFam = Familia * Finf14;
    int IR;
    int Adic;
    int Adic2;

    if (SalarBrt < 1500) {
        Int IR = (SalarBrt/100*15);
        System.out.println("Seu Imposto de renda" + IR);
    } if else (SalarBrt > 500) {
        Int IR = (SalarBrt/100*8.5);
        System.out.println("Seu Imposto de renda " + IR);

    } else (SalarBrt = 500) {
        System.out.println("Seu Imposto de renda: 0" );
    }

    if (Idade < 40){
      int Adic = (Idade/100*2);
      System.out.println("Seus adcionais:" + Adic);
    }  if else ( Idade > 15){
        int Adic2 = (Idade/100*3.5);
        System.out.println("Seus adcionais: " + Adic2);
    } else ()




































//FINAL!!!!
 System.out.println("Nome: " + Nome);        
 System.out.println("Salario: " + Salario); 
 System.out.println("Salario por hora: " + VporHora);     
 System.out.println("Flho(s) com menos de 14: " + Finf14);
System.out.println("Sua idade: " + Idade);
System.out.println("Seu tempo de serviço (em anos): " + Tempo);
System.out.println("Valor de salario familia po filho: " + Familia);


    }
    }