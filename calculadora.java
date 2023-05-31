import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/*
public class Main{
  private static void createAndShowGUI() {
    JFrame jFrame = new JFrame("Hello World Swing Example");
    jFrame.setLayout(new FlowLayout());
    jFrame.setSize(500, 360);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello World Swing");
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    label.setBorder(border);
    label.setPreferredSize(new Dimension(150, 100));

    label.setText("Hello World Swing");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);

    jFrame.add(label);
    jFrame.setVisible(true);
  }
*/

public class calculadora extends JFrame{
  
  public calculadora() throws Exception{
    super("Calculadora");

    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(350, 350);
    setLocation(400, 200);

    setLayout(new BorderLayout());

    TextPanel textPanel = new TextPanel();
        add(BorderLayout.NORTH, textPanel);

    JPanel digitsPanel = new JPanel();
    digitsPanel.setLayout(new BorderLayout());
    digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));

    digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));


    add(BorderLayout.CENTER, digitsPanel);

    

    setVisible(true);
    
  }


  //EXECUTAR CALCULADORA N PRECISA MEXER
  public static void main(String[] args) throws Exception{
    new calculadora();
  }
}

