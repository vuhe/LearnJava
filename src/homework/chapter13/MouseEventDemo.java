package homework.chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo extends JFrame {
    private static final long serialVersionUID = 7408181574918173831L;

    public static void main(String[] args) {
        MouseEventDemo frame = new MouseEventDemo();
        frame.setVisible(true);
    }

    public MouseEventDemo() {
        super();
        setTitle("鼠标事件示例");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("单击了鼠标按键，");
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        System.out.println("单击的是鼠标左键");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("单击的是鼠标滚轮");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("单击的是鼠标右键");
                        break;
                    default:
                        break;
                }
                System.out.println("单击次数为 " + e.getClickCount() + " 次");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按键被按下，");
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        System.out.println("按下的是鼠标左键");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("按下的是鼠标滚轮");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("按下的是鼠标右键");
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标按键被释放，");
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        System.out.println("释放的是鼠标左键");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("释放的是鼠标滚轮");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("释放的是鼠标右键");
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("光标移入组件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("光标移出组件");
            }
        });
        getContentPane().add(label, BorderLayout.CENTER);
    }
}
