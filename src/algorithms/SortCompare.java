package algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortCompare {
    private static final long seed = System.currentTimeMillis();
    private static final Random random = new Random(seed);

    public static double time(SortFunction alg, Double[] a) {
        long start = System.currentTimeMillis();
        SortUnit.sortOf(a, alg);
        long end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }

    public static double timeRandomInput(SortFunction alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = random.nextDouble();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String... args) {
        int N = 10000;
        int T = 100;
        System.out.printf("For %d random Doubles\n", N);

        double t1 = timeRandomInput(SortFunction.Insertion, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Insertion, t1);

        double t2 = timeRandomInput(SortFunction.Selection, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Selection, t2);

        double t3 = timeRandomInput(SortFunction.Shell, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Shell, t3);

        double t4 = timeRandomInput(SortFunction.Merge, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Merge, t4);

        double t5 = timeRandomInput(SortFunction.MergeBU, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.MergeBU, t5);

        double t6 = timeRandomInput(SortFunction.Quick, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Quick, t6);

        double t7 = timeRandomInput(SortFunction.Quick3way, N, T);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Quick3way, t7);
    }
}
