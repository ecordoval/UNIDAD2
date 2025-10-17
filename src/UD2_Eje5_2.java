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
        int numeroAleatorio1 = 0;
        int numeroAleatorio2 = 0;
        int numeroAleatorio3 = 0;

        if(numero >=0 && numero<=1)
        {
            numeroAleatorio1 = (int) (ramdom1);
            numeroAleatorio3 = (int) (ramdom2);
            numeroAleatorio2 = (int) (ramdom3);

        }

        if(numero >=2 && numero<=10)
        {
            numeroAleatorio1 = (int) (ramdom1 * 10)-numero;
            numeroAleatorio2 = (int) (ramdom2 * 10)-numero;
            numeroAleatorio3 = (int) (ramdom3 * 10)-numero;

        }
        if(numero >=11 && numero<=100)
        {
            numeroAleatorio1 = (int) (ramdom1 * 100)-numero;
            numeroAleatorio2 = (int) (ramdom2 * 100)-numero;
            numeroAleatorio3 = (int) (ramdom3 * 100)-numero;

        }

//        double ramdom1 =Math.random();
//        int numeroAleatorio1 = (int) (ramdom1 * 100)-numero;
//

//        int numeroAleatorio2 = (int) (ramdom2 * 100)-numero;
//

//        int numeroAleatorio3 = (int) (ramdom3 * 100)-numero;

        System.out.println(ramdom1+ " "+ ramdom2 + " " + ramdom3);
        System.out.println("Los números aleatorios son: "+Math.abs(numeroAleatorio1)+" " + Math.abs(numeroAleatorio2)+" " + Math.abs(numeroAleatorio3));

   //    System.out.println("Los números aleatorios son: "+Math.abs(numeroAleatorio1));//+ " " + Math.abs(numeroAleatorio2)+" " + Math.abs(numeroAleatorio3));



    }
}
