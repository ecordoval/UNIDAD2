
import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje6 {

  public static void main (String [] args)
    {
        int mayor = 0;
        int menor = 0;
        boolean multiplo = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        int numero2 = sc.nextInt();

        if( numero1 > numero2)
        {
            mayor = numero1;
            menor = numero2;
        }
        else
        {
            mayor = numero2;
            menor = numero1;
        }

        if (mayor % menor == 0)
        {
                multiplo = true;
        }

        System.out.println("El mayor es: "+mayor );
        System.out.println("El menor es: "+menor );

        if( multiplo)
        {
            System.out.println("El mayor es múltiplo del menor" );
        }
        else
        {
            System.out.println("El mayor NO es múltiplo del menor" );
        }
    }
}
