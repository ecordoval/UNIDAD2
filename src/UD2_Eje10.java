import java.util.Scanner;
import java.lang.Math;

public class UD2_Eje10 {
    public static void main (String [] args) {

        double ramdom =Math.random();

        char letra = (char) ((ramdom * (90-65))+ 65);

        if (letra =='A' || letra =='E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("la letra generada "+letra + " es una VOCAL");

        }

        else {
            System.out.println("la letra generada "+letra + " es una CONSONANTE");

        }
    }



}
