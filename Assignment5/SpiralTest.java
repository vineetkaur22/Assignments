import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SpiralTest extends TestCase{
	private int[][] matrix;

	@Test
	public void test() {
		this.matrix = new int [4][5];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		matrix[0][4] = 5;
		matrix[1][0] = 6;
		matrix[1][1] = 7;
		matrix[1][2] = 8;
		matrix[1][3] = 9;
		matrix[1][4] = 10;
		matrix[2][0] = 11;
		matrix[2][1] = 12;
		matrix[2][2] = 13;
		matrix[2][3] = 14;
		matrix[2][4] = 15;
		matrix[3][0] = 16;
		matrix[3][1] = 17;
		matrix[3][2] = 18;
		matrix[3][3] = 19;
		matrix[3][4] = 20;
		
		Spiral s = new Spiral();
		List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12);
		List<Integer> returnList = s.spiralOrder(this.matrix);
		
		assertArrayEquals("Spiral is not correct",  returnList.toArray(), expectedList.toArray());
	}

}
