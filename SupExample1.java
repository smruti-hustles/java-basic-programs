class A{
  A(){
System.out.println("parent");
}
}
class B extends A{
   B(){
   super();
System.out.print("child");
}
}
class SupExample1{
public static void main(String args[]){
 B obj=new B();
}
}








