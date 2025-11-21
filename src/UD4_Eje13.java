import java.util.Scanner;

public class UD4_Eje13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor n para obtener la secuencia Fibonacci:");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Ingrese un valor n para obtener la secuencia Fibonacci:");
        }

        int numero = sc.nextInt();

        Fibonacci(numero);

    }

     static void Fibonacci(int numero)
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