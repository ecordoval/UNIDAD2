
import java.util.Scanner;


public class UD3_Eje30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura :");
        int altura = sc.nextInt();

        for (int i=0 ; i< altura ; i ++)
        {

            System.out.println("*".repeat(i+1));

        }



    }
}