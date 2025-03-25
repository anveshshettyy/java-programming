package Arrays;

public class P13_ThirdMaxThirdMin {
    static void ThreeMax(int nums[], int n) {
        int fmax = nums[0], smax=0, tmax=0;
        for(int i=0; i<n; i++) {
            if(nums[i] > fmax) {
                int temp = fmax;
                fmax= nums[i];
                smax = temp;
            } 
            else if(smax <fmax && nums[i] > smax) {
                int temp = smax;
                smax = nums[i];
                tmax = temp;
            }
            else if(tmax < smax && tmax < nums[i]) {
                tmax = nums[i];
            }
        }
        System.out.println("3 Max numbers are: "+fmax+","+smax+","+tmax);
    }

    static void ThreeMin(int nums[], int n) {
        int fmin = 99, smin=999, tmin=99;
        for(int i=0; i<n; i++) {
            if(nums[i] < fmin) {
                int temp = fmin;
                fmin= nums[i];
                smin = temp;
            } 
            else if(smin >fmin && nums[i] < smin) {
                int temp = smin;
                smin = nums[i];
                tmin = temp;
            }
            else if(tmin > smin && tmin > nums[i]) {
                tmin = nums[i];
            }
        }
        System.out.println("3 Min numbers are: "+fmin+","+smin+","+tmin);
    }
    public static void main(String[] args) {
        int n = 6;
        int[] nums = {3, 6, 2, 9, 7, 4};

        ThreeMax(nums, n);
        ThreeMin(nums, n);
    }
}
