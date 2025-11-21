import java.util.Scanner;

public class UD4_Eje10 {
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
        int factorial =1 ;
        for (int i =numero ; i > 0; i--)
        {
            factorial *=  i;

        }
        return factorial;

    }


}