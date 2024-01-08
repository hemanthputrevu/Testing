package Package5;

public class Demo4 {

	public static void main(String[] args) {
		String a = "A";
		String b = "B";
				
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(b.compareTo(b));
		System.out.println("=======");
		
		Integer x = 10;
		Integer y = 20;
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		System.out.println(x.compareTo(x));
		System.out.println("=======");

		Double i = 2.4;
		Double j = 3.5;
		
		System.out.println(i.compareTo(j));
		System.out.println(i.compareTo(i));
		System.out.println(j.compareTo(i));
		System.out.println("=======");
		}
}
