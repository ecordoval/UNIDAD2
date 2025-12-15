import java.util.Arrays;
import java.util.Scanner;

public class UD5_Eje13 {
    public static void main (String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de nombres: ");

        while (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese la cantidad de nombres: ");

        }
        int numero = sc.nextInt();

        String [] nombres = new String[numero];

        for (int i =0 ; i< nombres.length; i++)
        {
            System.out.print("Ingrese el nombre ["+(i+1)+"]: ");
            nombres[i] = sc.next();
        }

        Arrays.sort(nombres);

        System.out.print("La lista ordenada es: ");
        for (String a: nombres)
        {
            System.out.print(a+" ");
        }

    }
}
