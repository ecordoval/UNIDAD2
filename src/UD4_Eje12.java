import java.util.Scanner;

public class UD4_Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor n para obtener el Fibonacci:");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Ingrese el valor n para obtener el Fibonacci:");
        }

        int numero = sc.nextInt();

        System.out.println("f("+ numero+ ") = "+Fibonacci(numero));

    }

    private static int Fibonacci(int numero)
    {
        if(numero ==  0)
        {
            return  0;

        } else if (numero == 1){
            return  1;
        }
        else
        {
            return Fibonacci(numero-1)+Fibonacci(numero-2) ;

        }

    }


}