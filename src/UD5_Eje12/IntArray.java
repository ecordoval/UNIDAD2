package UD5_Eje12;

public class IntArray {


    public static int[] createRandom(int length, int min, int bound)
    {
        int [] array = new int[length];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) ((Math.random() * (bound - min)) + min);
        }

        return array;

    }

    public static void showArray(int[] a)
    {
        for (int i : a)
        {
            System.out.print(i+" ");

        }
    }

    public static int find(int[] a, int search)
    {
        for (int i = 0; i < a.length; i++)
        {
           if (a[i] == search)
               return i;
        }
        return -1;

    }
    public static int find(int[] a, int search, int fromIndex)
    {
        for (int i = fromIndex; i < a.length; i++)
        {
            if (a[i] == search)
                return i;
        }
        return -1;

    }
    public static int getMin(int[] a)
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (min > a[i])
            {
                min = a[i];
            }
        }
        return min;

    }
    public static int getMax(int[] a)
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        return max;

    }
    public static double getAvg(int[] a)
    {
        double suma=0.0;
        for (int i = 0; i < a.length; i++)
        {
          suma += a[i];
        }
        return suma/a.length;

    }

    public static int suma(int[] a)
    {
        int suma=0;
        for (int i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        return suma;

    }

    public static double[] getStats(int[] a)
    {
        double [] status = new double[4];

        status[0] = IntArray.suma(a);
        status[1] = IntArray.getAvg(a);
        status[2] = IntArray.getMin(a);
        status[3] = IntArray.getMax(a);

        return  status;

    }


}
