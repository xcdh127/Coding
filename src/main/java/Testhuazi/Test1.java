package Testhuazi;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = sc.nextLine();
        }

        String[] A = new String[n];
        String[] B = new String[n];
        for (int i = 0; i < n; i++) {
            String temp = lines[i];
            String[] strs = temp.split(">");
            A[i] = strs[0];
            B[i] = strs[1];
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(A[i]);
            list.add(B[i]);
        }

        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();
        for (String s : list) {
            map.putIfAbsent(s, new ArrayList<>());
            inDegree.put(s, 0);
        }
        for (int i = 0; i < n; i++) {
            map.get(A[i]).add(B[i]);
            inDegree.put(B[i], inDegree.getOrDefault(B[i], 0) + 1);
        }
        Queue<String> queue = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                queue.offer(entry.getKey());
            }
        }
        List<String> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            String temp = queue.poll();
            order.add(temp);
            for (String next : map.get(temp)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.offer(next);
                }
            }
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() > 0) {
                res.add(entry.getKey());
            }
        }
        if (res.size() == 0) {
            System.out.println("NA");
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size() - 1) {
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i) + " ");
            }
        }
    }
}
