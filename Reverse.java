//reverse of num
import java.util.*;
 class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int rem;
         while(n!=0){
             rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         } 
       System.out.println("reverse of number is= "+rev);
    }
}
