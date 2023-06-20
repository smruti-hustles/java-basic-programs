//static Method
import java.util.*;
public class StaticMethod
{
    int rno;
    String name;
    static String college="au";
    
    static void m(){
        college="Anurag University";
      
    }
    
    StaticMethod(int rno,String name){
        this.rno=rno;
        this.name=name;
        }
        void display(){
           	System.out.println("***student details***"); 
          System.out.print("roll no = "+rno+"; "); 
          System.out.print("name = "+name+"; ");
           System.out.println("college="+college);
        }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    String b=sc.nextLine();
           StaticMethod.m();
	    StaticMethod s1=new StaticMethod(a,b);
	    s1.display();
           StaticMethod s2=new StaticMethod(12,"abc");
	     s2.display();
	     
	}
}
