package jvm.chapter2;

/**
 * <h1>此操作可能导致系统假死</h1>
 * VM Args: -Xss2M
 *
 * @author zhuhe
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {}
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(this::dontStop);
            thread.start();
        }
    }

    public static void main(String... args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
