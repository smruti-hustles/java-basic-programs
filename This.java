//implementation of this keyword
import java.util.*;
public class This
{
    String name;
    int rollno;
    
     This(String name,int rollno){
         this.name=name;
         this.rollno=rollno;
     }
     
     void display(){
         System.out.println("name="+this.name);
         System.out.println("rollno="+this.rollno);
     }
	public static void main(String[] args) {
	This s1=new This("smruti",62);
	This s2=new This("xyz",63);
	s1.display();
    s2.display();
	}
}
