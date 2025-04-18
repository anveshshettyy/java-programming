package Trees;

import java.util.ArrayList;

public class HeapUp {
    static ArrayList <Integer> list = new ArrayList<>();
    static void heapUp(int data) {
        list.add(data);
        int i = list.size()-1;
        int root = ((i-1)/2);
        while(i!=0) {
            if(list.get(root) > list.get(i)) {
                int temp = list.get(i);
                list.set(i, list.get(root));
                list.set(root, temp);

                i = root;
                root = (i-1)/2;
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {12, 11,  10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i=0; i<nums.length; i++) {
            heapUp(nums[i]);
        }
        System.out.println(list);
    }
}
