package WindowsSize;

import javax.swing.*;
import java.awt.*;

//1.3 设置窗口最大和最小尺寸
public class MinMaxWindowSizeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Min/Max Window Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // 设置最小尺寸
        frame.setMinimumSize(new Dimension(400, 300));

        // 设置最大尺寸
        frame.setMaximumSize(new Dimension(800, 600));

        frame.setVisible(true);
    }
}