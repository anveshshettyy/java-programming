package Methods;

public class Practice2 {
    static int  max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int inc1(int a) {
        return a++;
    }

    static int inc2(int a) {
        return a = a+1;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20;   
        // System.out.println(max(a,b));
        System.out.println(inc1(a));
        System.out.println(inc2(a));
    }
}
