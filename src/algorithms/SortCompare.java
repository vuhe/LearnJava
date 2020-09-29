package algorithms;

import algorithms.sort.*;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(SortFunction alg, Double[] a){
        Stopwatch timer = new Stopwatch();
        SortUnit.sortOf(a, alg);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(SortFunction alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
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
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Insertion, t1);

        double t2 = timeRandomInput(SortFunction.Selection, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Selection, t2);

        double t3 = timeRandomInput(SortFunction.Shell, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Shell, t3);

        double t4 = timeRandomInput(SortFunction.Merge, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Merge, t4);

        double t5 = timeRandomInput(SortFunction.MergeBU, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.MergeBU, t5);

        double t6 = timeRandomInput(SortFunction.Quick, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Quick, t6);

        double t7 = timeRandomInput(SortFunction.Quick3way, N, T);
        StdOut.printf("    %s use %.2f seconds\n", SortFunction.Quick3way, t7);
    }
}
