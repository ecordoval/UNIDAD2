
import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje8 {

    public static void main (String [] args)
    {
        double resultado=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = sc.nextDouble();

        System.out.print("Ingrese el divisor: ");
        double divisor = sc.nextDouble();

        if (divisor != 0)
        {
            resultado = (dividendo / divisor);
            System.out.printf("El resultado es %.3f ", resultado);
        }
        else
        {
            System.out.println("Error: No se puede dividir por cero.");
        }



    }
}
