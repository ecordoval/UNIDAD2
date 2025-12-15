import java.util.ArrayList;
import java.util.stream.Collectors;

public class UD5_Eje10 {
    public static void main (String [] args) {
        int[] array1 = new int[10];
        ArrayList<Integer> repetidos = new ArrayList<>();
        ArrayList<Integer> sinduplicados;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (20) + -10);
        }


        for (int a : array1) {
            System.out.print(a + " ");
        }

        int j=0;

        System.out.println();



        for (int i = 0; i < array1.length; i++)
        {
            if ( !buscarArreglo(array1, array1[i]))
            {
                repetidos.add(array1[i]);

            }

        }

        sinduplicados= (ArrayList<Integer>) repetidos.stream().distinct().collect(Collectors.toList());
        System.out.println("No Repetidos:");
        for (int a : sinduplicados) {
            System.out.print(a + " ");
        }

    }

    public static boolean buscarArreglo (int [] array, int numero)
    {

        int count=0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == numero)
            {
                count++;

            }
            if (count > 1 )
                return true;


        }
        return false;

    }

}
