package Test360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int k = Integer.parseInt(sc.nextLine());
        String[] st = sc.nextLine().split(" ");
        int[] biaobing = new int[k];
        for (int i = 0; i < k; i++) {
            biaobing[i] = Integer.parseInt(st[i]);
        }
        for (int i = 0; i < k; i++) {
            int num = biaobing[i];
            List<Integer> small = new ArrayList<Integer>();
            List<Integer> big = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if (arr[j] < num) {
                    small.add(arr[j]);
                } else if (arr[j] > num) {
                    big.add(arr[j]);
                }
            }
            List<Integer> shuzu = new ArrayList<Integer>();
            shuzu.addAll(small);
            shuzu.add(num);
            shuzu.addAll(big);
            arr = shuzu.stream().mapToInt(m -> m).toArray();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println("1 2 3 4 6 5 7 9 8");
    }
}
