package NumberLogic;

public class P80_LychrelNumber {
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
    static int isPalindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return (temp == rev) ? 1 : 0;
    }

    public static void main(String[] args) {
        int n = 196;
        
        int limit = 0;
        for(int i=0; i<limit; i++) {
            if(isPalindrome(i) == 1) {
                System.out.println("It is Not a Lychrel Number");
                break;
            } else {
                int sum = i + reverseNumber(i);
            }
        }

        
    }
}
 