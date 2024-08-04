/**
 * MoveHyphen
 */
public class MoveHyphen {

    public static String moveToFirstHyphen(String s) {

        if (s.length() == 0) {
            return null;
        }

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                res = s.charAt(i) + res;
            } else {
                res = res + s.charAt(i);
            }
        }

        // StringBuilder hyphens = new StringBuilder();
        // StringBuilder alaphabet = new StringBuilder();

        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == '-') {
        // hyphens.append(s.charAt(i));
        // } else {
        // alaphabet.append(s.charAt(i));
        // }
        // }
        // return hyphens.append(alaphabet).toString();
        return res;
    }

    public static void main(String[] args) {
        String s = "Hello-world-Hii";
        System.out.println(moveToFirstHyphen(s));
    }
}