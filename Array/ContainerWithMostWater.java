
public class ContainerWithMostWater {

    public static int maxwater(int a[]) {
        int maxarea = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int area = (j - i) * Math.min(a[i], a[j]);
                maxarea = Math.max(maxarea, area);
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int ans = maxwater(height);
        System.out.println(ans);

    }
}