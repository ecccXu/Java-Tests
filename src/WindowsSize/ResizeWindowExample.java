package WindowsSize;

import javax.swing.*;

/*
    1.2 调整窗口大小
    在运行时，我们可以通过调用setSize方法来调整窗口的大小。
    示例代码如下：
 */
public class ResizeWindowExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resize Window Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 调整窗口的大小
        frame.setSize(800, 600);
    }
}
