package PatterCreation;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char c = sc.next().toUpperCase().charAt(0);

        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                switch (c) {
                    case '0':
                        System.out.print((i == 0 || j == 0 || j == n - 1 || i == n - 1) ? "* " : "  ");
                        break;

                    case '1':
                        System.out.print((j == n / 2) ? "* " : "  ");
                        break;

                    case '2':
                        System.out.print((i == 0 || ((j == n - 1) && (i < n / 2)) || i == n / 2
                                || ((j == 0) && (i > n / 2)) || i == n - 1) ? "* " : "  ");
                        break;

                    case '3':
                        System.out.print((i == 0 || i == n - 1 || i == n / 2 || j == n - 1) ? "* " : "  ");
                        break;

                    case '4':
                        System.out.print((((j == 0) && (i < n / 2)) || j == n - 1 || i == n / 2) ? "* " : "  ");
                        break;

                    case '5':
                        System.out.print((((j == 0) && (i < n / 2)) || ((j == n - 1) && (i > n / 2)) || i == n / 2
                                || i == 0 || i == n - 1) ? "* " : "  ");
                        break;

                    case '6':
                        System.out.print(
                                (((j == 0)) || ((j == n - 1) && (i > n / 2)) || i == n / 2 || i == 0 || i == n - 1)
                                        ? "* "
                                        : "  ");
                        break;

                    case '7':
                        System.out.print((i == 0 || j == n - 1) ? "* " : "  ");
                        break;

                    case '8':
                        System.out.print((i == 0 || j == n - 1 || j == 0 || i == n / 2 || i == n - 1) ? "* " : "  ");
                        break;

                    case '9':
                        System.out.print(
                                (i == 0 || j == n - 1 || ((j == 0) && (i <= n / 2)) || i == n / 2 || i == n - 1) ? "* "
                                        : "  ");
                        break;

                    case 'A':
                        System.out.print((((j==0)&&(i>n/2)) || ((j==n-1)&&(i>n/2) || i+j== n/2 || i-j== -n/2 || i==n/2)  ) ? "* " : "  ");
                        break;

                    case 'B':
                        System.out.print((i==0 || ((i==n-1)&&(j<n*3/4 -1)) || j==0 || ((i+j==n-1)&&(i<n/2)) || i+j==3*n/2 || i==n/2) ? "* " : "  ");
                        break;

                    case 'C':
                        System.out.print((i == 0 || i == n - 1 || j == 0) ? "* " : "  ");
                        break;

                    case 'D':
                        System.out.print((((i == 0) && (j < n / 2)) || ((i == n - 1) && (j < n / 2)) || j == 0
                                || i - j == -n / 2 ||
                                i + j == 3 * n / 2 || ((i == n / 2) && (j == n - 1))) ? "* " : "  ");
                        break;

                    case 'E':
                        System.out.print((i == 0 || i == n - 1 || i == n / 2 || j == 0) ? "* " : "  ");
                        break;

                    case 'F':
                        System.out.print((i == 0 || i == n / 2 || j == 0) ? "* " : "  ");
                        break;

                    case 'G':
                        System.out.print(
                                (i == 0 || j == 0 || ((i == n - 1) && (j < n / 2)) || ((j == n / 2) && (i > n / 2)) ||
                                        ((i == n / 2) && (j >= n / 2)) || ((j == n - 1) && (i > n / 2))) ? "* " : "  ");
                        break;

                    case 'H':
                        System.out.print(
                                (j == 0 || j == n - 1 || i == n / 2) ? "* " : "  ");
                        break;

                    case 'I':
                        System.out.print((i == 0 || i == n - 1 || j == n / 2) ? "* " : "  ");
                        break;

                    case 'J':
                        System.out.print((i == 0 || ((i == n - 1) && (j < n / 2)) || j == n / 2
                                || ((j == 0) && (i >= n * 3 / 4))) ? "* " : "  ");
                        break;

                    case 'K':
                        System.out.print(
                                (j == 0 || i + j == n / 2 || i - j == n / 2)
                                        ? "* "
                                        : "  ");
                        break;

                    case 'L':
                        System.out.print((j == 0 || i == n - 1) ? "* " : "  ");
                        break;

                    case 'M':
                        System.out.print((((i - j == 0) && (j < n / 2)) || j == 0 || j == n - 1
                                || ((i + j == n - 1) && (i < n / 2)) || (i==n/2 && j==n/2)) ? "* " : "  ");
                        break;

                    case 'N':
                        System.out.print(
                                (j == 0 || i - j == 0 || j == n - 1) ? "* "
                                        : "  ");
                        break;

                    case 'O':
                        System.out.print((i == 0 || j == 0 || j == n - 1 || i == n - 1) ? "* " : "  ");
                        break;

                    case 'P':
                        System.out
                                .print((i == 0 || j == 0 || ((j == n - 1) && (i < n / 2)) || i == n / 2) ? "* " : "  ");
                        break;

                    case 'Q':
                        System.out.print((i == 0 || ((j == 0) && (i < 3 * n / 4)) || ((j == n - 1) && (i < 3 * n / 4))
                                || i == n * 3 / 4 ||
                                ((i - j == 0) && (j >= n / 2))) ? "* " : "  ");
                        break;

                    case 'R':
                        System.out.print(
                                (i == 0 || j == 0 || ((j == n - 1) && (i < n / 2)) || i == n / 2
                                        || ((i - j == 0) && (i > n / 2)))
                                                ? "* "
                                                : "  ");
                        break;

                    case 'S':
                        System.out.print((i == 0 || i == n - 1 || i == n / 2 || ((j == 0) && (i < n / 2))
                                || ((j == n - 1) && (i > n / 2))) ? "* " : "  ");
                        break;

                    case 'T':
                        System.out.print((i == 0 || j == n / 2) ? "* " : "  ");
                        break;

                    case 'U':
                        System.out.print(
                                (i == n - 1 || j == 0 || j == n - 1) ? "* "
                                        : "  ");
                        break;

                    case 'V':
                        System.out.print((((j == 0) && (i < n / 2)) || ((j == n - 1) && (i < n / 2)) || i - j == n / 2
                                || i + j == 3 * n / 2) ? "* " : "  ");
                        break;

                    case 'W':
                        System.out.print((j == 0 || j == n - 1 || ((i + j == n - 1) && (i > n / 2))
                                || ((i - j == 0) && (i >= n / 2))) ? "* " : "  ");
                        break;

                    case 'X':
                        System.out.print(((i - j == 0) || (i + j == n - 1)) ? "* " : "  ");
                        break;

                    case 'Y':
                        System.out.print(
                                ((i - j == 0) && (j < n / 2) || (i + j == n - 1)) ? "* "
                                        : "  ");
                        break;

                    case 'Z':
                        System.out.print((i == 0 || i - j == 0 || i == n - 1) ? "* " : "  ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
