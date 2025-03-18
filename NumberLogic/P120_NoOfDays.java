package NumberLogic;

import java.util.Scanner;

public class P120_NoOfDays {
    static int LeapYear(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 1 : 0;
    }

    static int checkDays(String month, int year) {
        if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November"))
            return 30;
        else if (month.equals("February")) {
            return (LeapYear(year) == 1) ? 29 : 28;
        } else
            return 31;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month: ");
        String month = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        int days = checkDays(month, year);
        System.out.println(days);
    }
}
