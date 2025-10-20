
import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje5_3 {

    public static void main (String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        int numero2 = sc.nextInt();
        sc.nextLine();


        double ramdom1 =Math.random();
        double ramdom2 =Math.random();
        double ramdom3 =Math.random();

        int numeroAleatorio1 = (int) (ramdom1 * (numero2-numero1)+ numero1);
        int numeroAleatorio2 = (int) (ramdom2 * (numero2-numero1)+ numero1);
        int numeroAleatorio3 = (int) (ramdom3 * (numero2-numero1)+ numero1);

        System.out.println("Los números aleatorios son: "+numeroAleatorio1+"," + numeroAleatorio2+"," + numeroAleatorio3);

    }
}
