class Hi extends Thread{
    public void run(){
        System.out.println("hii");
    }
}
class Hello extends Thread{
    public void run(){
        System.out.println("hello");
    }
}
public class ThreadGetSetNAme
{
	public static void main(String[] args) {
	    Hi t1=new Hi();
	    Hello t2=new Hello();
	    t1.start();
	    t2.start();
	    String s1=t1.getName();
	    String s2=t2.getName();
		System.out.println("by default t1 name is = "+s1);
		System.out.println("by default t1 name is = "+s2);
		t1.setName("I am thread-1");
		t2.setName("I am thread-last");
		System.out.println("after setting name t1 name is = "+t1.getName());
		System.out.println("after setting name t2 name is = "+t2.getName());
	}
}
