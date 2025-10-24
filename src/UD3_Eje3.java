import java.util.Scanner;

public class UD3_Eje3
{
    public  static  void main (String [] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra:");
        char letra = sc.next().charAt(0);

        if(Character.isLetter(letra)){
            System.out.println("Es una letra");

        } else if (Character.isDigit(letra)) {
            System.out.println("Es una cifra numérica");

        }
       else {
            System.out.println("Es otro caracter");

        }

    }
}
