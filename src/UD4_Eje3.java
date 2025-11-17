import java.util.Scanner;

public class UD4_Eje3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base :");
        while  (!sc.hasNextDouble())
        {
            sc.nextLine();
            System.out.print("Ingrese la base :");
        }
        double base = sc.nextDouble();

        System.out.print("Ingrese el exponente :");
        while  (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese el exponente :");
        }
        int exponente = sc.nextInt();

        System.out.println("El exponente es: "+exponente(base,exponente));

        sc.close();

    }

    private static double exponente (double base, int exponente)
    {   double multiplicacion=1;
        for (int i=0; i< exponente; i++)
        {
            multiplicacion*= base;

        }
        return  multiplicacion;

    }

}

