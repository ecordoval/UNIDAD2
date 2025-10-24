import java.util.Scanner;

public class UD3_Eje10 {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        sc.nextLine() ;
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        sc.nextLine() ;
        int acumulador = 0;

        for (int i = 0; i < numero2 ; i++) {

            acumulador +=  numero1;

        }
        System.out.println("La multiplicación es: "+ acumulador);
        sc.close();
    }
}
