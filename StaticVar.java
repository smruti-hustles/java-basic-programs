//static variable
import java.util.*;
public class StaticVar
{
    int rno;
    String name;
    static String college="au";
    
    StaticVar(int rno,String name){
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
	    StaticVar s1=new StaticVar(a,b);
	     StaticVar s2=new StaticVar(12,"abc");
	     s1.display();
	     s2.display();
	
	}
}
