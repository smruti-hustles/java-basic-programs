class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }
}
class Test{
     public static void checkN(int n)throws InvalidAge{
        if(n<18){
        throw new InvalidAge("age is invalid");
            }
           else{
            System.out.println("welcome to SBI!!! please give your details");
            }
}

}
class UserDefinedException2{
     public static void main(String args[]){
      Test ob=new Test();
try{
ob.checkN(22); 
ob.checkN(12); 
}
catch(Exception e){
 System.out.println(e);
}
    
	}

}
