package Package3;
import java.util.ArrayList;
import java.util.LinkedList;

public class Generics {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		 l.add("20");
		 l.add("java");
		 l.add("sql");
		 for(String s : l) {
			 System.out.println(s);
		 }
		
		
	LinkedList<Integer> b = new LinkedList<Integer>();
			b.add(10);
			b.add(21);
			b.add(30);
			
			for(Integer i : b) {
				System.out.println(i);
			}
			ArrayList<Double> z = new ArrayList();
			
			z.add(1.22);
			z.add(20.33);
			z.add(3.44);
			
			for(double j : z) {
				System.out.println(j);
			}
}
}