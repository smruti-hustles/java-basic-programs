// import statements  
import java.awt.*;    
 
    
public class GridLayoutExample  
{    
  
GridLayoutExample()  
{    
Frame O= new Frame();    
  
// creating 9 buttons  
Button btn1 = new Button("1");    
Button btn2 = new Button("2");    
Button btn3 = new Button("3");    
Button btn4 = new Button("4");    
Button btn5 = new Button("5");    
Button btn6 = new Button("6");    
Button btn7 = new Button("7");    
Button btn8 = new Button("8");    
Button btn9 = new Button("9");    
    
O.add(btn1); 
O.add(btn2); 
O.add(btn3);  
O.add(btn4);
O.add(btn5);
O.add(btn6);  
O.add(btn7);
O.add(btn8);
O.add(btn9);    
O.setLayout(new GridLayout());    
  
  
O.setSize(300, 300);    
O.setVisible(true);    
}  
public static void main(String argvs[])   
{    
new GridLayoutExample();    
}    
}    