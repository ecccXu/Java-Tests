package WindowsSize;

import javax.swing.*;

//1.1 设置窗口的默认尺寸
public class WindowSizeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // 设置窗口的默认尺寸
        frame.setVisible(true);
    }
}