//factorial of given num
import java.util.*;

 class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
         fact*=i;   
        }
        System.out.println("factorial of " + n + " is= " + fact);
    }
}
