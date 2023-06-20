//constructor overloading
public class  ConOverloading{
    
        ConOverloading()
        {
            int a=20;
           double b=56.5;
            System.out.println(a+b);
        }
        ConOverloading(String name)
        {
            System.out.println(name);
        }
        ConOverloading(int x,int y,double z)
        {
           double d=x+y+z;
            System.out.println(d);
        }
        public static void main(String args[]){
             ConOverloading a1 = new  ConOverloading();
              ConOverloading a2 = new  ConOverloading("smruti");
               ConOverloading a3 = new  ConOverloading(10,40,67.89);
        }
}