package Package4;

import java.util.Vector;

public class Sum {

public static void main(String[] args) {
	Vector v = new Vector();
	
	v.add(10);
	v.add(1.3);
	v.add("Hemanth");
	for(Object o : v) {
		System.out.println(o);
	}
}
}
