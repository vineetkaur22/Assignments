
import java.util.HashMap;
import java.util.Map;

public class Pet {

		private String name;
		private String ownerName;
		private String color;
		protected int sexID;
		public static final int MALE = 1;
		public static final int FEMALE = 2;
		public static final int SPAYED = 3;
		public static final int NEUTERED = 4;
		
		private static final Map<Integer, String> sexMap = new HashMap<>();
		
		static {
			sexMap.put(MALE, "Male");
			sexMap.put(FEMALE, "Female");
			sexMap.put(NEUTERED, "Neutered");
			sexMap.put(SPAYED, "Spayed");
		}
		
		public Pet (String name, String ownerName, String color) {
			this.name = name;
			this.ownerName = ownerName;
			this.color = color;
		}
		
		String getPetName() {
			return this.name;
		}
		String getOwnerName() {
			return ownerName;
		}
		String getColor() {
			return color;
		}
		void setSex(int sexID) {
			this.sexID=sexID;
		}
		
		String getSex() {
			return sexMap.get(sexID);
		}
		public String toString () {
			return getPetName() + " owned by "+ getOwnerName()+"\n"+
					"Color : " + getColor() +"\n"+"Sex : "+ getSex();
		}
		
}
		
	


