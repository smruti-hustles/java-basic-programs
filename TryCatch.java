 class TryCatch
{
	public static void main(String[] args) {
		try{
		    int a=10/0;
		}
		catch(ArithmeticException e){
		    System.out.println("Divide by zero error");
		}
		System.out.println("program is finished");
	}
}
