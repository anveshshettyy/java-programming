package Arrays;

public class P10_ModIndex {
    static int Mod(int n, int len) {
        return n%len;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 6, 2, 9, 7, 4};

        for(int i=0; i<n; i++) {
            int mod = Mod(arr[i], n);
            arr[i] = mod;
            System.out.print(arr[i]+"  ");
        }
    }
}
