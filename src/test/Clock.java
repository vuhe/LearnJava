package test;

public class Clock {
    private final Display hour = new Display(24);
    private final Display minute = new Display(60);

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }

    public void start() {
        int i = 0;
        while (i++ < 1000) {
            add();
            System.out.println(this);
        }
    }

    private void add() {
        minute.increase();
        if (minute.getVal() == 0) {
            hour.increase();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hour.getVal() < 10) {
            sb.append(0);
        }
        sb.append(hour.getVal());
        sb.append(" : ");
        if (minute.getVal() < 10) {
            sb.append(0);
        }
        sb.append(minute.getVal());
        return sb.toString();
    }

    private static class Display {
        private int val = 0;
        private int limit = 0;

        Display(int limit) {
            this.limit = limit;
        }

        void increase() {
            val = (val + 1) % limit;
        }

        int getVal() {
            return val;
        }
    }
}
