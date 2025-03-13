package Exercise2;

public class Merge {
    public static void main(String args[]) {
        int m = 1234;
        int n = 77;
        int temp = n;

        while( n > 0 ) {
            m = m * 10;
            n = n / 10;
        }

        m = m + temp;

        System.out.println(m);

    }
}
