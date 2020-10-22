package test;

import jdkpreview.Jdk17;


class Solution {

    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    private String getString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String... args) {
        Solution s0 = new Solution();
//        double key = s0.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.2}, 0, 2);
//        System.out.println(key);
//        Map<Integer, Integer> a = new HashMap<>();
//        Character a0;
        s0.backspaceCompare("y#fo##f", "y#f#o##f");
    }
}
