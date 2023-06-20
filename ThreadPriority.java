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
public class ThreadPriority
{
	public static void main(String[] args) {
	    Hi t1=new Hi();
	    Hello t2=new Hello();
		System.out.println("by default peiority of t1 is = "+t1.getPriority());
		System.out.println("by default peiority of t2 is = "+t2.getPriority());
		t1.setPriority(8);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("**After Setting Priority**");
		System.out.println("by default peiority of t1 is = "+t1.getPriority());
		System.out.println("by default peiority of t2 is = "+t2.getPriority());
	}
}
