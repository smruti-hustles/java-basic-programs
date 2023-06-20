
//increment/decrement
import java.util.*;

class Unary {
  public static void main(String args[]) {

    int a = 5;
    int b;
    int c;
    b = a++;
    c = ++a;

    int x = 12;
    int y;
    y = --x;
    int z;
    z = y--;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    System.out.println("z=" + z);
  }
}