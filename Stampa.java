//Chiedere nome ed età e stamparli, poi chiedere l'età solo se il nome finisce con la 'o'
import java.util.Scanner;

public class Stampa {
    public static void main(String [] args){ //senza main il programma non vinene esguito
   
    // System.out.println("Come ti chiami?");
    // String nome = tastiera.nextLine();
    // System.out.println("Quanti anni hai?");
    // int eta = tastiera.nextInt();
    // System.out.println("Ciao " + nome + ", hai " +  eta + " anni");

    Scanner tastiera = new Scanner(System.in); 
    System.out.println("Come ti chiami?");
    String nome2 = tastiera.nextLine();
    char lastChar = nome2.charAt (nome2.length () - 1);
    int eta2 = 0;

    if(lastChar == 'o')  {
        System.out.println("Quanti anni hai?");
      eta2 = tastiera.nextInt();
      System.out.println("Ciao " + nome2 + ", hai " +  eta2 + " anni");
    }else{
        System.out.println("Il tuo nome non finisce con la 'o'");
    }
  

    }
    
}
