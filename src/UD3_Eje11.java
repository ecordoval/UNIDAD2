import java.util.Scanner;

public class UD3_Eje11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        sc.nextLine() ;
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        sc.nextLine() ;
        int division = 0;

        if(numero1 >= numero2) {

             int tmp = numero1;
             do {
                 tmp = tmp - numero2;
                 division++;
             }
             while (tmp > numero2);

         }
        System.out.println("La división es: " + division);

        sc.close();
    }
}
