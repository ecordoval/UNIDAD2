import java.util.Scanner;

public class UD3_Eje13 {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero= sc.nextInt();
        sc.nextLine();
        int cociente = numero/ 10 ;
        int count =1 ;

        while (cociente != 0){
         cociente = cociente /10 ;
         count ++;
        }
       // while (cociente != 0);
        System.out.println("El número "+ numero+ " tiene "+count + " cifras");
        sc.close();
    }
}
