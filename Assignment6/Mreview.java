
import java.util.*;

public class Mreview implements Comparable<Mreview>{
	private String title;
	private ArrayList<Integer> ratings;

	Mreview(){
		this.title = "";
		ratings = new ArrayList<Integer>();
	}

	Mreview(java.lang.String ttl){
		this.title = ttl;
		ratings = new ArrayList<Integer>();
	}

	Mreview(java.lang.String ttl, int firstRating){
		this.title = ttl;
		ratings = new ArrayList<Integer>();
		ratings.add(firstRating);
	}

	void addRating (int r) {
		ratings.add(r);
	}
	
	double aveRating() {
		if(ratings.size() == 0 )
			return 0;

		double sum =0;
		for (int i=0; i<ratings.size(); i++) {
			sum += ratings.get(i);
		}
		return sum/ratings.size();
	}

	@Override
	public int compareTo(Mreview obj) {
		if (this.aveRating() < obj.aveRating())
			return -1;
		else if (this.aveRating() == obj.aveRating())
			return 0;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		// self check
		if (this == obj)
			return true;

		Mreview mrobj;
		if(obj != null && obj.getClass() == this.getClass())
			mrobj = (Mreview)obj;
		else
			return false;

		return  this.title.equals(mrobj.title);

	}

	public String getTitle() {
		return this.title;
	}

	public int numRatings() {
		return ratings.size();
	}

	public String toString() {
		return getTitle()+", " +aveRating()+" out of "+numRatings();
	}

	public static void main(String [] args) {

		Mreview m1= new Mreview("Kill Bill");
		m1.addRating(3);
		m1.addRating(4);
		m1.addRating(5);
		m1.aveRating();
		System.out.println(m1.toString());

	}
}

