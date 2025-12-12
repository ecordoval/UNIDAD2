public class UD5_Eje8 {

    public static void main (String [] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] suma = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (20) + -10);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * (20) + -10);
        }
        System.out.print("Array 1: ");
        for (int a : array1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int a : array2) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < suma.length; i++) {
            suma[i] = array1[i] + array2[i];
        }
        System.out.println();
        System.out.print("Suma: ");
        for (int a : suma) {
            System.out.print(a + " ");
        }

    }
}
