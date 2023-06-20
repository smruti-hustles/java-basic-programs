//outer and inner classes
class Outer{
    int a=10;
   void display(){
    Inner in=new Inner();
    in.result(); 
    }
    class Inner{
        void result(){
            System.out.println("the value of a="+a);
        }
    }
}

public class OuterInner2
{
	public static void main(String[] args) {
	    Outer out=new Outer();
	   
		out.display();
	}
}
