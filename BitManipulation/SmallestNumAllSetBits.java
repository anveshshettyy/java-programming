package BitManipulation;

public class SmallestNumAllSetBits {
    public static void main(String[] args) {
        int n = 10;
        int temp1 = n, count = 0, temp2 = 0;
        while(temp1 > 0) {
            count++;
            temp1 = temp1 >> 1;
        }
        temp2 = 1<<count;

        System.out.println(temp2-1);
    }
}
