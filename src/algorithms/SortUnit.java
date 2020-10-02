package algorithms;

import algorithms.sort.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SortUnit {
    private SortUnit(){
        throw new UnsupportedOperationException();
    }

    public static <T extends Comparable<? super T>> T[] sortOf(T[] arr) {
        return sortOf(arr, SortFunction.Quick);
    }

    public static <T extends Comparable<? super T>> T[] sortOf(T[] arr, SortFunction function) {
        Example<T> example = function.getAFunction(arr);
        example.sort();
        return example.getArray();
    }

    public static <T extends Comparable<? super T>> List<T> sortOf(List<T> list) {
        return sortOf(list, SortFunction.Quick);
    }

    public static <T extends Comparable<? super T>> List<T> sortOf(List<T> list, SortFunction function) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[])list.toArray();
        arr = sortOf(arr, function);
        List<T> ans = new ArrayList<>(arr.length + 10);
        ans.addAll(Arrays.asList(arr));
        return ans;
    }
}

enum SortFunction {
    Selection() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Selection<>(arr);
        }
    },
    Insertion() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Insertion<>(arr);
        }
    },
    Shell() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Shell<>(arr);
        }
    },
    Merge() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Merge<>(arr);
        }
    },
    MergeBU() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new MergeBU<>(arr);
        }
    },
    Quick() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Quick<>(arr);
        }
    },
    Quick3way() {
        @Override
        public <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr) {
            return new Quick3way<>(arr);
        }
    };

    public abstract  <T extends Comparable<? super T>> Example<T> getAFunction(T[] arr);
}