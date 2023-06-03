package sorting;

import java.util.*;

public class test {

    public static String solution(int n) {
        if (n <= 0 || n > 26) {
            // If n is less than or equal to 0 or greater than 26, return an empty string
            n = (n / 26 + 1) * 26;
        }

        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            // Calculate the index of the current letter based on n and i
            int index = (i * 26) / n;
            chars[i] = (char)('a' + index);
        }

        return new String(chars);
    }
    public static int solution(int[] V, int[] A, int[] B) {
        int n = V.length;
        int m = A.length;

        // Build adjacency list for the directed graph of project dependencies
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            adj[A[i]].add(B[i]);
        }

        // Topological sort of the graph to find projects that can be completed
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j : adj[i]) {
                inDegree[j]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            order.add(u);
            for (int v : adj[u]) {
                if (--inDegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        // Try all pairs of projects that can be completed and keep track of the highest value
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < order.size(); i++) {
            int u = order.get(i);
            if (inDegree[u] > 0) {
                continue; // u has uncompleted dependencies, can't start it yet
            }
            for (int j = i + 1; j < order.size(); j++) {
                int v = order.get(j);
                if (inDegree[v] > 0) {
                    continue; // v has uncompleted dependencies, can't start it yet
                }
                int value = V[u] + V[v];
                if (value > max) {
                    max = value;
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            // No valid pairs found, try to complete a single project with maximum value
            max = Arrays.stream(V).max().getAsInt();
        }
        return max;
    }





    public static void main(String[] args) {
//        String result1 = solution(3);
//        System.out.println(result1); // Output: "fig"
//
//        String result2 = solution(5);
//        System.out.println(result2); // Output: "mango"
//
//        String result3 = solution(15);
//        System.out.println(result3); // Output: "aabbccddeeffgghhiijjkkllmmnnoo"

      //  System.out.println(solution(3));
        int[] V = {-3, 5, 7, 2, 3};
        int[] A = {3, 1};
        int[] B = {2, 4};
        int result = test.solution(V, A, B);
        System.out.println(result); // Output: 9

    }
}


