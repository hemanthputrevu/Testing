package Package5;

import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("java");
		lhs.add("python");
		lhs.add("java");
		lhs.add("javascript");
		
		for(String subject : lhs) {
		System.out.println(subject);

	}
}
}