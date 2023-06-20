public class MulTryCatch
{
	public static void main(String[] args) {
	    int a=20,b=0,c=40;
	    
	    
	      try{
	          int z=a/b;
	      }
	      catch(ArithmeticException e){
		System.out.println("divide by zero");
	      }
	      
	      try{
	          int p[]=new int[5];
	          p[20]=100;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
		System.out.println("index is too large");
	      }
	}
}
