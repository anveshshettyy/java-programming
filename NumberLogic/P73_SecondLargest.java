package NumberLogic;

import java.util.Scanner;

public class P73_SecondLargest {
    static int SecondLargestDigit(int num) {
        int large = 0, secondLarge = 0;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            if(rem > large) {
                int temp = rem;
                secondLarge = large;
                large = temp;
            } 
            else if(rem > secondLarge && rem < large) {
                secondLarge = rem;
            }
        }
    
        return secondLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
    
        System.out.print("Second Largest Digit is: ");
        System.out.println(SecondLargestDigit(num));
    }
}