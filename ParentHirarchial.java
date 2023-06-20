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
class C extends A{
    int c=2000;
    void m3(){
        System.out.println("this is grand child class");
    }
}

class ParentHirarchial{
	public static void main(String[] args) {
		
		B ob1=new B();
              //System.out.println("***we are using the class B here");
		System.out.println(ob1.a);
              ob1.m1();
              System.out.println(ob1.b);
		ob1.m2();

             C ob2=new C();
              //System.out.println("***we are using the class C here");
		System.out.println(ob2.a);
              ob2.m1();
              System.out.println(ob2.c);
		ob2.m3();
          
	}
}
