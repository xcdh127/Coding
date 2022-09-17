import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }
        if (arr.length == 0) {
            System.out.println(0);
            return;
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }
        int[] dp = new int[2 * k];
        for (int i = 0; i < dp.length / 2; i++) {
            dp[i + 2] = -arr[0];
        }
        for (int i = 1; i <= arr.length; i++) {
            dp[0] = Math.max(dp[i], -arr[i - 1]);
            dp[1] = Math.max(dp[i], dp[0] + arr[i - 1]);
            for (int j = 2; j < dp.length; j += 2) {
                dp[j] = Math.max(dp[j], dp[j - 1] - arr[i - 1]);
                dp[j + 1] = Math.max(dp[j + 1], dp[j] + arr[i - 1]);
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
