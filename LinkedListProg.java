import java.util.*;
public class LinkedListProg
{
	public static void main(String[] args) {
	    LinkedList<String> l=new LinkedList<String>();
	    l.add("cse");
	    l.add("it");
	    l.add("ece");
	    System.out.println("LinkedList is");
           for(String branches:l)
        {
            System.out.println(branches);
          }
	}
}
