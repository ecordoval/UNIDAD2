import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje5_2 {

    public static void main (String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        double ramdom1 =Math.random();
        double ramdom2 =Math.random();
        double ramdom3 =Math.random();

        int numeroAleatorio1 = (int) (ramdom1 * numero)+ 1;
        int numeroAleatorio2 = (int) (ramdom2 * numero)+ 1;
        int numeroAleatorio3 = (int) (ramdom3 * numero)+ 1;

        System.out.println("Los números aleatorios son: "+numeroAleatorio1+" " + numeroAleatorio2+" " + numeroAleatorio3);

    }
}
