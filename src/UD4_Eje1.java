import java.util.Scanner;

public class UD4_Eje1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número :");
        while  (!sc.hasNextDouble())
        {
            sc.nextLine();
            System.out.print("Ingrese un número :");
        }
        double numero = sc.nextDouble();

        System.out.println(signo(numero));


    }

    private static int signo (double numero)
    {
        if(numero<0)
        {
            return -1;
        }
        else if ( numero == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

}
