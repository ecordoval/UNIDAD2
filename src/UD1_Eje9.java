public class UD1_Eje9 {
    public static void main(String[] args) {
        int num = 5;
        num += num - 1 * 4 + 1;
        // num= num+num-1*4+1; // 5+5-(1*4)-1 =5

        System.out.println(num);
        num = 4;

        //num %= 7 * num % 3 * 7 - 1;
        num %= 7 * 4 % 3 * 7 - 1;
        //num = num%7*num%3*7-1;// 4%7 * 4%3 * 7-1 =3*4%3*7-1=12%3*7-1=-1

        System.out.println(num);
    }
}
