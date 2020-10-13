package homework.chapter13;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends JFrame {
    private static final long serialVersionUID = 7408181574918173831L;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                // 创建窗口对象
                KeyEventDemo frame = new KeyEventDemo();
                // 设置窗口可见
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public KeyEventDemo() {
        // 设置窗体标题
        setTitle("监听键盘事件");
        // 单击关闭按钮时关闭窗体
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体显示位置
        setBounds(100, 100, 450, 300);
        // 创建面板
        JPanel contentPane = new JPanel();
        // 设置面板边框
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // 设置边界
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        // 创建文本区
        final JTextArea textArea = new JTextArea();

        textArea.addKeyListener(new KeyListener() {
            // 发生击键事件时被触发
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("此次输入的是「" + e.getKeyChar() + "」");
            }

            // 按键被按下时被触发
            @Override
            public void keyPressed(KeyEvent e) {
                // 获得描述 keyCode 的标签
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                // 判断按下的是否为动作键
                if (e.isActionKey()) {
                    System.out.println("您按下的是动作键「" + keyText + "」");
                } else {
                    System.out.println("您按下的是非动作键「" + keyText + "」");
                    // 获得与此事件中的键相关联的字符
                    int keyCode = e.getKeyCode();
                    switch (keyCode) {
                        case KeyEvent.VK_CONTROL:
                            System.out.println(", Control键被按下");
                            break;
                        case KeyEvent.VK_ALT:
                            System.out.println(", Atl键被按下");
                            break;
                        case KeyEvent.VK_SHIFT:
                            System.out.println(", Shift键被按下");
                            break;
                        default:
                            break;
                    }
                    System.out.println();
                }
            }

            // 释放触发
            @Override
            public void keyReleased(KeyEvent e) {
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                System.out.println("您释放的是「" + keyText + "」键");
            }
        });
        // 设置文本区字体
        textArea.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        scrollPane.setViewportView(textArea);
    }
}
