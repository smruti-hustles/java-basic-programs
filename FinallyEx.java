public class FinallyEx
{
	public static void main(String[] args) {
		try{
		    int a=10/0;
		}
		catch(Exception e){
		    System.out.println("I don\'t know what kind of error it is so i have not mentioned the type of exception");
		    System.out.println(e);
		}
		finally{
		System.out.println("this is the finally block");
		}
	}
}
