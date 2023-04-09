package packa;

import javax.swing.*;
import java.awt.*;
public class borderdemo {
  Jframe f;
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JButton b5;
  


borderdemo() {
	f = new JFrame();
	b1 = new JButton("Button 1");
	b2 = new JButton("Button 2");
	b3 = new JButton("Button 3");
	b4 = new JButton("Button 4");
	b5 = new JButton("Button 5");
	
	f.add(b1, BorderLayout.CENTER);
	f.add(b2, BorderLayout.SOUTH);
	f,add(b3, BorderLayout.NORTH);
	f.add(b4, BorderLayout.WEST);
	f.add(b5, BorderLayout.EAST);
	f.setSize(300,300);
	f.setVisible(true);
}

 public static void main(String[] args)
 {
	 new borderdemo();
 }
}