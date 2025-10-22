
import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje8 {

    public static void main (String [] args)
    {
        double resultado=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        Double dividendo = sc.nextDouble();

        System.out.println("Ingrese el divisor: ");
        Double divisor = sc.nextDouble();

        if (divisor != 0)
        {
            resultado = (dividendo / divisor);
        }
        else
        {
            System.out.println("Error: No se puede dividir por cero.");
        }

        System.out.printf("El resultado es %.3f ", resultado);

    }
}
