package Methods;

public class Exercise10 {

    static int res(int a, int b) {
        int temp1 = a, temp2 = b, count1 = 0, count2 = 0, mid1, mid2,num1 = 1, num2 = 1;
        while(temp1 > 0) {
            temp1 /= 10;
            count1++;
        }
        while(temp2 > 0) {
            temp2 /= 10;
            count2++;
        }

        mid1 = count1 / 2;
        mid2 = count2 / 2;

        if( count2 % 2 == 0 ) for(int i=0; i<(mid1 + mid2); i++) num1 *= 10;
        else for(int i=0; i<(mid1 + mid2+1); i++) num1 *= 10;

        for(int i=0; i<(mid1 - mid2); i++) num2 *= 10;

        int first = a / num1;
        int last = a % num2;

        first *= num1;
        b *= num2;

        return (first + b +last);
        // return first;
    }
    public static void main(String[] args) {
        int a = 1234567;
        int b = 77;
        System.out.println(res(a,b));
    }
}
