package KeyListener;

import javax.swing.*;

public class TestKeyListenerMain {
    public static void main(String[] args) {
        TestKeyListener f = new TestKeyListener("键盘事件");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();//什么意思？？
        f.setVisible(true);
    }
}
