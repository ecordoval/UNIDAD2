import java.util.Scanner;

/*
* Codifica un programa que pida al usuario un número que represente
una cantidad expresada en pesetas. Si tenemos en cuenta que 1€ =
166.386ptas, muestra por pantalla la conversión a euros de la cantidad
introducida en pesetas.
*
* */
public class UD3_Eje1 {

    public  static  void main (String [ ] args)  {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto en pesetas: ");
        double pesetas = sc.nextDouble();

        if (pesetas == 0){
            System.out.println("El valor introducido debe ser mayor que cero.");
        }
        else  {
            System.out.printf("El monto en Euros es %.3f", pesetas / 166.386);

        }


        sc.close();



    }
}
