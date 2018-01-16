package Lab8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
 
public class summator extends Applet{
	 public void init(){
		 setLayout(null);
		 final TextField tf1 = new TextField(15);
		 tf1.setBounds(1, 1, 100, 20);
		 add(tf1);
		 final TextField tf2 = new TextField(15);
		 tf2.setBounds(1, 25, 100, 20);
		 add(tf2);
		 final TextField tf3 = new TextField(15);
		 tf3.setBounds(1, 50, 100, 20);
		 add(tf3);
		 Button b1 = new Button("Button 1");
		 b1.setBounds(1, 100, 100, 20);
		 add(b1);
		 b1.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent event){
		 try{
		 tf3.setText(String.valueOf((Long.valueOf(tf1.getText())
		+Long.valueOf(tf2.getText()))));
		 }catch(Exception e){
		 tf3.setText("Summ");
		 }
		 }
		 });
		 }
}
