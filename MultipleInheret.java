interface I1{
 abstract void m1();
  abstract void m2();
} 

interface I2{
abstract void m3();
}

class C implements I1,I2{
 public void m1(){
System.out.println("Implementing multiple inheretance");
}
public void m2(){
System.out.println("100");
}
public void m3(){
System.out.println("Hey yahoo!!!");
}
}

class MultipleInheret{
 public static void main(String args[])
{
C obj=new C();
obj.m1();
obj.m2();
obj.m3();
}
}
