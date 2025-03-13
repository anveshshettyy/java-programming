package Exercise2;

public class Merge2 {
    public static void main(String args[]) {
        int m = 1234;
        int n = 77;
        int count = 0;
        int temp = n;

        while( n > 0 ) {
            count++;
            m = m / 10;
            n = n / 10;
        }

        for(int i=0; i<count; i++) {
            m = m * 10;
        }

        m = m + temp;

        System.out.println(m);

    }
}
