import java.util.Scanner;

public class Question3 {

	public static void main(String[] args){		
		Scanner s = new Scanner (System.in);
		String input = s.nextLine();
		Reverse rs = new Reverse();
		System.out.println("The reversed String is \"" + rs.reverse(input) + "\"");
	}
}

class Reverse {
	
	public String reverse(String  s) {
		
		String[ ] words  = s.trim().split("\\s+");
		// words will contain all the words. Eg, for "the sky is blue"
		// words [0] = "the";
		// words [1] = "sky";
		// words [2] = "is";
		// words [3] = "blue";
		
		String result = "";
		
		for (int i = words.length -1 ; i >=0 ; i--) {
			if( i == words.length -1 ) {
				result = result  + words[i];
			}
			else {
				result = result + " " + words[i];
			}
		}
		return result;
	}

}
