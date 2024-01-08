package Package2;

import java.util.ArrayList;
import java.util.Collections;

public class Testing {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(20);
		
		System.out.println("Before sorting");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		Collections.sort(l);
		
		System.out.println("After sorting");
		for(int i=0;i<l.size();i++){
				System.out.println(l.get(i));
		
		}
	}
}

