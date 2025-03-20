package NumberLogic;

public class P147_BooleanArrayPuzzle {
    public static void main(String[] args) {
        int[] a = {1,0};

        a[a[1]] = a[1-a[1]];

        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
