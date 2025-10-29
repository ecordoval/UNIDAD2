/*


Crea un programa que "dibuje" un rectángulo hueco, cuyo borde sea una fila
(o columna) de asteriscos y cuyo interior esté formado por espacios en
blanco, con el ancho y el alto que indique el usuario. Por ejemplo, si desea
anchura 4 y altura 3, el rectángulo sería así:

*/

import java.util.Scanner;

public class UD3_Eje29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la anchura :");
        int anchura = sc.nextInt(); //4
        System.out.print("Ingrese la altura :");
        int altura = sc.nextInt(); //3

        for (int i = 0; i<altura ; i ++)
        {
            for (int j = 0 ; j< anchura; j ++)
            {
                if(i==0 || i == altura-1)
                {
                    System.out.print("*");
                } else if (j==0 || j == anchura-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }


            }

            System.out.print("\n");


        }
    }
}
