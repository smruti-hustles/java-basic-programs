class A{
int a=100;
  A(){
System.out.println("hello there");
}
}
class B extends A{
int b=500;
   B(){
System.out.println(super.a);   
System.out.println(b);
}
}
class SupExample2{
public static void main(String args[]){
 B obj=new B();
}
}

