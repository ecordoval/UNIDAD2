import java.util.Scanner;

public class UD2_Eje11 {

    public static void main(String[] args) {

        boolean meInteresa = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de la vivienda: ");
        int precio = sc.nextInt();
        System.out.println("Ingrese la superficie de la vivienda: ");
        int superficie = sc.nextInt();
        System.out.println("¿Tiene garaje? (True/False) ");
        boolean tieneGaraje = sc.nextBoolean();

        if(precio < 150000 && superficie > 80 && tieneGaraje){
            meInteresa = true;

        }

        if(meInteresa){
            System.out.println("ME INTERESA");

        }
        else {
            System.out.println("NO ME INTERESA");

        }


        sc.close();

    }
}