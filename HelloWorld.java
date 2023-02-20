import java.util.Scanner;



public class HelloWorld{
    public static void main(String [] args){

        System.out.println("Hello World!");
        System.out.println("Scegli il primo numero");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Scegli il secondo numero");
        int b = input.nextInt();
        int r = 0;
        System.out.println("Premi 1 per la somma, 2 per la differenza, 3 per la divisione, 4 per la moltiplicazione");
        int op = input.nextInt();
        switch(op){
            case 1: 
                     r = a + b;
                     System.out.println("Il risultato è " + r);
    
                     break;
            case 2:
                     r = a - b;
                     System.out.println("Il risultato è " + r);
    
                     break;
    
            case 3 :
                     r = a / b;
                     System.out.println("Il risultato è " + r);
    
                     break;
    
            case 4: 
                     r = a * b;
                     System.out.println("Il risultato è " + r);
    
                     break;
            default: System.out.println("Inserisci un numero tra 1 e 4");
    
        }
    
    }

}

