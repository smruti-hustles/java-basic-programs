//simple calculator using switch case
import java.util.*;
public class Calculator{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
      int b=sc.nextInt();
     System.out.print("Enter choice(+,-,*,/,%)=");
      char ch=sc.next().charAt(0);
     switch(ch){
      case '+':System.out.println("sum of a,b="+(a+b)); 
              break;
     case '-':System.out.println("difference between a,b="+(a-b)); 
              break;
     case '*':System.out.println("product of a,b="+(a*b)); 
              break;
    case '/':System.out.println("quotient when b divides a="+(a/b)); 
              break;
    case '%':System.out.println("reminder="+(a%b)); 
              break;
    default:System.out.println("Invalid choice"); 
              break;
     }
  } 
} 