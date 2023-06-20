public class MultiCatch
{
	public static void main(String[] args) {
	   
		try{
		    int b[]=new int[5];
             b[100]=20;
		}
		catch(ArithmeticException e){
		    System.out.println("Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Index is too large");
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
}
