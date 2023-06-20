import java.util.*;
public class MatrixAddition

{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n=sc.nextInt();
	int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		System.out.println("Enter first matrix");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
			System.out.println("first matrix");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		       	System.out.print(a[i][j]+"\t");
		    }
		    	System.out.println();
		}
		
			System.out.println("Enter second matrix");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        b[i][j]=sc.nextInt();
		    }
		}
		System.out.println("second matrix");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		       	System.out.print(b[i][j]+"\t");
		    }
		    	System.out.println();
		}
		System.out.println("resultant matrix");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        c[i][j]=a[i][j]+b[i][j];
		       	System.out.print(c[i][j]+"\t");
		    }
		    	System.out.println();
		}
		
	}
}
