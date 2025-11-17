import java.util.Scanner;

public class UD4_Eje4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número :");
        while  (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese un número :");
        }
        int numero = sc.nextInt();

        System.out.println("TABLA DE MULTIPLICAR DEL "+ numero);
        System.out.println("==========================");
        EscribirTablaMultiplicar(numero);

        sc.close();

    }

    static void EscribirTablaMultiplicar (int numero)
    {

        for (int i=0; i < 10; i++)
        {
            System.out.println(numero+ "x"+(i+1)+"="+(numero*(i+1)));
        }

    }





}
