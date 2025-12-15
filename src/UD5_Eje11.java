
public class UD5_Eje11{
    public static void main (String [] args) {
        int[] array1 = new int[10];
        int i=0;
        int numeroAleatorio;

    do{
        numeroAleatorio = (int) (Math.random() * (20) + -10);

        if ( buscarArreglo(array1, numeroAleatorio)) {
           continue;
        }
        else {
            array1[i]= numeroAleatorio;
            i++;
        }
    }
    while (i < array1.length);

    for (int a : array1)
        {
            System.out.print(a + " ");
        }

    }

    public static boolean buscarArreglo (int [] array, int numero)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == numero)
            {
                return true;
            }
        }
        return false;
    }

}
