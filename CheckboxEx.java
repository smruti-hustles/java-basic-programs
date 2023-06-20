import java.awt.*;
class CheckboxEx{
public static void main(String args[])
{
Frame f=new Frame("This is the Frame");
Checkbox c1=new Checkbox("Cse");
c1.setBounds(100,100,50,50);
Checkbox c2=new Checkbox("it",true);
c2.setBounds(100,150,50,50);
f.add(c1);
f.add(c2);
f.setSize(1000,500);
f.setVisible(true);
}
}
