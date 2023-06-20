//class and object
import java.util.*;
public class Object{
    int a=10;
    int b=20;
    int c;
    int d;
    float x;
    
    void display(){
        System.out.println("sum of a and b="+(a+b));
        System.out.println("sum of c and d="+(c+d));
        System.out.println("value of x ="+x);
    }
    
    public static void main(String args[]){
        Object obj=new Object();
        obj.c=100;
        obj.d=200;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x value=");
        obj.x=sc.nextFloat();
        obj.display(); 
    }
}
