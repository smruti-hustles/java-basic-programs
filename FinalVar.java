/*
//final keyword with variables
class FinalVar{
 final int a=50;
  void m(){
   a=100;
System.out.println(a);
}
public static void main(String args[]){
 FinalVar obj=new FinalVar();
obj.m();
}
}
*/

/*
//final keyword with methods
class A{
 final void m(){
System.out.println("hello there");
}
}
class B extends A{
void m(){
System.out.print("whatsapp");
}
}
class FinalVar{
public static void main(String args[]){
 B obj=new B();
obj.m();
}
}
*/

//final keyword with class
final class A{
  void m(){
System.out.println("hello there");
}
}
class B extends A{
void m(){
System.out.print("whatsapp");
}
}
class FinalVar{
public static void main(String args[]){
 B obj=new B();
obj.m();
}
}









