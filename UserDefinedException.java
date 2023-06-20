class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }
}
public class UserDefinedException{
     public static void main(String args[]){
        try{
            throw new InvalidAge("age is invalid");
        }
       	catch(Exception e){
	    System.out.println(e);
	}
    
	}

}
