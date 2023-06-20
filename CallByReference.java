public class CallByReference
{    int a=50;
     void disp(CallByReference obj){
         obj.a=obj.a+50;
         System.out.println("within this method value of a "+a);
     }
	public static void main(String[] args) {
	    CallByReference o=new CallByReference();
	  
	    System.out.println("before calling value of a "+o.a);
	    o.disp(o);
		System.out.println("after calling value of a "+o.a);
	}
}
