package packa;

import java.awt.*;
import javax.swing.*;
public class swingdemo_inheritance extends JFrame{
    Button b1;
    TextField tf;
    swingdemo_inheritance()
    {
    	setSize(300,330);
    	setVisible(true);
    	b1 = new Button("Click");
    	tf = new TextField("Hello!");
    	b1.setBounds(10,30,95,30);
    	tf.setBounds(150,50,150,30);
    	add(b1);
    	add(tf);
    	setLayout(null);
    }
    public static void main(String[] args)
    {
    swingdemo_inheritance	obj = new swingdemo_inheritance();
    }
}
