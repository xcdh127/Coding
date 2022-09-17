package Testhuazi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        //偏移字符串
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lines.add(sc.nextLine());
        }
        String[] line3 = sc.nextLine().split(" ");
        int row = Integer.parseInt(line3[0]);
        int col = Integer.parseInt(line3[1]);
        int recur = Integer.parseInt(sc.nextLine());
        w1:
        for (int k = 0; k < recur; k++) {
            for (int i = 0; i < n; i++) {
                //拿到当前字符串
                String temp = lines.get(i);
                //开始遍历字符串
                w2:
                for (int j = 0; j < m; j++) {
                    //停止遍历字符串
                    if (temp.charAt(j) == '.') {
                        break w2;
                    }
                    //当前位置位于障碍或者是超出了矩形的位置，终止遍历字符串
                    else if (temp.charAt(j) == '#' || row < 0 || row >= n || col < 0 || col >= m) {
                        break w1;
                    } else if (temp.charAt(j) == '^') {
                        row--;
                    } else if (temp.charAt(j) == 'v') {
                        row++;
                    } else if (temp.charAt(j) == '<') {
                        col--;
                    } else if (temp.charAt(j) == '>') {
                        col++;
                    }
                }
            }
        }
        System.out.print(row + " " + col);
    }
}
