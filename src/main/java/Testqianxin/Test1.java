package Testqianxin;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(",");
        String[] line2 = sc.nextLine().split(",");
        int n = line1.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(line1[i]);
            arr2[i] = Integer.parseInt(line2[i]);
        }
        if (n == 2) {
            System.out.println(Math.min(arr1[0] + arr2[1], arr1[1] + arr2[0]));
        }
        if (n == 3) {
            int num1 = arr1[0] + arr1[1] + arr2[2];
            int num2 = arr1[0] + arr1[2] + arr2[1];
            int num3 = arr1[1] + arr1[2] + arr2[0];
            int num4 = arr1[2] + arr2[0] + arr2[1];
            int num5 = arr1[1] + arr2[0] + arr2[2];
            int num6 = arr1[0] + arr2[1] + arr2[2];
            List<Integer> res = new ArrayList<>();
            res.add(num1);
            res.add(num2);
            res.add(num3);
            res.add(num4);
            res.add(num5);
            res.add(num6);
            Collections.sort(res);
            System.out.println(res.get(0));
            return;
        }
        int minArr2 = Integer.MAX_VALUE;
        int minArr1 = Integer.MAX_VALUE;
        int indexMin2 = 0;
        int indexMin1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr2[i] < minArr2) {
                minArr2 = arr2[i];
                indexMin2 = i;
            }
            //数组1中最小位置
            if (arr1[i] < minArr1) {
                minArr1 = arr1[i];
                indexMin1 = i;
            }

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == indexMin2) {
                continue;
            }
            sum += arr1[i];
        }
        sum *= 0.6;
        sum = (int) Math.ceil(sum);
        int sum1 = sum + arr2[indexMin2];
        int minValue = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == indexMin1) {
                continue;
            }
            if (arr2[i] < minValue) {
                minValue = arr2[i];
            }
            ans += arr2[i];
        }
        ans -= minValue;
        int sum2 = ans + arr1[indexMin1];
        System.out.println(Math.max(sum1, sum2));
    }
}
