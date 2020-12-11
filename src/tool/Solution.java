package tool;

import java.util.*;


class Solution {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - i - 1];
            A[A.length - i - 1] = temp;
        }
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j + 1 < A.length; j++) {
                if (A[i] < A[j] + A[j + 1]) {
                    return A[i] + A[j] + A[j + 1];
                }
            }
        }
        return 0;
    }

    public static void main(String... args) {
        Solution s0 = new Solution();
//        System.out.println(Arrays.toString(new int[]{}));
//        s0.removeElement(null, 1);
//        double key = s0.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.2}, 0, 2);
//        System.out.println(key);
//        Map<Integer, Integer> a = new HashMap<>();
//        Character a0;
    }
}
