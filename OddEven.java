//sum odd and even natural numbers
import java.util.*;
 class OddEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
          
        for(int i=1;i<=n;i++){
            if(i%2==0){
         even=even+i;
            }
         else{
             odd=odd+i;
         }
        }
        System.out.println("sum of even natural numbers= " + even);
                System.out.println("sum of odd natural numbers= " + odd);
    }
}
