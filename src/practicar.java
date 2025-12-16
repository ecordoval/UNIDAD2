import java.util.Arrays;

public class practicar {

    public static void main (String[]args)
    {

        int[] a = {1,2,3};
        int[] c = Arrays.copyOf(a, 5); //12389

        int[] b = {8,9,10};
        System.arraycopy(b, 0, c, 3, 2);

        int[] d = Arrays.copyOfRange(c, 1, 4);

        int[] e = {5,2,4,1};

        Arrays.sort(e);

        System.out.println("Busqueda: "+Arrays.binarySearch(e, 3));

        System.out.println("tamaño: "+a.length);

        for (int aa: a)
        {
            System.out.print(aa);

        }
        System.out.println("\n");
        for (int cc: c)
        {
            System.out.print(cc);

        }

        System.out.println("\n");
        for (int bb: b)
        {
            System.out.print(bb);

        }

        System.out.println("\n");
        for (int dd: d)
        {
            System.out.print(dd);

        }

        System.out.println("\n");
        for (int ee: e)
        {
            System.out.print(ee);

        }
    }

}
