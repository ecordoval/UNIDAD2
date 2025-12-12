public class UD5_Eje6 {

    public static void main (String [] args)
    {
        int [] array = new int [10];
        int count=0;

        for (int i =0; i < array.length; i++)
        {
            array[i] =   (int) (Math.random() * (20)+-10);
        }

        for ( int a : array)
        {
            if (a < 0) count++;

            System.out.print(a+" ");


        }
        System.out.println("\nExisten "+ count + " números negativos");




    }
}
