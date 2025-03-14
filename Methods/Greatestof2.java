package Methods;

class Test {
    public int max(int a, int b){
        return (a>b) ? a : b;
    }
}

public class Greatestof2 {
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        Test obj = new Test();
        c = obj.max(a, b);
        System.out.println(c);
    }
    
}
