class A{
  A(){
System.out.println("hello there");
}
void m(){
System.out.println("Parent");
}
}
class B extends A{
void m2(){
System.out.println("child");
}
   B(){

super.m();
m2();
}
}
class SupExample3{
public static void main(String args[]){
 B obj=new B();
}
}

