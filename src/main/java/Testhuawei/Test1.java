package Testhuawei;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String[] str2 = line2.split(" ");
        for (int i = 0; i < str2.length; i++) {
            map.put(str2[i].toLowerCase(), i);
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        String[] str1 = line1.split(" ");
/*        for (String s : str1) {
            System.out.println(s);
        }*/
        while (index < str1.length) {
            StringBuilder temp = new StringBuilder(str1[index]);
            char ch = ' ';
            if (temp.length() > 0 && !Character.isLetter(temp.charAt(temp.length() - 1))) {
                ch = temp.charAt(temp.length() - 1);
                temp.deleteCharAt(temp.length() - 1);
            }
            if (str1[index].equals("\"")) {
                sb.append(str1[index] + " ");
                index++;
                while (index < str1.length && !str1[index].equals("\"")) {
                    sb.append(str1[index] + " ");
                    index++;
                }
                sb.append(str1[index] + " ");
                index++;
            } else if (map.containsKey(temp.toString().toLowerCase())) {
                sb.append(map.get(temp.toString().toLowerCase()) + "" + ch + " ");
                index++;
            } else if (str1[index].equals(" ")) {
                sb.append(str1[index]);
                index++;
            } else {
                sb.append(str1[index] + " ");
                index++;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
//An    5 6 " the first paragraph " of your paper. " trt rer "

//An 5 6 " the first paragraph " of your paper.