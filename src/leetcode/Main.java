package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author zhuhe
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            nums[i] = new int[m];
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
            Arrays.sort(nums[i]);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int p = in.nextInt();
            int[] arr = new int[p];
            int[] curr = new int[p];
            for (int j = 0; j < p; j++) {
                arr[j] = in.nextInt() - 1;
            }
            int m = in.nextInt();
            int a = 0;
            for (int j = 0; j < m; j++) {
                int ans = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < p; k++) {
                    if (nums[arr[k]][curr[k]] < min) {
                        min = nums[arr[k]][curr[k]];
                        ans = k;
                    }
                }
                curr[ans]++;
                a = Math.min(a, min);
            }
            System.out.println(a);
        }
    }
}

