import java.io.*;
import java.util.*;

public class Solution {
    String title;
    String author;
    int price;
    Solution(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
  public void disp(){
      System.out.println("Title: "+this.title);
      System.out.println("Author: "+this.author);
      System.out.println("Price: "+this.price);
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      int c=sc.nextInt();
      Solution s=new Solution(a,b,c); 
      s.disp(); 
    }
}
