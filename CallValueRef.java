//call by value and call by reference prog 1
class Test{
    int a=1,b=3;
    int sum(int c,int d){
        return c+d;
    }
    void add(int x,int y){
        System.out.println("call by reference = "+(x+y));
    }
}

public class CallValueRef
{
	public static void main(String[] args) {
	    Test o=new Test();
	    int p=o.sum(10,12);
		System.out.println("value of sum method using call by value = "+p);
	o.add(o.a,o.b);
		
	}
}
