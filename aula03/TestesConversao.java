
   import java.util.Scanner; // import the Scanner class 

class TestesConversao {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int maxScore = 1000;
    int userScore = 100;
    float percentage = (float) userScore / maxScore * 100.0f;
    System.out.println(""); 
    String userName = myObj.nextLine();   

    System.out.println("User's percentage is " + percentage);
  }
}
 // TA DANDO ERRO
 