import java.util.Scanner;

public class UD3_Eje32 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número :");
        int numero = sc.nextInt();

        System.out.print("Los divisores enteros son : ");
        for(int i = 2; i<numero ; i++)
        {

            if(numero % (i)==0)
            {
                if(i==2)
                {
                    System.out.print( i);
                }else {
                    System.out.print(", " + i);
                }

            }

        }



    }
}
