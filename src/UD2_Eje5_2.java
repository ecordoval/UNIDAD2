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

        if(numero >=0 && numero<=10)
        {

            int numeroAleatorio1 = (int) (ramdom1 * 10)-numero;
            System.out.println("Los números aleatorios son: "+Math.abs(numeroAleatorio1));

        }
        else{

            //

        }
//        double ramdom1 =Math.random();
//        int numeroAleatorio1 = (int) (ramdom1 * 100)-numero;
//

//        int numeroAleatorio2 = (int) (ramdom2 * 100)-numero;
//

//        int numeroAleatorio3 = (int) (ramdom3 * 100)-numero;

        System.out.println(ramdom1+ " "+ ramdom2 + " " + ramdom3);

   //    System.out.println("Los números aleatorios son: "+Math.abs(numeroAleatorio1));//+ " " + Math.abs(numeroAleatorio2)+" " + Math.abs(numeroAleatorio3));



    }
}
