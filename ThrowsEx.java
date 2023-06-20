public class ThrowsEx
{
    public static void div(int a,int b) throws ArithmeticException
    {
        int c=a/b;
        System.out.println("The value of c is "+c);
    }



	public static void main(String[] args) {
	    ThrowsEx ob=new ThrowsEx();
	    try{
	       
	        ob.div(10,5);
	    ob.div(20,0);
	}
	catch(Exception e){
	    System.out.println(e);
	}
}
}
