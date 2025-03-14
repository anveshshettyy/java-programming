// package Methods;

// import java.util.Scanner;

// public class Exericse9 {
//     static int res(int x, int y) {
//         int temp1 = x,temp2 = y, count1 = 0, count2 = 0,  num = 1;
//         while(temp1 > 0) {
//             temp1 = temp1 / 10;
//             count1++;
//         }

//         int half = count1 / 2;
//         while(temp2 > 0) {
//             temp2 = temp2 / 10;
//             count2++;
//         }

//         for(int i=0; i<half; i++) {
//             num = num * 10;
//             y = y * 10;
//         }

//         int front = x / num;
//         front = front * num;

//         int back = x - front;

//         for(int i=0; i<count2; i++) {
//             front = front * 10;
//         }
//         return front + y + back;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = 123456;
//         int y = 777;
//         System.out.println(res(x,y)); // 127745
//     }
// }

package Methods;

public class Exercise9 {

    static int res(int a, int b) {
        int temp1 = a, temp2 = b, count1 = 0, count2 = 0, first = 0 ,last = 0;
        int num = 1;
        while(temp1 > 0) {
            count1++;
            temp1 /= 10;
        }

        for(int i=0; i<count1/2; i++) {
            num *= 10;
            b *= 10;
        }

        first = a / num;
        last = a % num;
        
        while(temp2 > 0) {
            count2++;
            temp2 /= 10;
        }

        num = 1;
        for(int i=0; i < ((count1 / 2) + count2); i++) num *= 10;
        first *= num;
        return (first + b + last);

    }
    public static void main(String[] args) {
        int a = 123456;
        int b = 7777;
        System.out.println(res(a,b));
    }
}
