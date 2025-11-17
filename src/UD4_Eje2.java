import java.util.Scanner;

public class UD4_Eje2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número entero #1 :");
            while  (!sc.hasNextInt())
            {
                sc.nextLine();
                System.out.print("Ingrese un número entero #1 :");
            }
            int numero1 = sc.nextInt();

            System.out.print("Ingrese un número entero #2 :");
            while  (!sc.hasNextInt())
            {
                sc.nextLine();
                System.out.print("Ingrese un número entero #2 :");
            }
            int numero2 = sc.nextInt();


            System.out.println("El menor de los 2 números es: "+calcularMenor(numero1,numero2));

            sc.close();

        }

        private static int calcularMenor (int numero1, int numero2)
        {
            return Math.min(numero1, numero2);
        }

}


