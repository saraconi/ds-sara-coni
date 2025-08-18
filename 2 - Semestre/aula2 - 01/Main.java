import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      
        System.out.println("Insira seu nome: ");  
         String nome = scanner.nextLine();

        System.out.println("Insira seu email: ");
          String email = scanner.nextLine();

        System.out.println("Insira sua idade: ");
          int idade = scanner.nextInt();


      scanner.close();

      nome.exibirInfo();
      email.exibirInfo();
      idade.exibirInfo();
    }

}   

// Criar metodo para inserir os dados do usuario, usando a classe Scanner 
 




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