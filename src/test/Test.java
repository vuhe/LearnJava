// 包名
package test;

// 类名
public class Test {
    private final static int N = 20000;// 素数范围
    private static final boolean[] arrPrimeTable = new boolean[N + 1];// 筛选求素数

    // 主函数
    public static void main(String[] args) {
        //初始化
        for (int i = 2; i <= N; i++) {
            arrPrimeTable[i] = true;
        }
        //进行剔除
        for (int i = 2; i * i <= N; i++) {
            if (arrPrimeTable[i]) {
                //剔除i的倍数：t = x * i
                for (int t = i + i; t <= N; t += i) {
                    arrPrimeTable[t] = false;
                }
            }
        }
        // 输出
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (arrPrimeTable[i]) {
                System.out.print(i + "\t");
                count++;
                if (count % 15 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
