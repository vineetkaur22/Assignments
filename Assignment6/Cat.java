
class Cat extends Pet  implements Boardable{
	private String hairLength;
	int startMonth;
	int startDay;
	int startYear;
	int endMonth;
	int endDay;
	int endYear;


	public Cat (String name, String ownerName, String color, String hairLength) {
		super(name,ownerName,color);
		this.hairLength=hairLength; 
	}

	String getHairLength() {
		return hairLength;
	}

	public String toString() {
		return "CAT : " + "\n"+getPetName()+ " owned by "+getOwnerName() +"\n"
				+"Color : " +getColor()+"\n"+"Sex : "+getSex()+"\n"+"Hairlength : "+getHairLength(); 
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

}
