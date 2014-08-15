/* Write a swing application to create the student details form consisting of two tabs. The first tab should display personal details of students & the second tab should display educational details. Use various components to create GUI & add appropriate listener to form. */

import java.awt.*;
importjavax.swing.*;
importjava.awt.event.*;

public class Pract1 extends JFrame
{
	public static void main(String args[])
	{
		Pract1 p1=new Pract1();
		p1.setSize(300,270);
		p1.setVisible(true);
		p1.setTitle("Student Details");
		p1.setLocation(300,300);
		p1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Pract1()
	{
		Container cp=getContentPane();
		JTabbedPane jtb=new JTabbedPane();
		jtb.addTab("Personal Detail",newPersonalpanel());
		jtb.addTab("Educational Detail",newEducationalpanel());
		cp.add(jtb);
	}
	
	public class Personalpanel extends JPanel implements ActionListener
	{
		JLabeljlrollno,jlname,jladd,jlgender;
		JButtonbtnew,btexit;
		JTextFieldjtfroll,jtfname;
		JTextAreajtadd;
		ButtonGroupbg;
		JRadioButton jr1,jr2;
		JScrollPanejsp;
		
		public Personalpanel()
		{
			setLayout(null);
			jlrollno=new JLabel("Roll No",JLabel.RIGHT);
			jlrollno.setBounds(20,10,80,20);
			add(jlrollno);
			
			jtfroll=new JTextField(15);
			jtfroll.setBounds(120,10,80,20);
			jtfroll.setEditable(false);
			add(jtfroll);
			
			jlname=new JLabel("Name",JLabel.RIGHT);
			jlname.setBounds(20,40,80,20);
			add(jlname);

			jtfname=new JTextField(15);
			jtfname.setBounds(120,40,80,20);
			jtfname.setEditable(false);
			add(jtfname);
			
			jladd=new JLabel("Address",JLabel.RIGHT);
			jladd.setBounds(20,70,80,20);
			add(jladd);

			jtadd=new JTextArea();
			jtadd.setEditable(false);
			
			jsp=new 
JScrollPane(jtadd,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPane

Constants.HORIZONTAL_SCROLLBAR_ALWAYS);
			jsp.setBounds(120,70,120,40);
			add(jsp);

			jlgender=new JLabel("Gender",JLabel.RIGHT);
			jlgender.setBounds(20,110,80,20);
			add(jlgender);

			jr1=new JRadioButton("Male");
			jr1.setBounds(120,110,80,20);
			jr1.setEnabled(false);

			jr2=new JRadioButton("Female");
			jr2.setBounds(120,140,80,20);
			jr2.setEnabled(false);

			bg=new ButtonGroup();
			bg.add(jr1);
			bg.add(jr2);

			add(jr1);
			add(jr2);

			btnew=new JButton("New");
			btnew.setBounds(70,170,80,20);
			btnew.addActionListener(this);
			add(btnew);

			btexit=new JButton("Exit");
			btexit.setBounds(160,170,80,20);
			btexit.addActionListener(this);
			add(btexit);
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btnew)
			{
				if(btnew.getText()=="New")
				{
					jtfroll.setEditable(true);
					jtfname.setEditable(true);
					jtadd.setEditable(true);
					jr1.setEnabled(true);
					jr2.setEnabled(true);
					btnew.setText("Clear");
				}
				
				else if(btnew.getText()=="Clear")
				{
					jtfroll.setText(" ");
					jtfroll.setEditable(false);
					jtfname.setText(" ");
					jtfname.setEditable(false);
					jtadd.setEditable(false);
					jtadd.setText(" ");
					jr1.setEnabled(false);
					jr2.setEnabled(false);
					btnew.setText("New");
				}
			}
			if(ae.getSource()==btexit)
			{
				System.exit(0);
			}
		}
	}
	public class Educationalpanel extends JPanel implements ItemListener
	{
		JLabeljlclass;
		JComboBoxjcb;
		JCheckBoxc,web,maths,cg,oops,os,java,net,linux;

		public Educationalpanel()
		{
			jlclass=new JLabel("Class",JLabel.RIGHT);
			jlclass.setBounds(20,10,80,20);
			add(jlclass);

			String[] 
subject={"F.Y.B.Sc.I.T","S.Y.B.Sc.I.T","T.Y.B.Sc.I.T"};
			jcb=new JComboBox(subject);
			jcb.addItemListener(this);
			jcb.setBounds(120,10,120,20);
			add(jcb);
		
			c=new JCheckBox("c++");
			c.setBounds(20,40,80,20);
			c.setVisible(false);
			add(c);

			web=new JCheckBox("Web");
			web.setBounds(110,40,80,20);
			web.setVisible(false);
			add(web);

			maths=new JCheckBox("Maths1");
			maths.setBounds(200,40,80,20);
			maths.setVisible(false);
			add(maths);

			cg=new JCheckBox("Cg");
			cg.setBounds(20,40,80,20);
			cg.setVisible(false);
			add(cg);

			oops=new JCheckBox("Oops");
			oops.setBounds(110,40,80,20);
			oops.setVisible(false);
			add(oops);

			os=new JCheckBox("Os");
			os.setBounds(200,40,80,20);
			os.setVisible(false);
			add(os);

			java=new JCheckBox("Java");
			java.setBounds(20,40,80,20);
			java.setVisible(false);
			add(java);

			net=new JCheckBox(".Net");
			net.setBounds(110,40,80,20);
			net.setVisible(false);
			add(net);
	
			linux=new JCheckBox("Linux");
			linux.setBounds(200,40,80,20);
			linux.setVisible(false);
			add(linux);
		}
		public void itemStateChanged(ItemEvent ie)
		{
			String s=(String)ie.getItem();
			System.out.println(s);
			if(s=="F.Y.B.Sc.I.T")
			{
				c.setVisible(true);
				web.setVisible(true);
				maths.setVisible(true);
				cg.setVisible(false);
				oops.setVisible(false);
				os.setVisible(false);
				java.setVisible(false);
				net.setVisible(false);
				linux.setVisible(false);
		
			}
			else if(s=="S.Y.B.Sc.I.T")
			{
				c.setVisible(false);
				web.setVisible(false);
				maths.setVisible(false);
				cg.setVisible(true);
				oops.setVisible(true);
				os.setVisible(true);
				java.setVisible(false);
				net.setVisible(false);
				linux.setVisible(false);
			}
			else
			{
				c.setVisible(false);
				web.setVisible(false);
				maths.setVisible(false);
				cg.setVisible(false);
				oops.setVisible(false);
				os.setVisible(false);
				java.setVisible(true);
				net.setVisible(true);
				linux.setVisible(true);
			}
		}
	}
}
