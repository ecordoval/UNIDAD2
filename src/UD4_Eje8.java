import java.util.Scanner;

public class UD4_Eje8 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Ingrese numero entero #1:");
        while (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese numero entero #1:");

        }
        int numero1 = sc.nextInt();
        System.out.print("Ingrese numero entero #2:");
        while (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese numero entero #2:");

        }
        int numero2 = sc.nextInt();
        System.out.println("El mayor de 2 números enteros es:"+ calcularMayor(numero1,numero2));

        sc.close();
    }

    private static int calcularMayor(int numero1, int numero2)
    {
       if(numero1 > numero2){
           return numero1;
       }
       else {
           return numero2;
       }

    }

}
