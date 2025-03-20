package Methods;

public class Bakery {
    static void Bakery() {
        System.out.println("This is from Bakery");
    }
    static void Chess() {
        Bakery();;
        System.out.println("This is from Chess");
    }

    public static void main(String[] args) {
        Chess();
    }
}
