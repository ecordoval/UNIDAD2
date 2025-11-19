import java.util.Scanner;

public class UD4_Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número:");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Ingrese un número entero:");
        }

        int numero = sc.nextInt();

        System.out.println("El factorial del nùmero "+ numero+ " es :"+factorial(numero));

    }

    private static int factorial(int numero)
    {
        if(numero == 1)
        {
            return  1;

        }
        else {
            return numero * factorial(numero-1);

        }

    }


}