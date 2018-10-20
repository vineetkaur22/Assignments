import java.util.ArrayList;
import java.util.List;

public class Spiral {

	public static void main(String[] args) {
		int[][] a = new int [4][5];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;
		a[0][4] = 5;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		a[1][3] = 9;
		a[1][4] = 10;
		a[2][0] = 11;
		a[2][1] = 12;
		a[2][2] = 13;
		a[2][3] = 14;
		a[2][4] = 15;
		a[3][0] = 16;
		a[3][1] = 17;
		a[3][2] = 18;
		a[3][3] = 19;
		a[3][4] = 20;
//		a[4][0] = 21;
//		a[4][1] = 22;
//		a[4][2] = 23;
//		a[4][3] = 24;
//		a[4][4] = 25;
		printMatrix(a);
		
		Spiral s = new Spiral();
		List<Integer> list ;
		list = s.spiralOrder(a);
		System.out.println(list);
}

public List<Integer> spiralOrder(int[ ][ ] matrix) {
	
	List<Integer> l = new ArrayList<Integer>();
	int n,m; 
	n = matrix.length-1;
	m = matrix[0].length -1;
	
	for (int k=0 ; k< (n+1)/2 && k<(m+1)/2 ; k++) {
		for (int i = k ; i <= m-k-1 ; i++) {
			l.add(matrix[k][i]);
		}
		for(int j=k ; j<= n-k-1 ; j++) {
				l.add(matrix[j][m-k]);
		}		
		for(int i=m-k ; i>=k+1 ; i--) {
				l.add(matrix[n-k][i]);
		}
		for(int j=n-k ; j>=k+1; j--) {
				l.add(matrix[j][k]);
		}		
	}
	
	if(matrix.length%2 != 0) {
		l.add(matrix[(m+1)/2] [(n+1)/2]);
	}
	
	return l ;
}


public static void printMatrix (int[][] matrix) {
	
	for (int i=0;i<matrix.length;i++) {
		
		for (int j=0;j<matrix[0].length;j++) {
			System.out.print(matrix[i][j]+"  ");
			}
		System.out.println();
	}
}

}