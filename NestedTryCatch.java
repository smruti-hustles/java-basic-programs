public class NestedTryCatch
{
	public static void main(String[] args) {
	    int a=20,b=0,c=40;
	    
	    
	      try{
	          
	           try{
	          int p[]=new int[5];
	          p[20]=100;
	          
	            }
	            catch(ArrayIndexOutOfBoundsException e){
		           System.out.println("index is too large");
	                 }
	                 int z=18/0;
	      }
	      catch(Exception e){
		System.out.println(e);
	      }
	      
	     
	}
}
