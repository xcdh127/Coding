package Testbaidu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int n = line.length();
        int count = 0;
        for (int i = 0; i + 5 < n; i++) {
            String sub = line.substring(i, i + 5);
            if (isDiff(sub) && !set.contains(sub.charAt(0)) && !set.contains(sub.charAt(3))
                    && set.contains(sub.charAt(1)) && set.contains(sub.charAt(2))
                    && set.contains(sub.charAt(4))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isDiff(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int num : arr) {
            if (num > 1) {
                return false;
            }
        }
        return true;
    }
}
