/*
Write a java program using Split pane to demonstrate a screen divided in two parts, one part contains the names of Planets and another Displays the image of planet. When user selects the planet name form Left screen, appropriate image of planet displayed in right screen.
*/
/*
Add required images into folder. Check (http://myitweb.weebly.com/jsplitpane.html)
*/

import javax.swing.*;

import java.awt.*;

import javax.swing.event.*;

class JSplitPaneDemo implements ListSelectionListener

{

JFrame frame;

JScrollPane sp1,sp2,sp3;

JSplitPane splitpane1,splitpane2;

JList list;

String planet_name[] = {"Mecury" ,"Venus" ,"Earth" ,"Mars" ,"Jupiter" ,"Saturn" ,"Uranus","Neptune", "Pluto"};

ImageIcon me,v,e,m,j,s,u,n,p;

JLabel label;

JPanel panel;

JTextArea text;

String info[] = {"Radius =2440  \nMoons = 0", "Radius =6052  \nMoons = 0", "Radius =6378  \nMoons = 1", "Radius =3397  \nMoons = 2"

, "Radius =71492  \nMoons = 16", "Radius =60268  \nMoons = 18", "Radius =25559  \nMoons = 17", "Radius =24766  \nMoons = 8",

"Radius =1137  \nMoons = 1"};

public JSplitPaneDemo()

{

frame = new JFrame("SplitPaneDemo");

frame.setVisible(true);

frame.setSize(500,500);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

list = new JList(planet_name);

me = new ImageIcon("Mercury.jpg");

v = new ImageIcon("Venus.jpg");

e = new ImageIcon("Earth.jpg");

m = new ImageIcon("Mars.jpg");

j = new ImageIcon("Jupiter.jpg");

s = new ImageIcon("Saturn.jpg");

u = new ImageIcon("Uranus.jpg");

n = new ImageIcon("Neptune.jpg");

p = new ImageIcon("Pluto.jpg");

panel = new JPanel(new FlowLayout());

label=new JLabel();

label.setIcon(me);

panel.add(label);

sp1 = new JScrollPane(list);

text = new JTextArea(info[0],20,10);

sp3 = new JScrollPane(text);

splitpane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,sp1,panel);

splitpane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,true,splitpane2,sp3);

frame.add(splitpane1);

list.addListSelectionListener(this);

}

public void valueChanged(ListSelectionEvent le)

{

int selected;

selected=list.getSelectedIndex();

                                    if(selected==0)

                                    {

                                    label.setIcon(me);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==1)

                                    {

                                    label.setIcon(v);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==2)

                                    {

                                    label.setIcon(e);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==3)

                                    {

                                    label.setIcon(m);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==4)

                                    {

                                    label.setIcon(j);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==5)

                                    {

                                    label.setIcon(s);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==6)

                                    {

                                    label.setIcon(u);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==7)

                                    {

                                    label.setIcon(n);

                                    text.setText(info[selected]);

                                    }

                                    else if(selected==8)

                                    {

                                    label.setIcon(p);

                                    text.setText(info[selected]);

                                    }

}

public static void main(String args[])

{

JSplitPaneDemo obj = new JSplitPaneDemo();

}

}



