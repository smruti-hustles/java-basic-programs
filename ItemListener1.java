import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*

<applet code="ItemListener1" width=300 height=300></applet>

*/

public class ItemListener1 extends Applet implements ItemListener

{

Checkbox c1=new Checkbox("Windows 98",true);

Checkbox c2=new Checkbox("Windows 2000");

Checkbox c3=new Checkbox("Windows NT");

Checkbox c4=new Checkbox("Windows XP");

public void init()

{

add(c1);add(c2);add(c3);add(c4);

c1.addItemListener(this);

c2.addItemListener(this);

c3.addItemListener(this);

c4.addItemListener(this);

}

public void itemStateChanged(ItemEvent e)

{

repaint();

}

public void paint(Graphics g)

{

g.drawString("Current State:",6,80);

g.drawString("Windows 98:"+c1.getState(),6,100);

g.drawString("Windows 2000:"+c2.getState(),6,120);

g.drawString("Windows NT:"+c3.getState(),6,140);

g.drawString("Windows XP:"+c4.getState(),6,160);

}

}