import java.util.Scanner;


public class UD3_Eje15 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero= sc.nextInt();
        sc.nextLine();
        int factorial =1;
        for(int i = numero ; i >= 1; i--)
        {
            factorial = factorial * i;
            System.out.print(i+" X ");

        }
        System.out.print("\n");
        System.out.println("El factorial es:"+ factorial);

        sc.close();
    }
}

//!5 = 5 x 4 x 3 x 2 x 1