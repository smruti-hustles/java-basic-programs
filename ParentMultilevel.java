class A
{   
    int a=50;
    void m1(){
        System.out.println("this is parent class");
    }
}
class B extends A{
    int b=100;
    void m2(){
        System.out.println("this is child class");
    }
}    
class C extends B{
    int c=2000;
    void m3(){
        System.out.println("this is grand child class");
    }
}    

class ParentMultilevel{
	public static void main(String[] args) {
		
		C ob1=new C();
		System.out.println(ob1.a);
              ob1.m1();
		System.out.println(ob1.b);
	       ob1.m2();
              System.out.println(ob1.c);
		ob1.m3();
	}
}
