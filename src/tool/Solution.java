package tool;

import java.io.IOException;
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
    }
}
