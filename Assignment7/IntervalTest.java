import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IntervalTest {

	@Test
	public void mergeTest1() {
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,4);
		Interval i3 = new Interval(5,7);
		Interval i4 = new Interval(6,8);
		List<Interval> inputIntervals = new ArrayList<>();
		inputIntervals.add(i1);
		inputIntervals.add(i2);
		inputIntervals.add(i3);
		inputIntervals.add(i4);
		
		List<Interval> expectedOutputIntervals = new ArrayList<>();
		Interval i10 = new Interval(1,4);
		Interval i11 = new Interval(5,8);
		expectedOutputIntervals.add(i10);
		expectedOutputIntervals.add(i11);
		
		IntervalSolution solution = new IntervalSolution();
		List<Interval> actualOutputIntervals = solution.merge(inputIntervals);
		for(Interval i : actualOutputIntervals) {
			System.out.println(i);
		}
		
		assertEquals("No. of intervals returned are incorrect", expectedOutputIntervals.size(), actualOutputIntervals.size());
		for(int i=0; i < expectedOutputIntervals.size() ; i ++) {
			Interval expected = expectedOutputIntervals.get(i);
			Interval actual = actualOutputIntervals.get(i);
			assertEquals("Intervals do not match start", expected.start, actual.start);
			assertEquals("Intervals do not match end", expected.end, actual.end);
		}
	}

}
