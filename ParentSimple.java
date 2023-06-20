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
class ParentSimple{
	public static void main(String[] args) {
		
		B ob1=new B();
		System.out.println(ob1.a);
              ob1.m1();
		System.out.println(ob1.b);
		
		ob1.m2();
	}
}
