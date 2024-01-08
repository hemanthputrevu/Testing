package Package5;
import java.util.TreeSet;
public class Demo3 {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		
		t.add("Banana");
		t.add("Cat");
		t.add("Apple");

		System.out.println(t);

		for(String s : t) {
			System.out.println(s);
		}
	}
}
