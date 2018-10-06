import java.util.Scanner;
 
 abstract class Moody {
	
	protected abstract String getMood() ;
	protected abstract void expressFeelings();
	public void queryMood() {
		System.out.println("I feel happy(or sad) today!");	
	}
	
	public abstract String toString();
 }
 
 class Sad extends Moody {
	 
	 @Override
	 protected String getMood() {
		 return "Sad";
	 }
	 @Override
	 public void expressFeelings() {
		 System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'"); 
	 }
	 
	 public String toString() {
		 return "Subject cries a lot";
	 }
	 
 }
 
 class  Happy extends Moody{
	 
	 @Override
	 protected String getMood() {
		 return "I feel Happy today !";
	 }
	 @Override
	 public void expressFeelings() {
		 System.out.println("hehehe...hahahah...HAHAHAHAHA");
	 }
	 public String toString() {
		 return "Subject laughs a lot";
	 }
 }
 
 class Psychiatrist {
	 public void examine (Moody moodyobject) {
		 System.out.println(moodyobject.getMood());
	 }
	 
	 public void observe (Moody moodyobject) {
		 moodyobject.expressFeelings();
		 System.out.println("Observation: " + moodyobject.toString());
	 }
	 
	 public void ask() {
		 System.out.println("How are you feeling today?");
	 }
	 
 }


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Psychiatrist psychiatrist = new Psychiatrist ();
		Moody sadperson =new Sad();
		Moody happyperson =new Happy();
		
		psychiatrist.ask();
		psychiatrist.examine(happyperson);
		psychiatrist.observe(happyperson);
		System.out.println();
		psychiatrist.ask();
		psychiatrist.examine(sadperson);
		psychiatrist.observe(sadperson);

		Scanner s = new Scanner (System.in);
		s.nextLine();
		
		}
}
