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
/*            if (line1.charAt(index) == '"') {
                StringBuilder temp = new StringBuilder();
                temp.append(line1.charAt(index));
                index++;
                while (index < line1.length() && line1.charAt(index) != '"') {
                    sb.append(line1.charAt(index));
                    index++;
                }
                sb.append(line1.charAt(index));
                index++;
                list.add(sb.toString());
            } else {
                sb.append(line1.charAt(index));
                index++;
            }*/
            if (str1[index].equals("\"")) {
                sb.append(str1[index] + " ");
                index++;
                while (index < str1.length && !str1[index].equals("\"")) {
                    if (index + 1 < str1.length && !str1[index + 1].equals(" ")) {
                        sb.append(str1[index] + " ");
                        index++;
                    } else {
                        sb.append(str1[index]);
                        index++;
                    }
                }
                sb.append(str1[index] + " ");
                index++;
            } else if (map.containsKey(str1[index].toLowerCase())) {
                if (index + 1 < str1.length && !str1[index + 1].equals(" ")){
                    sb.append(map.get(str1[index].toLowerCase()) + " ");
                    index++;
                }
                else {
                    sb.append(map.get(str1[index].toLowerCase()));
                    index++;
                }
            } else if (str1[index].equals(" ")) {
                sb.append(str1[index]);
                index++;
            } else {
                if (index + 1 < str1.length && !str1[index + 1].equals(" ")){
                    sb.append(str1[index] + " ");
                    index++;
                }
                else {
                    sb.append(str1[index]);
                    index++;
                }
            }
        }
        if (sb.charAt(sb.length()-1)==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }
}
//An    5 6 " the first paragraph " of your paper. " trt rer "

//An 5 6 " the first paragraph " of your paper.