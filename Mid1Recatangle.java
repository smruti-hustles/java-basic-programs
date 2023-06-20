class hello{
    int length;
    int breadth;

    public hello()
    {
        int length = 0;
        int breadth = 0;

    }

    public hello(int n)
    {
        length = n;
         breadth = n;

    }
    public hello(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void  m1()
    {
        System.out.println(length*breadth + "\n");
    }
}
class Mid1Recatangle{
    public static void main(String[] args) {
        hello obj = new hello();
        obj.m1();
        hello obj1= new hello(10);
        obj1.m1();
        hello obj2 = new hello(12,2);
        obj2.m1();


    }
}