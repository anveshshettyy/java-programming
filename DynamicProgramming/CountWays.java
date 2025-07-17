package DynamicProgramming;

public class CountWays {
    public static int countWay(int n) {
        if(n==0) return 1;
        if(n<0) return 0;
        return countWay(n-1) + countWay(n-3) + countWay(n-5);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(countWay(n));
    }
}
