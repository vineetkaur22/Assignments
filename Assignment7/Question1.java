import java.util.Scanner;

public class Question1 {
	public static void main (String args[ ]) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9,10};
		int index;

		try {
			System.out.println("Enter the array index");
			index = scanner.nextInt();
			if (index < 0 || index > 9) {
				throw new MyIndexOutOfBoundException(10, 0, index);
			}
			else {
				System.out.println("index is right");
				System.out.println("arr value is " + arr[index]);
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			scanner.close();
		}

	}
}


class MyIndexOutOfBoundException  extends IndexOutOfBoundsException {
	int upperBound ;
	int lowerBound;
	int index;

	MyIndexOutOfBoundException(int upperBound, int lowerBound, int index) {
		this.upperBound = upperBound;
		this.lowerBound = lowerBound;
		this.index = index;
	}

	public String toString() {
		return new String("Error Message: Index: "+ index +", but Lower bound: "+ lowerBound + ", Upper bound: " + upperBound);
	}
}

