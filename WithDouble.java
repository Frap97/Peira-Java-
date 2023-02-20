import java.lang.Math.*;
import java.util.Scanner;

public class WithDouble {

    public static void main(String [] args){
        Scanner tastiera = new Scanner (System.in);
        System.out.println("Insersci l'altezza del rettangolo");
        int altezza = tastiera.nextInt();
        System.out.println("Insersci la base del rettangolo");
        int base = tastiera.nextInt();
        int perimetro = (altezza + base) * 2;
        int area = altezza * base;
        System.out.println("Il perimetro vale: " + perimetro);
        System.out.println("L'area vale: " + area);
        double diagonale = Math.sqrt((Math.pow(altezza, 2) + Math.pow(base, 2)));
        double dRound = (Math.round(diagonale*100.0)/100.0);
        System.out.println("La diagonale vale: " + dRound);

    }
    
}
