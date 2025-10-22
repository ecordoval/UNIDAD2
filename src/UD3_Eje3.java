import java.util.Scanner;

public class UD3_Eje3
{
    public  static  void main (String [] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        char letra = sc.nextChar();

        if(letra.isletter()){
            System.out.println("Es una letra");

        } else if (letra.isDigit()) {
            System.out.println("Es una cifra numérica");

        }
       else {
            System.out.println("Es otro caracter");

        }

    }
}
