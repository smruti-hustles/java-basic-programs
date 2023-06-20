//outer and inner classes
class Outer{
    int a=10;
    class Inner{
        void display(){
            System.out.println("the value of a="+a);
        }
    }
}

public class OuterInner1
{
	public static void main(String[] args) {
	    Outer out=new Outer();
	    Outer.Inner in=out.new Inner();
		in.display();
	}
}
