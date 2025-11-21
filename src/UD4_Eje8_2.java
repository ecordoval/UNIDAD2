import java.util.Scanner;

public class UD4_Eje8_2 {

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un nùmero real #1:");

        while(!sc.hasNextDouble())
        {
            sc.nextLine();
            System.out.print("Ingrese un nùmero real #1:");

        }
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese un nùmero real #2:");

        while(!sc.hasNextDouble())
        {
            sc.nextLine();
            System.out.print("Ingrese un nùmero real #2:");

        }
        double numero2 = sc.nextDouble();

        System.out.println("El mayor de los 2 nùmeros reales es:"+ calcularMayor(numero1,numero2));
        sc.close();


    }

    private  static double calcularMayor(double numero1, double numero2)
    {
        if(numero1 > numero2)
        {
            return   numero1;
        }
        else {
            return  numero2;

        }

    }
}
