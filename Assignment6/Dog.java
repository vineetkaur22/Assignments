
public class Dog extends Pet implements Boardable{
	private String size ;
	int startMonth;
	int startDay;
	int startYear;
	int endMonth;
	int endDay;
	int endYear;
	
	Dog (String name, String ownerName, String color, String size){
		super(name,ownerName,color);
		this.size = size ;
	}
	
	boolean checkMonth (int month){
		if (!(month >= 1 && month<= 12) ) {
			System.out.println("Month is not correct !");
			return false;
		}
		return true;
	}
	
	boolean checkDay (int day) {
		if (!(day >=1 && day <=31) ) {
			System.out.println("Day is not correct !");
			return false;
		}
		return true;
	}
	
	boolean checkYear(int year) {		
		if (!(year >= 999 && year <= 9999) ) {
			System.out.println("Year is not correct !");
			return false;
		}
		return true;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		if(!checkYear(month) || !checkYear(day) || !checkYear(year))
			return;	
		
		this.startMonth = month;
		this.startDay = day;
		this.startYear=year;
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		if(!checkYear(month) || !checkYear(day) || !checkYear(year))
			return;	
		
		this.endMonth = month;
		this.endDay= day;
		this.endYear=year;		
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		if(!checkYear(month) || !checkYear(day) || !checkYear(year))
			return false;
		
		if((startMonth<=month && month <=endMonth) && (startDay<=day && day>=endDay) &&
				(startYear<=year && year<=endYear))
			return true;
		else			
			return false;
	}

	String getSize() {
		return size;
	}

	public String toString() {
		return "DOG: " +"\n"+getPetName()+ " owned by "+getOwnerName() +"\n"+
				"Color : " +getColor()+"\n"+"Sex :  "+getSex()+"\n"+"Size : "+getSize(); 
	}



}
