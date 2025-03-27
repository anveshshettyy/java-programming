package Arrays;

public class P19_MergeTwoArrays {
    static void MergeTwoArrays(int arr1[], int arr2[]) {
        int len1 = arr1.length, len2 = arr2.length;
        int len3 = len1 + len2;

        int res[] = new int[len3];

        int j = 0;
        for(int i=0; i<len1; i++){
            res[j++] = arr1[i];
        }

        for(int i=0; i<len2; i++) {
            res[j++] = arr2[i];
        }

        for(int i=0; i<len3; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};

        MergeTwoArrays(arr1, arr2);
    }
}
