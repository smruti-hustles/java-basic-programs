public class CallByValue
{
    int a=50;
    void disp(int a){
      a=a+50;
      System.out.println("within this method value of a "+a);
    }
	public static void main(String[] args) {
	    CallByValue o=new CallByValue();
	System.out.println("before calling value of a "+o.a);
	    o.disp(100);
	System.out.println("after calling value of a "+o.a);
	}
}
