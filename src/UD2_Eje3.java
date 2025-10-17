import java.util.Scanner ;


public class UD2_Eje3 {

    public static void main (String [ ] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número ASCII (65-90) y (97-122): ");
        int ascii = sc.nextInt();
        char caracter = ((char) ascii);
        System.out.println("El caracter ASCII es: "+ caracter);

        if ( Character.toUpperCase(caracter) == 'A' || Character.toUpperCase(caracter) == 'E' || Character.toUpperCase(caracter) == 'I' || Character.toUpperCase(caracter) == 'O' || Character.toUpperCase(caracter) == 'U'  )
        {
            System.out.println("Es vocal");

        }
        else{

        System.out.println("No es vocal");
         }

    }
}
