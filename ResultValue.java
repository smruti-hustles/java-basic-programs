//call by value call by reference
class Callby{
  int a=10;
  int b=20;
  int sum(int c,int d){
    int e=c+d;
System.out.println("***call by value***");
    return e;
    }
  void add(int f,int g){
    System.out.println("***call by reference***");
    System.out.println(f+g);
   }
}

class ResultValue{
  public static void main(String args[]){
       Callby o1=new Callby();
       int ans=o1.sum(100,200);
System.out.println(ans);
o1.add(o1.a,o1.b);

}
}

