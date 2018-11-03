import static org.junit.Assert.*;

import org.junit.Test;

public class MedianSortTest {

	@Test
	public void test() {
		assertEquals("median failed for odd",  3.0d, MedianSort.findMedianSortedArrays(new int[]{ 2, 3 ,4},new int[]{1 , 6}), 0.0d);
		assertEquals("median failed for odd",  3.5d, MedianSort.findMedianSortedArrays(new int[]{ 2, 3 ,4},new int[]{1 , 6, 9}), 0.0d);
	}

}
