/* 
Write a program to present a set of choice for user to select stationary products and display the price of products after selection from the list. 
*/


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Pract2 extends JFrame implements ListSelectionListener
{
	JLabel jl1;
	JList list;
	JTextFieldjtf;
	String name[]={"BOOKS","PEN","PENCIL","SHARPENER","SCALE"};

	public Pract2()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		jl1=new JLabel("Select a product");
		cp.add(jl1,BorderLayout.NORTH);
		list=new JList(name);
		list.addListSelectionListener(this);
		cp.add(list,BorderLayout.CENTER);
		jtf=new JTextField(15);
		cp.add(jtf,BorderLayout.SOUTH);
	}
	
		public void valueChanged(ListSelectionEvent le)
		{
			int i=list.getSelectedIndex();
			if(i==0)
			{
				jtf.setText("The price of Books is Rs.100");
			}
			else if(i==1)
			{
				jtf.setText("The price of pen is Rs.10");
			}
			else if(i==2)
			{
				jtf.setText("The price of pencil is Rs.5");
			}
			else if(i==3)
			{
				jtf.setText("The price of sharpener is Rs.3");
			}
			else if(i==4)
			{
				jtf.setText("The price of scale is Rs.5");
			}
			else
			{
				jtf.setText("Select Item");
			}
	}
	public static void main(String args[])
	{
		Pract2 p1=new Pract2();
		p1.setSize(500,500);
		p1.setVisible(true);
		p1.setTitle("Product");
		p1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

