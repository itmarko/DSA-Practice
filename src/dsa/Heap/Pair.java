package dsa.Heap;

class Pair implements Comparable<Pair> {
	int val;
	int li;
	int di;

	public Pair(int val, int li, int di) {

		this.val = val;
		this.li = li;
		this.di = di;
	}

	public int compareTo(Pair o) {
		return this.val = o.val;
	}
}
