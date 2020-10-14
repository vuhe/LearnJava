package homework.chapter13;

@FunctionalInterface
interface Listener {
    void run(Integer i);
}

class Event {
    public void task(Integer i, Listener listener) {
        // ...

        // 当符合某个条件时调用一下语句
        listener.run(i);

        // ...
    }
}

public class Test {
    public static void main(String[] args) {
        Event event = new Event();

        // 监听者调用
        event.task(1, new Listener() {
            /**
             * 这个方法实际会在上面 Event 类中
             * 出现合适的条件时调用
             *
             * @param i 参数
             */
            @Override
            public void run(Integer i) {
                System.out.println(i);
            }
        });

        // jdk8+ 可以使用 lambda 简写
        event.task(2, i -> {
            System.out.println(i);
        });

        // 进一步，仅有一个语句的可以使用「方法引用」
        event.task(3, System.out::println);
    }
}
