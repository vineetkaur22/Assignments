import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Interval {
	int start ;
	int end ;
	Interval(int s , int e){
		start = s;
		end = e;
	}
	
	public String toString() {
		return "Interval with start time: " + start + " and end time: " + end;
	}
}

class IntervalSolution{

	List<Interval> Intervals;

	public boolean isOverlap(Interval interval1, Interval interval2) {
		if (interval1.start < interval2.start && interval1.end >interval2.start) {
			return true;
		}
		else if (interval1.start>interval2.start && interval1.start < interval2.end) {
			return true ;
		}
		else return false;
	}

	public Interval giveOverlapInterval(Interval interval1, Interval interval2) {
		int start = (interval1.start < interval2.start) ? interval1.start : interval2.start;
		int end =  (interval1.end > interval2.end) ? interval1.end : interval2.end;
		return new Interval (start, end);
	}

	public List<Interval> merge(List<Interval> Intervals) {
		List<Interval> listToReturn = new ArrayList<>();
		Set<Interval> mergedSet = new HashSet<>();
		for (Interval int1 : Intervals) {
			if (!mergedSet.contains(int1)) {
				Interval temp = int1;
				mergedSet.add(int1);

				for(Interval int2: Intervals) {
					if (!mergedSet.contains(int2)) {
						if(isOverlap(temp, int2)) {
							temp = giveOverlapInterval(temp, int2);
							mergedSet.add(int2);
						}
					}
				}

				listToReturn.add(temp);
			}		
		}
		return listToReturn;
	}

}



