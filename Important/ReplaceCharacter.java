public class ReplaceCharacter {

    public static String replace(String s, char ch1, char ch2) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ch1) {
                res = res + ch2;
            } else if (ch == ch2) {
                res = res + ch1;
            } else {
                res = res + s.charAt(i);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        String s = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println(replace(s, ch1, ch2));
    }
}
