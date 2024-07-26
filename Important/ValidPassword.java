
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
