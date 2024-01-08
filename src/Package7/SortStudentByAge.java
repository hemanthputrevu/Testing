package Package7;
import java.util.Comparator;
public class SortStudentByAge implements Comparator<Student> {

	public int compare(Student x, Student y) {
		return x.age - y.age;
	}
}
