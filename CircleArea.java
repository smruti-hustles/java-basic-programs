//area of circle
import java.util.*;
public class CircleArea{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     double pi=3.14;
     System.out.print("Enter radius=");
     double r=sc.nextDouble();
     int area;
     area=(int)(pi*r*r);
System.out.println("Area of the circle="+area);
  }
}