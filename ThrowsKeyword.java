class Test{
    public static void age(int a,int b)throws ArithmeticException{
      int c=a/b;
      System.out.println(c);
}
}

public class ThrowsKeyword
{
	public static void main(String[] args) {
	    Test obj=new Test();
	    try{
	        obj.age(12,0);
	    }
	    catch(Exception e){
		System.out.println("caught the exception");
		System.out.println(e);
	    }
	}
}
