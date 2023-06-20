//string builder methods
import java.util.*;
class StringBuilder{
  	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b="Harry";
          String c=" HARRY POTTER";
            System.out.println("Length of a = "+a.length());
            System.out.println("Length of b = "+b.length());
            System.out.println("Length of c = "+c.length());


          String m="Lorry";
            System.out.println(m.replace('L','K'));
 System.out.println(m.replace('b','m'));

          String n="Smryti";
 System.out.println(n.charAt(3));
 System.out.println(n.charAt(0));

 System.out.println("Trimming the starting white space"+c.trim());
 System.out.println(m.toUpperCase());
 System.out.println(c.toLowerCase());

String p="Tony";
String q="tony";
String r="tony";

 System.out.println("comaring p,q= "+p.compareTo(q));
System.out.println("comaring q,p= "+q.compareTo(p));
System.out.println("comaring q,r= "+q.compareTo(r));
System.out.println("comaring q,q= "+q.compareTo(q));


 System.out.println(p.equals(q));
System.out.println(m.equals("lorry"));

 System.out.println(p.equalsIgnoreCase(q));
 System.out.println("b starting with HA= "+b.startsWith("HA"));
 System.out.println("c ends with R= "+c.endsWith("R"));


String x="Java is the best. I love it";
System.out.println("index of first a= "+ x.indexOf("a"));	
System.out.println("index of first be= "+x.indexOf("be"));
System.out.println("index of first t= "+x.indexOf("t",10));
System.out.println("index of first e= "+x.lastIndexOf("e"));	
System.out.println("index of first e= "+x.lastIndexOf("e",2));


/*StringBuilder ma=new StringBuilder("Ram Sita");
System.out.println(ma.setCharAt(3,"a"));	
System.out.println(ma.insert(3,"a"));
System.out.println(ma.detlete(3,5));	
System.out.println(ma.append("a"));	
System.out.println(ma.append(" are the best"));	
*/
String z="Are you redyy!!!";
System.out.println(z.substring(3));	
System.out.println(z.substring(7,10));
System.out.println(z.substring(3,10));

String aaa="Hello";
String bbb=" World";
System.out.println(aaa+bbb);
		
		

		   


		   
	

		   

		   

















	
	}
}
