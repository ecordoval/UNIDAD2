import java.util.Scanner;

public class UD4_Eje14 {

    static int suma =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero:");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Ingrese un número entero:");
        }

        int numero = sc.nextInt();

        System.out.println("La suma de las cifras es: " + sumaCifras(numero));

        sc.close();

    }

    private static int sumaCifras(int numero) {
     
        if (numero == 0) {
            return suma;
        } else {
            int cifra= numero % 10;
             suma = suma +cifra;
            return sumaCifras(numero/10);

        }

    }
}
        /*
        564%10 = 4
        564/10 = 56

        56%10 = 6
        56/10 = 5

        5%10 = 5
        5/10 = 0

*/




