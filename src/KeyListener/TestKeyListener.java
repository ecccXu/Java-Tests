package KeyListener;
/*
    键盘事件处理
 */

import java.awt.*;
import javax.swing.*;
public class TestKeyListener extends JFrame {
    TestKeyListener(String sTitle){
        super(sTitle);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,1,2,2));

        //选择角色
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(new JLabel("选择角色："));
        JComboBox jcb = new JComboBox();
        jcb.addItem("教师");
        jcb.addItem("学生");
        jcb.setSelectedIndex(1);

        panel1.add(jcb);//panel1加入combobox
        c.add(panel1);//container加入panel1

        //输入学号
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("输入学号："));
        FgTextField txtNum = new FgTextField("", 15, true);
        panel2.add(txtNum);
        c.add(panel2);

        //输入密码
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.add(new JLabel("输入密码："));
        panel3.add(new JPasswordField("",15));
        c.add(panel3);

        //登录按钮
        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel4.add(new JButton("登录"));
//        panel4.add(new JButton("注册"));//输入两次密码，第一次输入之后变为不可见
        panel4.add(new JButton("取消"));
        c.add(panel4);
    }
}
