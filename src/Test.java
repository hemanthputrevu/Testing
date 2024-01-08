import java.util.ArrayList;

public class Test {
   
	public static void main(String[] args) {
	
	 ArrayList l = new ArrayList();
	 
	 l.add(10);
	 l.add(20.34);
	 l.add(10);
	 l.add(null);
	 l.add("java");
	 
	 System.out.println(l);
	 
	 System.out.println(l.size());
	 System.out.println(l.get(2));
	 System.out.println(l.contains("java"));
	 System.out.println(l.contains("Java"));
	 System.out.println(l);
	 l.remove(2);
	 System.out.println(l);
	 System.out.println(l.isEmpty());
       l.clear();
  	 System.out.println(l.isEmpty());
  	 ArrayList x = new ArrayList();
  	 
  	x.add(20);
	x.add(10);
	x.add(30);
	x.add(10);
	x.add(30);
	x.add(10);
	x.add(60);
	
	System.out.println(x);
	
	System.out.println(x.indexOf(30));
	System.out.println(x.indexOf(10));
	System.out.println(x.indexOf(100));
  	 
	System.out.println(x.lastIndexOf(10));



}
}
