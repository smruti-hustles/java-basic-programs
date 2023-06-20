//max and min elements in the array
import java.util.*;
public class ArrayMaxMin
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int max=a[0];
	    int min=a[n-1];
	    for(int i=0;i<n;i++){
	        if(a[i]>max){
	            max=a[i];
	        }
	        else if(a[i]<min){
	            min=a[i];
	        }
	    }
		System.out.println("max ele in the array is "+max);
		System.out.println("min ele in the array is "+min);
	}
}
