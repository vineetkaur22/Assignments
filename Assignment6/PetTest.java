
public class PetTest {


	public static void main(String[] args)
	{
		Pet p = new Pet("Snowy", "Muni", "White");
		p.setSex(1);
		System.out.println(p.toString());
		Pet c = new Cat("Tom","Priya","White","long");
		c.setSex(3);
		System.out.println(c.toString());
		Pet d = new Dog("Whisky","Rachel","Black","Medium");
		d.setSex(2);
		System.out.println(d.toString());

	}

}
