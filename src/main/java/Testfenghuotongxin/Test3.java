package Testfenghuotongxin;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int[] my = new int[n];
        int[] your = new int[n];
        for (int i = 0; i < n; i++) {
            my[i] = Integer.parseInt(line1[i]);
        }
        for (int i = 0; i < n; i++) {
            your[i] = Integer.parseInt(line2[i]);
        }
        for (int lun = 0; lun < q; lun++) {
            int[] copyMy = Arrays.copyOf(my, n);
            int[] copyYour = Arrays.copyOf(your, n);
            String[] beilvStr = sc.nextLine().split(" ");
            int[] beilv = new int[2];
            beilv[0] = Integer.parseInt(beilvStr[0]);
            beilv[1] = Integer.parseInt(beilvStr[1]);
            for (int i = 0; i < n; i++) {
                copyMy[i] = beilv[0] * copyMy[i];
            }
            for (int i = 0; i < n; i++) {
                copyYour[i] = beilv[1] * copyYour[i];
            }
            Arrays.sort(copyMy);
            Arrays.sort(copyYour);
            int i = n - 1;
            int j = 0;
            int result = 0;
            while (i >= 0 && j < n) {
                if (copyMy[i] > copyYour[j]) {
                    result += copyMy[i] - copyYour[j];
                    i--;
                    j++;
                } else {
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
