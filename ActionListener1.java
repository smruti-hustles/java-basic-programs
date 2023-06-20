import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*<applet code="ActionListener1" width=300 height=300></applet>*/

public class ActionListener1 extends Applet implements ActionListener

{

Label l1=new Label("First Number");

Label l2=new Label("Second Number");

Label l3=new Label("RESULT");

TextField t1=new TextField(20);

TextField t2=new TextField(20);

TextField t3=new TextField(20);

Button b1=new Button("Add");

Button b2=new Button("Clear");

public void init()

{

add(l1);

add(t1);

add(l2);

add(t2);

add(l3);

add(t3);

add(b1);

add(b2);

b1.addActionListener(this);

b2.addActionListener(this);

}

public void actionPerformed(ActionEvent e)

{

if(e.getSource()==b1)

{

int a=Integer.parseInt(t1.getText());

int b=Integer.parseInt(t2.getText());

t3.setText(""+(a+b));

}

else if(e.getSource()==b2)

{

t1.setText("");

t2.setText("");

t3.setText("");

}}}