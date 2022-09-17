package Testdidi;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = line.length();
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(line.charAt(i))) {
                arr[i] = line.charAt(i) - '0';
            }
        }
        long num = 1;
        for (int i = 0; i < n - 1; i++) {
            num *= 10;
        }
        long nine = 9;
        for (int i = 0; i < n - 1; i++) {
            nine = nine * 10 + 9;
        }
        for (long i = num; i < nine; i++) {
            if (count(i) % 3 == 0 && isValid(String.valueOf(i)) && isRight(arr, String.valueOf(i))) {
                System.out.println(i);
                break;
            }
        }
    }

    public static int count(long num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static boolean isValid(String num) {
        int i = 0;
        int n = num.length();
        while (i < n - 1) {
            if (num.charAt(i) == num.charAt(i + 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isRight(int[] arr, String num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                if (arr[i] != num.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
