package Array_List;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);


        // for(int i=0; i<len; i++) {
        //     nums.set(i,len-i);
        // }
        // System.out.print(nums+" ");

        // nums.remove(2);

        nums.add(7,10);

        for (int i = 0; i < nums.size(); ++i){
            System.out.println(nums.get(i)); // 1 2 3 4
        }
    }
}
