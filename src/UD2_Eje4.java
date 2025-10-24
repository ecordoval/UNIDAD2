import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje4 {
    public static void main (String [ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();
        System.out.println("La raíz cuadrada es :" + Math.sqrt(numero) ) ;

    }
}
