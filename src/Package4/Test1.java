package Package4;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student(11, "raju");
		Student s2 = new Student(12, "ram");
		Student s3 = new Student(13, "rakesh");
		
		ArrayList<Student> l = new ArrayList<Student>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		for(Student std: l) {
			System.out.println(std);
		}
			
	}
}
