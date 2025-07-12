package Arrays;

public class UnqiueElement {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 3, 3, 5, 6, 6};

        int n = arr.length;
        int left = 0, right = n - 1, mid = 0;

        while( left < right ) {
            mid = ( right + left ) / 2;

            if(arr[mid] == arr[mid+1]) 
                mid = mid - 1;

            if((mid - left + 1) % 2 != 0) 
                right = mid;

            else 
                left = mid + 1;
            // int element = arr[mid];
            // if( element != arr[mid+1] && element != arr[mid-1] ) {
            //     System.out.println(element);
            //     break;
            // }

            // int rightlen = 0, leftlen = 0;

            
            // if(element == arr[mid-1]) {
            //     leftlen = mid - left;
            // } else {
            //     leftlen = mid - (left - 1);
            // }

            // if(element == arr[mid+1]){
            //     rightlen = right - mid;
            // } else {
            //     rightlen = right - ( mid + 1 );
            // }

            // if(rightlen % 2 != 0) {
            //     left = mid + 1;
            // }

            // if(leftlen % 2 != 0) {
            //     right = mid - 1;
            // }

            // System.out.println(leftlen+" "+rightlen);
        }

        System.out.println(arr[left]);
    }
}
