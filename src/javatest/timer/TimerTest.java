package javatest.timer;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;

public class TimerTest {
    public static void main(String... args) {
        var timer = new Timer(1000, e -> {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
