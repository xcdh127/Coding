package Testfenghuotongxin;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int sum = a + b;
        int zuidazhi = Integer.MIN_VALUE;
        int zuixiaozhi = Integer.MAX_VALUE;
        for (int i = 0; i < sum; i++) {
            int a_ = a - i;
            int b_ = b + i;
            int value = a_ / c + b_ / c;
            int result = Math.abs(a_ - a) + Math.abs(b_ - b);
            if (value > zuidazhi) {
                zuixiaozhi = result;
                zuidazhi = value;
            } else if (value == zuidazhi) {
                if (zuixiaozhi > result) {
                    zuixiaozhi = result;
                }
            }
        }
        for (int i = 0; i < sum; i++) {
            int a_ = a + i;
            int b_ = b - i;
            int value = a_ / c + b_ / c;
            int result = Math.abs(a_ - a) + Math.abs(b_ - b);
            if (value > zuidazhi) {
                zuixiaozhi = result;
                zuidazhi = value;
            } else if (value == zuidazhi) {
                if (zuixiaozhi > result) {
                    zuixiaozhi = result;
                }
            }
        }
        System.out.println(zuixiaozhi);
    }
}
