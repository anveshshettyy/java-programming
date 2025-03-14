package Methods;

public class MethodsOverloading {

    public static int max(int a, int b) {
        return (a>b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return ( a > b && a > c) ? a : ((b > c) ? b : c);
    }
    
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
    }
}
