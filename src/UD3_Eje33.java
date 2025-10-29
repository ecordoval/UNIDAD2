import java.util.Scanner;

public class UD3_Eje33 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número :");
        int cociente = sc.nextInt();
        int primo = 2;
        while (cociente != 1)
        {
            if(cociente%primo ==0){
                System.out.println(cociente+"|"+primo);
                cociente = cociente/primo;

                if(cociente == 1) {
                    System.out.println("1");
                }
            }
            else
            {
                primo++;
            }


        }

    }
}
