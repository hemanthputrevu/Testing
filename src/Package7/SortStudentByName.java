package Package7;
import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

	public int compare(Student x, Student y) {
		return x.name.compareTo(y.name);
	}
}
