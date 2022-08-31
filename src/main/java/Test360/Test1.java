package Test360;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        int q = Integer.parseInt(s[2]);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int pingshi = 100;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int qimo = arr[i];
            if (i == n - 1) {

                int zongfen = (p * pingshi + q * qimo) / 100;
                if (zongfen < 60) {
                    break;
                } else if (zongfen >= 60) {
                    count++;
                }
            } else if (i < n - 1 && arr[i] == arr[i + 1]) {
                count++;
            } else {
                pingshi--;
                int zongfen = (p * pingshi + q * qimo) / 100;
                if (zongfen < 60) {
                    break;
                } else if (zongfen >= 60) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
