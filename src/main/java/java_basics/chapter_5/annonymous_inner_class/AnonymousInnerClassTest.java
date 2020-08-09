package java_basics.chapter_5.annonymous_inner_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClassTest {

    public static void main(String[] args) {

        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Close program");
        System.exit(0);
        }
    }

class TalkingClock {

    public void start(int interval, boolean beep) {

        ActionListener listener = e -> {
            System.out.println("beep");
            if(beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();

    }
}
