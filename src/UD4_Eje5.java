import java.util.Scanner;

public class UD4_Eje5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 1 caracter :");
        String cadena =sc.nextLine();
        while(cadena.length()!=1)
        {

            System.out.print("Ingrese 1 caracter :");
            cadena =sc.nextLine();

        }

        char letra = cadena.charAt(0);

        System.out.print("Ingrese el ancho :");
        while  (!sc.hasNextInt())
        {
            sc.nextLine();
            System.out.print("Ingrese el ancho :");
        }
        int ancho = sc.nextInt();
        DibujarTriangulo(letra, ancho);


        sc.close();

    }

    static void DibujarTriangulo (char letra, int ancho)
    {
        int x = ancho;
        for (int i=0; i < x; i++)
        {
            for (int j=ancho; j > 0; j--)
            {
                System.out.print(letra);
            }
            ancho--;
            System.out.print("\n");
        }

    }
}
