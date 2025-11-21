import java.util.Random;
import java.util.Scanner;

public class UD5_Eje5 {

    public static void main(String [] args)
    {
        int [] array = new int [10];

        for (int i =0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }

        for ( int a : array)
        {
            System.out.print(a+" ");

        }


        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nIngrese un nùmero entero:");
            while (!sc.hasNextInt())
            {
                sc.nextLine();
                System.out.print("\nIngrese un nùmero entero a buscar:");

            }
            int numero = sc.nextInt();

            if (numero <0)
            {
                break;
            }

            for ( int a : array)
            {
                System.out.print(a+" ");

            }
            System.out.print("sdsd");



        }

    }

}
