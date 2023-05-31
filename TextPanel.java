import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel{
    private JTextField txtNumber;

    public TextPanel(){
        setLayout(new FlowLayout());
        txtNumber = new  JTextField(15);
        txtNumber.setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.setEnabled(false);
        add(txtNumber);
    }

    public JTextField getTxtNumber(){
        return txtNumber;
    }
    
}
