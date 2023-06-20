// calculator using awt
import java.awt.*;
import java.awt.applet.*;
import java.awt.event.*;
/*<applet code="Calcu.class" width=300 height=300></applet>*/
 public class Calcu extends Applet implements ActionListener
{
   Label l1=new Label("First Number");

Label l2=new Label("Second Number");

Label l3=new Label("RESULT");
TextField t1=new TextField(20);

TextField t2=new TextField(20);

TextField t3=new TextField(20);

Button b1=new Button("+");
Button b2=new Button("-");
Button b3=new Button("*");
Button b4=new Button("/");
Button b5=new Button("%");


Button b6=new Button("Clear");
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
add(b3);

add(b4);

add(b5);

add(b6);


b1.addActionListener(this);

b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);


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