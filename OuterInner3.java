//outer and inner classes
class OuterInner3{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  OuterInner3.Inner obj=new OuterInner3.Inner();  
  obj.msg();  
  }  
}  