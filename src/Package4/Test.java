package Package4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    	Employe e1 = new Employe(01, "john");
    	Employe e2 = new Employe(02, "Smith");
    	Employe e3 = new Employe(03, "allen");

    	ArrayList<Employe> l = new ArrayList<Employe>();
    	
    	l.add(e1);
    	l.add(e2);
    	l.add(e3);
    	
    	for(Employe obj : l) {
    		System.out.println(obj);
    		System.out.println("name: "+obj.name+" Age:");
    	
    	}
    }
}
