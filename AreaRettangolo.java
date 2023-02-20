//perimetro e area di un rettangolo
import java.util.Scanner;

//chiedere numero di lati e poi calcolare il perimetro

public class AreaRettangolo {
    public static void main(String [] args){

        // Scanner tastiera = new Scanner (System.in);
        // System.out.println("Insersci l'altezza del rettangolo");
        // int altezza = tastiera.nextInt();
        // System.out.println("Insersci la base del rettangolo");
        // int base = tastiera.nextInt();
        // int perimetro = (altezza + base) * 2;
        // int area = altezza * base;
        // System.out.println("Il perimetro vale " + perimetro);
        // System.out.println("L'area vale " + area);
        int sum = 0;
        Scanner tastiera = new Scanner (System.in);
        System.out.println("Quanti lati ha il poligono?");
        int lati = tastiera.nextInt();

        for(int i = 1; i <= lati; i++){
            System.out.println("Quanto è lungo un il lato " + i);
            int lato = tastiera.nextInt();
            sum = lato + sum;
        }
        System.out.println("Il perimetro vale " + sum);
    }
    
}
