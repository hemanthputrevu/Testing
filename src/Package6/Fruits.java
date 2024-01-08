package Package6;

		public class Fruits implements Comparable<Fruits> {
			int id;
			String name;
			
		
		Fruits(int id, String name){
			this.id = id;
			this.name = name;
			}
		public String toString() {
		return id+" "+name;
		}
		public int compareTo(Fruits f) {
			return this.name.compareTo(f.name);
		}
}