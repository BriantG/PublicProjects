
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class HelloWorldPanel implements ActionListener { 
   
   private JFrame frame;
   private JPanel panel;
   
   private JLabel instructionLabel;
   private JTextField field;
   private int width;
   private int height;
   
   public HelloWorldPanel() 
   {
      frame       =     null;
      panel       =     null;
      field       =     null;
      width       =     0;
      height      =     0;
   
      width       =     360;
      height      =     180;
      
      setFrame();
      setPanel();
      addComponents();
      endFrame();
   }
   
   public void setFrame(){

      frame       =     new JFrame();
      frame       .     setTitle("Hello there ");
      frame       .     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame       .     setPreferredSize(new Dimension(width, height));
   }
   
   public void endFrame(){
      
      frame       .     pack();
      frame       .     setLocationRelativeTo(null);
      frame       .     setVisible(true);
   }
   
   public JFrame getFrame(){
   
      return            frame;
   }
   
   
   public void setPanel()
   {

      panel       =     new JPanel();
      panel       .     setPreferredSize(new Dimension(300,300));
      panel       .     setBackground(Color.decode("#000000"));
      panel       .     setForeground(Color.decode("#FFFFFF"));
   }
   
   public JPanel getPanel()
   {
  
     return             panel;
   }
   
   public void setField(){
   
      field       =     new JTextField(30);
      field       .     addActionListener(this);   
   
   }
   public JTextField getField(){
   
      return            field;
   }
   
   public void addComponents()
   {
      setInstructionLabel();
      setField();
      
      panel       .     add(getInstructionLabel());
      panel       .     add(getField());
      frame       .     add(getPanel());
      
   }
   
   public void actionPerformed(ActionEvent e)
   {
   
      String message =  "";
      message        =  "Hello ";
      JOptionPane    .  showMessageDialog(null,message + " " + field.getText() );
   }
  public void setInstructionLabel()
   {
      instructionLabel       =     new JLabel();
      instructionLabel       .     setText("Please enter your name in the text field: ");
      instructionLabel       .     setForeground(Color.decode("#FFFFFF"));
   }
   public JLabel getInstructionLabel(){
   
      return                       instructionLabel;
   }
}

public class HelloWorldDemo {

  public static void main(String[] args)
  {
  HelloWorldPanel test = null;

  test = new HelloWorldPanel();

}

}
