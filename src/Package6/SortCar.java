package Package6;

import java.util.TreeSet;

 class SortCar {
      public static void main(String[] args) {
    	  One c1 = new One(200);
    	  One c2 = new One(400);
    	  One c3 = new One(500);
    	  One c4 = new One(300);
    	  One c5 = new One(100);

    	  TreeSet<One> t = new TreeSet();
    	  
    	  t.add(c1);
    	  t.add(c2);
    	  t.add(c3);
    	  t.add(c4);
    	  t.add(c5);
    	  
    	  for(One c : t) {
    		  System.out.println(c);
    	  }
    	  
      }
}
