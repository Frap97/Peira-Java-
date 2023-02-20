//Calcolare il resto in base al costo del prodotto e le monete inserite, lasciare 5.30€ in monete, con meno nomete possibili
import java.util.Scanner;

public class Distributore {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci un numero da 1 a 99");
        int centesimi = input.nextInt();
        int cinquantaCent = centesimi / 50;
        centesimi = centesimi - cinquantaCent*50;
        int ventiCent = centesimi / 20;
        centesimi = centesimi - cinquantaCent*20;
        int dieciCent = centesimi / 10;
        centesimi = centesimi - dieciCent*10;
        int cinqueCent = centesimi / 5;
        centesimi = centesimi - cinqueCent*5;
        int dueCent = centesimi / 2;
        centesimi = centesimi - dueCent*2;
        int unCent = centesimi / 10;
        centesimi = centesimi - unCent*10;
        System.out.println("Ci sono" + cinquantaCent + " da 50cent," + ventiCent "da 20 cent, " + dieciCent + " da 10 cent, " + cinqueCent + "da 5 cent");
    }
    
}
