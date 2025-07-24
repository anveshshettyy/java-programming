package Heaps.minHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class JoinRope {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        int nums[] = {2, 3, 6, 5, 1, 8};
        for(int i: nums) {
            minHeap.add(i);
        }

        int res = 0;
        // while(minHeap.size() > 1) {
        //     int f = minHeap.poll();
        //     int s = minHeap.poll();
        //     res += (f+s);
        //     minHeap.add(f+s);
        // }
        
        while(minHeap.size() > 1) {
            int f = minHeap.poll();
            int s = minHeap.poll();
            res += (f+s);
            minHeap.add(f+s);
        }
        System.out.println(res);
    }
}
