public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String f=sc.next();
    String l=sc.next();
    int id=sc.nextInt();
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Name: "+l+", "+f);
    System.out.println("ID: "+id);
    int total=0;
    for(int i=0;i<n;i++){
        total=total+arr[i];
    }
    int avg=total/n;
    int g;
    if(avg>=90 && avg<=100){
        System.out.print("Grade: O");
    }
    else if(avg>=80 && avg<=90){
        System.out.print("Grade: E");
    }
    else if(avg>=70 && avg<=80){
        System.out.print("Grade: A");
    }
    else if(avg>=55 && avg<=70){
        System.out.print("Grade: P");
    }
    else if(avg>=40 && avg<=55){
        System.out.print("Grade: D");
    }
    else if(avg<40){
       System.out.print("Grade: T");
     
    }
    
    }
}
