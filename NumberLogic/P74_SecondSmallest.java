package NumberLogic;

import java.util.Scanner;

public class P74_SecondSmallest {
    static int SecondSmallestDigit(int num) {
        int Small = 10, secondSmall = 10;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            if(rem < Small) {
                int temp = rem;
                secondSmall = Small;
                Small = temp;
            } 
            else if(rem < secondSmall && rem > Small) {
                secondSmall = rem;
            }
        }
    
        return secondSmall;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
    
        System.out.print("Second Smallest Digit is: ");
        System.out.println(SecondSmallestDigit(num));
    }
}
