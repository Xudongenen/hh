import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InputInteger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputInteger");
        frame.setContentPane(new InputInteger().InputInteger);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel InputInteger;

    public InputInteger() {

        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                try {
                    textField2.setText(Integer.valueOf(textField1.getText())/100%10+"");
                    textField3.setText(Integer.valueOf(textField1.getText())/10%10+"");
                    textField4.setText(Integer.valueOf(textField1.getText())%10+"");
                }catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, textField1.getText() + "不能转换成整数","消息", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
