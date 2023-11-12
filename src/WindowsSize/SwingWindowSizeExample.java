package WindowsSize;

import javax.swing.*;
import java.awt.*;

//2. 代码示例
public class SwingWindowSizeExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Window Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的默认尺寸
        frame.setSize(500, 400);

        // 设置最小尺寸
        frame.setMinimumSize(new Dimension(300, 200));

        // 设置最大尺寸
        frame.setMaximumSize(new Dimension(800, 600));

        // 设置窗口居中显示
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}