import java.awt.*;
import javax.swing.*;
 
public class Gui {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Display Area");
      Container cp = frame.getContentPane();
      cp.setLayout(new FlowLayout());
      JButton btnApple = new JButton("apple");
      btnApple.setPreferredSize(new Dimension(20, 20));
      cp.add(btnApple);
 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 350);  // or pack() the components
      frame.setLocationRelativeTo(null);  // center the application window
      frame.setVisible(true);             // show it

   }
}
