package test;

/**
 * 时钟类
 * 由于在本题中，Display类仅仅使用在Clock类中
 * 因此将Display类定义为「内部类」
 */
public class Clock {
    // 时和分的显示变量，由于在使用期间对象句柄不会变换，使用了final
    private final Display hour = new Display(24);
    private final Display minute = new Display(60);

    public static void main(String[] args) {
        // 创建一个时钟
        Clock clock = new Clock();
        // 开始运行
        clock.start();
    }

    /**
     * 此函数执行时钟的运行
     */
    public void start() {
        int i = 0;
        // 为避免CPU消耗过大，对循环进行了限制
        // 理论上应改为无限循环
        while (i++ < 1000) {
            // 调用「分」加一
            add();
            // 输出，此类对toString进行了重写，输出格式可参见toString()
            System.out.println(this);
        }
    }

    /**
     * 执行对「分」加一的操作
     */
    private void add() {
        // 调用显示的「分」加一
        minute.increase();
        // 如果为0，则需要进位，对「时」加一
        if (minute.getVal() == 0) {
            hour.increase();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // 如果小时不足两位在前面补0
        if (hour.getVal() < 10) {
            sb.append(0);
        }
        // 小时
        sb.append(hour.getVal());
        // 分隔符
        sb.append(" : ");
        // 如果分钟不足两位在前面补0
        if (minute.getVal() < 10) {
            sb.append(0);
        }
        // 分钟
        sb.append(minute.getVal());
        return sb.toString();
    }

    /**
     * 由于此类的显示仅被Clock类调用，因此被写成了内部可见
     */
    private static class Display {
        private int val = 0;   // 数据
        private int limit = 0; // 界限

        /**
         * 构造函数
         * @param limit 数据界限
         */
        Display(int limit) {
            this.limit = limit;
        }

        /**
         * 加值
         * 如果值大于界限，则取余
         */
        void increase() {
            val = (val + 1) % limit;
        }

        /**
         * getter
         * @return val
         */
        int getVal() {
            return val;
        }
    }
}
