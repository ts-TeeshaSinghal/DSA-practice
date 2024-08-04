public class NumberOfCarries {

    public static int countOfCarries(int n1, int n2) {

        int count = 0;
        int carry = 0;
        while (n1 != 0 && n2 != 0) {
            int n1rem = n1 % 10;
            int n2rem = n2 % 10;
            int sum = n1rem + n2rem + carry;
            if (sum > 9) {
                count++;
                sum = sum / 10;
                carry = sum;

            } else {
                carry = 0;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 451;
        int n2 = 49;
        System.out.println(countOfCarries(n1, n2));

    }
}
