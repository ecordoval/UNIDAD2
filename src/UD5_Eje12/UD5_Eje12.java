package UD5_Eje12;


public class UD5_Eje12 {
    public static void main (String [] args)
    {   int i=0;
        while(i<20) {
            int[] miarray = IntArray.createRandom(7, 10, 50);
            System.out.print("Aray: ");
            IntArray.showArray(miarray);
            System.out.println();
            //System.out.println(IntArray.find(miarray, 20));
            //System.out.println(IntArray.find(miarray, 20, 3));
            //System.out.println(IntArray.getMin(miarray));
            //System.out.println(IntArray.getMax(miarray));
            //System.out.println(IntArray.getAvg(miarray));
            System.out.print("Resumen: ");
            for (double a : IntArray.getStats(miarray))
            {
                System.out.printf("%.2f ",a);
            }
            System.out.println();
            i++;
        }


    }
}
