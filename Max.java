
//max of two numbers
import java.util.*;

public class Max {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter a=");        
int a = sc.nextInt();
System.out.print("enter b=");  
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("Max=" + a);
        } else {
            System.out.print("Max=" + b);
        }
    }

}