// Esta línea hace que la biblioteca esté disponible.
import java.util.Scanner ;

// Un programa que lee un entero y lo muestra por consola.
public  class Sumar {
    public  static  void main (String [ ] args)  {
        // inicializa la biblioteca.
        Scanner sc = new Scanner(System.in);
        // Se pone un mensaje de bienvenida.
        System.out.println("Vamos a sumar dos números enteros");
        // Se lee un valor entero por teclado.
        // Se espera que se pulse la tecla de retorno.
        System.out.print ("Escribe un número y pulsa la tecla de retorno:");
        int i = sc.nextInt();
        sc.nextLine();
        // Se vuelve a hacer ...
        System.out.print("Ingresa otro número:");
        int j = sc.nextInt() ;
        sc.nextLine() ;
        // Hacemos la operación.
        int resultado = i + j;
        // Imprime el resultado por consola!
        // Se usa el operador suma entre una cadena de texto y un entero
        System.out.println("La suma de los dos valores es :" + resultado +  ".");

        System.out.print ("Ingrese 2 nùmeros:");
        int k = sc.nextInt();
        sc.nextLine();
        int l = sc.nextInt() ;
        // Hacemos la operación.
        int resultado2 = k + l;
        System.out.println("La suma de los dos valores es :" + resultado2 +  ".");

    }
}
