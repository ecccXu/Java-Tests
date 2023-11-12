package WindowsSize;

import javax.swing.*;

/*
    1.1 设置窗口的默认尺寸
    通过设置窗口的默认尺寸，可以在创建窗口时指定其初始大小。
    可以使用setPreferredSize方法来设置窗口的默认尺寸。
    示例代码如下：
 */

public class WindowSizeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // 设置窗口的默认尺寸
        frame.setVisible(true);
    }
}