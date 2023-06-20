abstract class A{
 abstract void m1();
  void m2(){
      System.out.println("This is concrete method");
}
} 

class B extends A{
 void m1(){
System.out.println(10+20);
}
}
class CAbstractC{
 public static void main(String args[])
{
A obj;
obj=new B();
obj.m1();
obj.m2();
}
}
   

