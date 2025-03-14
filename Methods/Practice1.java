package Methods;

public class Practice1 {
    static int  max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20;   
        System.out.println(max(a,b));
    }
}
