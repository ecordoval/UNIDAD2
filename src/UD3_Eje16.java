import java.util.Scanner;

/*
Conversor pesetas – euros. Modifica el programa de manera que el programa
pida una cantidad para convertir a euros, muestre el resultado y vuelva a
pedir una cantidad para volver a hacerla conversión. Si se introduce un cero el
programa debe parar. El programa debe devolver la cantidad en euros si es
positivo, el mensaje de advertencia si es negativo y volver a pedir introducir la
información tras la operación. Cuando se introduce un cero la ejecución del
programa debe finalizar.
*
* */
public class UD3_Eje16 {

    public  static  void main (String [ ] args)  {
        double pesetas;

        Scanner sc = new Scanner(System.in);

        do {

                System.out.print("Ingrese el monto en pesetas: ");
                pesetas = sc.nextDouble();
                sc.nextLine();

                if (pesetas < 0){
                    System.out.println("El valor introducido es negativo.");
                }
                else if (pesetas !=0){
                    System.out.printf("El monto en Euros es %.3f \n", pesetas / 166.386);


                }
        }
        while (pesetas !=0);

        sc.close();



    }
}
