package Package6;

  class One implements Comparable<One> {
	int cost;
	
	One(int cost){
		this.cost = cost;
		}
	
	public String toString() {
		return "cost: "+cost;
		}

	public int compareTo(One c) {
		return this.cost -c.cost;
	}
}
