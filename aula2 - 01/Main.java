import.java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner Nome = new Scanner(System.in);
        System.out.println("Insira seu nome: ");  
         String nome = Nome.nextString();

      Scanner Email = new Scanner(System.in);
      System.out.println("Insira seu email: ");
      String email = Email.nextString();

      Scanner Idade = new Scanner(System.in);
      Syatem.out.println("Insira sua idade: ");
      int idade = Idade.nextInt();

      Nome.close();
      Email.close();
      Idade.close();
    }
}   

// Criar metodo para inserir os dados do usuario, usando a classe Scanner 
 

---------------------------------------------------------------------------------------


 //public class Main {
   // public static void main(String[] args) {

        //Criar um novo objeto Usuario usando o contrutor
     //   Usuario usuario1 = new Usuario ("João", "joao@email.com", 37)

        //Exibe informações do usuario
       // usuario1.exibirInfo();

        //Altera o nome de usando o setter 
        //usuario1.setNome("João Siles");

        //Exibe novamente apos a alterção 
        //System.out.println("\nApós alteração de nome:");
        //usuario1.exibirInfo();
    //}
//} 