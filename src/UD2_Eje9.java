import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje9 {

    public static void main (String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("El resultado de elevar el primero al segundo es:"+ Math.pow(numero1, numero2));

        sc.close();


    }
}
