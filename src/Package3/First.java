package Package3;

public class First {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		for(int i : a) {
			System.out.println(i);
		}
		double[] percentage = {1.2, 3.4, 5.6};
		for(double z : percentage) {
			System.out.println(z);
		}
		String[] fruits = {"apple, ,mango, grapes"};
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}
