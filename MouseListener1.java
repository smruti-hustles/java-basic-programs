import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*

<applet code="MouseListener1" width=300 height=300></applet>

*/

public class MouseListener1 extends Applet implements MouseListener

{

String msg="";

int x=0,y=0;

public void init()

{

addMouseListener(this);

}

public void mousePressed(MouseEvent me)

{

x=me.getX();

y=me.getY();

msg="Mouse Pressed";

repaint();

}

public void mouseReleased(MouseEvent me)

{

x=me.getX();

y=me.getY();

msg="Mouse Released";

repaint();

}

public void mouseEntered(MouseEvent me)

{

x=me.getX();

y=me.getY();

msg="Mouse Entered";

repaint();

}

public void mouseExited(MouseEvent me)

{

x=me.getX();

y=me.getY();

msg="Mouse Exited";

repaint();

}

public void mouseClicked(MouseEvent me)

{

x=me.getX();

y=me.getY();

msg="Mouse Clicked";

repaint();

}

public void paint(Graphics g)

{

g.drawString(msg,x,y);

}

}