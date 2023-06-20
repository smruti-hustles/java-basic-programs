import java.awt.Graphics;
import java.applet.Applet;

public class AppletEx extends Applet
{ 
   public void init()
   {
    System.out.println("Initialization");
    }
   public void start()
   {
      System.out.println("started");
    }
public void paint(Graphics g)
   {
      g.drawString("In paint method",150,150);
    }
   public void stop()
   {
      System.out.println("stopped");
    }
public void destroy()
   {
      System.out.println("destroied");
    }
  
}
/*
<html>
<body>
<applet code="AppletEx.java" width="400" height="400"></applet>
</body>
</html>
*/
