package Testjingdong;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        //a个1，b个2
        if (a - b > 1) {
            System.out.println(-1);
        } else {

            while (a > 0 || b > 0) {
                if (a > 0) {
                    sb.append(1 + " ");
//                    System.out.print(1 + " ");
                    a--;
                }
                if (b > 0) {
                    sb.append(2 + " ");
//                    System.out.print(2 + " ");
                    b--;
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
