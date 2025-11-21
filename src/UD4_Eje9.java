import java.util.Scanner;

public class UD4_Eje9 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero:");

        while (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.println("Ingrese un número entero:");
        }

        int numero = sc.nextInt();

        contarAtras(numero);

        sc.close();



    }

    static void contarAtras(int numero)
    {
        if(numero < 0)
            return;
        else {
            System.out.println (numero);
            contarAtras(numero-1);

        }

    }

}
