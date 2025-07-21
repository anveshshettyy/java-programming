package Array_List;

import java.util.*;

public class CustomSortOddEv {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 4);
        
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if((a % 2 == 0) && (b % 2 != 0)) return -1;
                else if((a % 2 != 0) && (b % 2 == 0)) return 1;
                else return a - b;
            }
        });

        System.out.println(numbers);

    }
}
