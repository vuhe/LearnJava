package homework.chapter13;

import javax.swing.*;
import java.awt.*;

public class WindowStateDemo extends JFrame {
    private static final long serialVersionUID = 7408181574918173831L;

    public static void main(String[] args) {
        WindowStateDemo frame = new WindowStateDemo();
        frame.setVisible(true);
    }

    public WindowStateDemo() {
        addWindowStateListener(e -> {
            int oldState = e.getOldState();
            int newState = e.getNewState();
            String from;
            String to;
            switch (oldState) {
                case Frame.NORMAL:
                    from = "正常化";
                    break;
                case Frame.MAXIMIZED_BOTH:
                    from = "最大化";
                    break;
                default:
                    from = "图标化";
                    break;
            }
            switch (newState) {
                case Frame.NORMAL:
                    to = "正常化";
                    break;
                case Frame.MAXIMIZED_BOTH:
                    to = "最大化";
                    break;
                default:
                    to = "图标化";
                    break;
            }
            System.out.println(from + " --> " + to);
        });
        setTitle("捕获窗体状态事件");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
