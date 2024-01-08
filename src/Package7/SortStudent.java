package Package7;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Student s1 = new Student(22, "C");
		Student s2 = new Student(23, "A");
		Student s3 = new Student(21, "B");
		
		SortStudentByAge age = new SortStudentByAge();
		SortStudentByName name = new SortStudentByName();
		
		TreeSet<Student> t = new TreeSet<Student>(name);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s : t) {
			System.out.println(s);
		}
    }
}
