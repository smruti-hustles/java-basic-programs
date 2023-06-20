interface I{
 abstract void m1();
  abstract void m2();
} 

class B implements I{
 public void m1(){
System.out.println(10+20);
}
public void m2(){
System.out.println("100");
}
}
class ExInterface{
 public static void main(String args[])
{
I obj;
obj=new B();
obj.m1();
obj.m2();
}
}
