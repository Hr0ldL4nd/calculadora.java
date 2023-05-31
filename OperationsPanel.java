import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperationsPanel extends JPanel implements ActionListener{
    private JTextField txtText;

    private char op;
    private double valor1;
    private double valor2;

    private JButton btnADD;
    private JButton btnSUB;
    private JButton btnMULT;
    private JButton btnDIV;
    private JButton btnEQ;
    private JButton btnCLEAR;


    public OperationsPanel(JTextField txtText){
        this.txtText = txtText;

        setLayout(new GridLayout(3,2));

        btnADD = new JButton("+");
        btnADD.addActionListener(this);
        add(btnADD);

        btnSUB = new JButton("-");
        btnSUB.addActionListener(this);
        add(btnSUB);

        btnMULT = new JButton("x");
        btnMULT.addActionListener(this);
        add(btnMULT);

        btnDIV = new JButton("/");
        btnDIV.addActionListener(this);
        add(btnDIV);

        btnEQ = new JButton("=");
        btnEQ.addActionListener(this);
        add(btnEQ);

        btnCLEAR = new JButton("C");
        btnCLEAR.addActionListener(this);
        add(btnCLEAR);
    }

        @Override
        public void actionPerformed(ActionEvent e){

            if(txtText.getText().isEmpty()){
                return;
            }

            JButton btn = (JButton) e.getSource();

            if(btn == btnCLEAR){
                op = '\u0000';
                txtText.setText("");
            }
            else if(btn == btnEQ){
                valor2 = Double.parseDouble(txtText.getText());

                double result = 0.0;

                if(op == '+'){
                    result = valor1 + valor2;
                }
                else if(op == '-'){
                    result = valor1 - valor2;
                }
                else if(op == 'x'){
                    result = valor1 * valor2;
                }
                else{
                    result = valor1/valor2;
                }

                txtText.setText(String.valueOf(result));
                op = '\u0000';
                valor1 = result;
                valor2 = 0;
            }
            else{
                op = btn.getText().charAt(0);
                valor1 = Double.parseDouble(txtText.getText());
                txtText.setText("");

            }

        }
    }



