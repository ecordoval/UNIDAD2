/*
Crea un programa que "dibuje" un triángulo decreciente, con la altura que
indique el usuario. Por ejemplo, si el usuario dice que desea 4 caracteres de
alto, el triángulo sería así:
        ****
        ***
        **
        *
*/

import java.util.Scanner;

public class UD3_Eje28 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura :");
        int altura = sc.nextInt();

        for (int i=altura ; i>0 ; i --)
        {

            System.out.println("*".repeat(i));

        }

    }
}
