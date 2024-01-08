package Package5;

import java.util.HashSet;

public class Example {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add(10);
		h.add(20.11);
		h.add(null);
		h.add(20);
		h.add("java");
		h.add("HEMANTH");
		h.add("Hemanth");

		
		for(Object obj : h) {
			System.out.println(obj);
		}
			System.out.println(h);
			
			System.out.println("size: "+h.size());
		
	}
}
