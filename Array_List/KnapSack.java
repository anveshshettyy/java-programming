package Array_List;

import java.util.*;

public class KnapSack {
    public static void main(String[] args) {
        int values[] = {100, 60, 100, 200};
        int weights[] = {20, 10, 50, 50};

        int C = 90;

        int n = values.length;
        int arr[] = new int[n];
        Integer indices[] = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = values[i] / weights[i];
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(arr[b], arr[a]));

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int idx = indices[i];
            if(C >= weights[idx]) {
                C = C - weights[idx];
                sum += values[idx];
            } else {
                int val = arr[idx] * C;
                sum += val;
                C = C - arr[idx];
            }
        }

        System.out.println(sum);
    }
}
