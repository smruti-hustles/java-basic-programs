import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*

<applet code="KeyListener1" width=300 height=300></applet>

*/

public class KeyListener1 extends Applet implements KeyListener

{

String msg="";

public void init()

{

addKeyListener(this);

}

public void keyTyped(KeyEvent e)

{

}

public void keyPressed(KeyEvent e)

{

msg+=e.getKeyChar();

repaint();

}

public void keyReleased(KeyEvent e)

{

}

public void paint(Graphics g)

{

g.drawString(msg,10,20);

}

}