import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testerweishuzu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        while (true) {
            String nextLine = sc.nextLine();
            if (nextLine.equals("")) {
                break;
            }
            list.add(nextLine.split(" "));
        }
        String[][] ints = list.toArray(new String[list.size()][list.get(0).length]);
        int[][] arr = new int[list.size()][list.get(0).length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                arr[i][j] = Integer.parseInt(ints[i][j]);
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
