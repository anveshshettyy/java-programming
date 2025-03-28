package Arrays;

import java.util.HashSet;

public class P35_FindFirstRepeatingElement {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4,  2, 3, 6 };

        HashSet<Integer> hs = new HashSet<>();

        int res = 0;
        for (int i : nums) {
            if (hs.contains(i)) {
                res = i;
                break;
            }
            hs.add(i);
        }

        System.out.println(res);
    }

}
