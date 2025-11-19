import java.util.Scanner;

public class UD4_Eje14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero:");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Ingrese un número entero:");
        }

        int numero =  sc.nextInt();

        System.out.println("La suma de las cifras es: "+sumaCifras(numero));

        sc.close();

    }

    private static int sumaCifras(int numero)
    {
        if (numero == 1)
        {
            System.out.print(0);
        }
        else {
            int a = 0, b = 1;
            System.out.print(a + ", " + b);
            for (int i = 0; i <= numero - 3; i++) {
                int siguiente = a + b;
                System.out.print(", " + siguiente);
                a = b;
                b = siguiente;
            }
        }


    }
}


564

        564%10 = 4
        564/10 = 56

        56%10 = 6
        56/10 = 50

        50%10 = 5
        50/10 = 5





