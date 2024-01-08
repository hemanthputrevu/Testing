package Package3;

public class Boxing {
  
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		System.out.println(a+" "+b);
		
		char x = 'A';
		Character y = new Character('A');
		System.out.println(x+" "+y);
		
		int i = 5;
		Integer j = new Integer(i);
		System.out.println(i+" "+j);
		
		Integer c = new Integer(50);
		int d=c;
		System.out.println(c+" "+d);
		
		Double obj = new Double(5.2);
		double u = obj;
		System.out.println(obj+" "+u);
		}
}
