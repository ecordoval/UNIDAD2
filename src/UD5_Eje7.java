public class UD5_Eje7 {
    public static void main (String [] args)
    {
        int [] array = new int [10];

        for (int i =0; i < array.length; i++)
        {
            array[i] =   (int) (Math.random() * (20)+-10);
        }

        for ( int a : array)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        for ( int a : array)
        {
           if ( a < 0)
            a= a *-1;

           System.out.print(a+" ");


        }



    }
}
