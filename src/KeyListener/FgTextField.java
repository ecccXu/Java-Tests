package KeyListener;

import javax.swing.*;
import java.awt.event.*;


public class FgTextField extends JTextField {
    boolean m_bOnlyInteger;
    FgTextField(String sText, int columns, boolean bOnlyInteger){
        super(sText, columns);

        m_bOnlyInteger = bOnlyInteger;
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                if (m_bOnlyInteger){
                    char c = e.getKeyChar();
                    if (c<'0'|c>'9')
                        e.consume();//取消输入
                }
            }
        });
    }
}
