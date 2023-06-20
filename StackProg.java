import java.util.*;
public class StackProg
{
	public static void main(String[] args) {
	     Stack<Integer> l=new Stack<Integer>();
	    l.add(100);
	    l.add(200);
	    l.add(300);
	    System.out.println("Stack is");
           Iterator i=l.iterator();
           while(i.hasNext())
           {
               System.out.println(i.next());
           }
          
	}
}
