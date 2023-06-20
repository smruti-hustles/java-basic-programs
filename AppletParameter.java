import java.applet.Applet;

import java.awt.Graphics;

public class AppletParameter extends Applet{

public void paint(Graphics g){

String str=getParameter("msg");

g.drawString(str+"cse",50,50);

}

}

/*

<html>

<body>

<applet code="AppletParameter.class" width="300" height="300">

<param name="msg" value="Welcome">

</applet>

</body>

</html>

*/