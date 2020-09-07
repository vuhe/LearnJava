package algorithms.sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(SortFunction alg, Double[] a){
        Stopwatch timer = new Stopwatch();
        switch (alg) {
            case Selection:
                new Selection<>(a).sort();
                 break;
            case Insertion:
                new Insertion<>(a).sort();
                break;
            case Shell:
                new Shell<>(a).sort();
                break;
            case Merge:
                new Merge<>(a).sort();
                break;
            case MergeBU:
                new MergeBU<>(a).sort();
                break;
            case Quick:
                new Quick<>(a).sort();
                break;
            case Quick3way:
                new Quick3way<>(a).sort();
                break;
            default:
                break;
        }
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

enum SortFunction {
    Selection, Insertion, Shell, Merge, MergeBU, Quick, Quick3way
}
