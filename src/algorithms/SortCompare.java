package algorithms;

import java.util.Random;

/**
 * @author zhuhe
 */
public class SortCompare {
    private static final long SEED = System.currentTimeMillis();
    private static final Random RANDOM = new Random(SEED);

    public static double time(SortFunction alg, Double[] a) {
        long start = System.currentTimeMillis();
        SortUnit.sortOf(a, alg);
        long end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }

    public static double timeRandomInput(SortFunction alg, int n, int t) {
        double total = 0.0;
        Double[] a = new Double[n];
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < n; i++) {
                a[i] = RANDOM.nextDouble();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String... args) {
        int n = 10000;
        int t = 100;
        System.out.printf("For %d random Doubles\n", n);

        double t1 = timeRandomInput(SortFunction.Insertion, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Insertion, t1);

        double t2 = timeRandomInput(SortFunction.Selection, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Selection, t2);

        double t3 = timeRandomInput(SortFunction.Shell, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Shell, t3);

        double t4 = timeRandomInput(SortFunction.Merge, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Merge, t4);

        double t5 = timeRandomInput(SortFunction.MergeBU, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.MergeBU, t5);

        double t6 = timeRandomInput(SortFunction.Quick, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Quick, t6);

        double t7 = timeRandomInput(SortFunction.Quick3way, n, t);
        System.out.printf("    %s use %.2f seconds\n", SortFunction.Quick3way, t7);
    }
}
