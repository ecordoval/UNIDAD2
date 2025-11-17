import java.util.Scanner;

public class UD4_Eje6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número :");
        while  (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese el primer número :");
        }
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número :");
        while  (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese el segundo número :");
        }
        int numero2 = sc.nextInt();

        System.out.println("La media aritmética es: "+ mediaritmetica(numero1,numero2));

        sc.close();

    }

    private static double mediaritmetica (int numero1, int numero2)
    {
        return (numero1 + numero2)/2.0;
    }
}
