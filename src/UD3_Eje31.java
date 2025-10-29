
import java.lang.Math;

public class UD3_Eje31 {

    public static void main(String[] args) {
        int maximo = 0;
        int minimo = 100;

        for(int i= 0 ; i< 10; i++)
        {
            double ramdom = Math.random();
            int numeroAleatorio = (int) ((ramdom * 99)+1);

            if(maximo < numeroAleatorio)
            {
                maximo = numeroAleatorio;
            }
            if (minimo > numeroAleatorio)
            {
                minimo  = numeroAleatorio;
            }

            System.out.println(numeroAleatorio);
        }
        System.out.println("El número máximo es:"+maximo);
        System.out.println("El número mínimo es:"+minimo);

    }

}
