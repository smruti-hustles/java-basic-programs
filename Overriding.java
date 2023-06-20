class Parent{
 void m1(){
System.out.println("this is parent method 1");
}
void m2(){
System.out.println("this is parent method 1");
}
void m3(){
System.out.println("this is parent method 1");
}
}

class Child extends Parent{
 void m1(){
System.out.println(10+20);
}
void meao(){
System.out.println("I\'m the child class ");
}
void m3(){
System.out.println("I overrided my parent");
}
}
class Overriding{
 public static void main(String args[])
{
Child obj=new Child();
obj.m1();
obj.m2();
obj.meao();
obj.m3();
}
}
   

