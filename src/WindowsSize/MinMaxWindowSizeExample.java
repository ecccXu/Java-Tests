package WindowsSize;

import javax.swing.*;
import java.awt.*;

/*
    1.3 设置窗口最大和最小尺寸
    我们也可以通过设置窗口的最大和最小尺寸来限制用户调整窗口的大小。
    可以使用setMinimumSize和setMaximumSize方法来设置最小和最大尺寸。
    示例代码如下：
 */
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