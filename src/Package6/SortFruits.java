package Package6;

import java.util.TreeSet;

public class SortFruits {
       public static void main(String[] args) {
    	   Fruits f1 = new Fruits(111, "Mango");
    	   Fruits f2 = new Fruits(114, "apple");
    	   Fruits f3 = new Fruits(112, "Grapes");
    	   Fruits f4 = new Fruits(112, "Apple");

    	   TreeSet<Fruits> t = new TreeSet<Fruits>();
    	   t.add(f1);
    	   t.add(f2); 
    	   t.add(f3);
    	   t.add(f4);
    	   
    	   for(Fruits obj : t) {
    		   System.out.println(obj);
    	   }
       }
}