// Question 3: Password Checker
// (Asked in Accenture OnCampus 10 Aug 2022, Slot 3)

// You are given a function.
// int CheckPassword(char str[], int n);
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
// str is a valid password if it satisfies the below conditions.

// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number
// Assumption:
// Input string will not be empty.

// Example:

// Input 1:
// aA1_67
// Input 2:
// a987 abC012

// Output 1:
// 1
// Output 2:
// 0

import java.util.Scanner;

public class ValidPassword {

    public static int checkPassword(String s, int n) {
        int cap = 0;
        int num = 0;
        if (n < 4) {
            return 0;
        } else if (s.charAt(0) >= 0 && s.charAt(0) <= 9)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' || ch == '/') {
                return 0;
            }
            if (ch >= 'A' && ch <= 'Z') {
                cap++;
            }
            if (ch >= 0 && ch <= 9) {
                num++;
            }

        }
        if (num > 0 && cap > 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
        int n = str.length();
        System.out.println(checkPassword(str, n));
    }
}
