
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public abstract class DessertItem{

	protected String name;
	public DessertItem () {

	}
	public DessertItem(java.lang.String name) {
		this.name = name;
	}
	public final java.lang.String getName() { 
		return name;
	}
	public abstract int getCost();

}

class DessertShoppe {

	double taxrate;
	String nameOfTheStore;
	int maxSizeOfName = 25;
	//int widthOfItemBill = 40;
	
	public DessertShoppe(double taxrate, String nameOfTheStore ) {
		this.taxrate = taxrate;
		this.nameOfTheStore = nameOfTheStore;
	}

	public String cents2dollarsAndCentsmethod (int n) {
		Double value = n/100.0d;
		return value.toString();
	}
	
}

class Candy extends DessertItem {
	String name;
	public int weight ;
	int priceInCents;
	public Candy (String name, double weight , double price) {
		this.name=name;
		this.weight = (int) (weight * 100 );
		this.priceInCents= (int) (price);
	}

	public int getCost() {
		// Because weight is multiplied by 100 in constructor to save it in int, we have to divide it by 100 here and then round off
		int result = (int )Math.round((weight *priceInCents) / 100d);
		return result;
	}

	//	public String toString() {
	//		String str = weight + " lbs. @ " + price + " /lb." + "\n" + name + "\t\t\t" + getCost();
	//		return str;
	//	}
}

class Cookie extends DessertItem{
	String name;
	int number;
	int pricePerDozen;

	public Cookie(String name, int number, int priceperDozen) {
		this.name = name;
		this.number=number;
		this.pricePerDozen=priceperDozen;
	}
	public int getCost() {
		double priceOfOneCookie = (pricePerDozen/12d);
		int totalPrice = (int) Math.round(number*priceOfOneCookie);
		return (totalPrice);
	}
}
class IceCream extends DessertItem{
	int priceInCents;
	String name;

	public IceCream (String name, int price) {
		this.name =name;
		this.priceInCents= price;
	}

	public int getCost() {
		return priceInCents;
	}
}

class Sundae extends IceCream{
	int toppingPrice;
	String toppingName;

	public Sundae (String name, int price, String toppingName , int toppingPrice) {
		super (name, price);
		this.toppingName=toppingName;
		this.toppingPrice=toppingPrice;
	}

	public int getCost() {
		return  super.getCost() + toppingPrice;
	}
}

class Checkout extends java.lang.Object {

	Vector<DessertItem> listOfDessertItems;
	DessertShoppe ds = new DessertShoppe(6.54 , "M & M Dessert Shoppe ");

	public Checkout() {
		
		listOfDessertItems = new Vector<DessertItem>();
	}

	public int numberOfItems() {
		int s;
		s=listOfDessertItems.size();
		return s;
	}

	public void enterItem(DessertItem item) {
		listOfDessertItems.add(item);
	}

	public void clear() {
		listOfDessertItems.clear();
	}

	public int totalCost() {
		int totalCost =0;
		for (int i=0;i<listOfDessertItems.size();i++) {
			int cost = listOfDessertItems.get(i).getCost();
			totalCost = totalCost+cost;
		}
		return totalCost;
	}

	public int totalTax() {
		return (int)(totalCost() * (ds.taxrate) / 100);
	}

	public String toString(){
		String str = "";
		
		str += "\t" + ds.nameOfTheStore + "\n";
		str += "\t" + "--------------------" + "\n\n";
		
		for (DessertItem dessertItem : listOfDessertItems) {
			
			switch (dessertItem.getClass().getSimpleName()){
			case "Candy":
					Candy candy = (Candy) dessertItem;
					str += candy.weight + " lbs. @ " + candy.priceInCents + " /lb." + "\n" + getItemBillName(candy.name) + "\t" + ds.cents2dollarsAndCentsmethod(candy.getCost())+ "\n";
				break;
			case "IceCream":
					IceCream icecream =(IceCream)dessertItem;
				str +=getItemBillName(icecream.name)+"\t"+ds.cents2dollarsAndCentsmethod(icecream.getCost())+"\n";
				break;
			case "Sundae":
				Sundae sundae = (Sundae)dessertItem;
				str +=getItemBillName(sundae.toppingName + " with")+ "\n"+ getItemBillName(sundae.name) +"\t"+ds.cents2dollarsAndCentsmethod(sundae.getCost())+"\n";
				break;
			case "Cookie":
				Cookie cookie = (Cookie)dessertItem;
				int p = cookie.getCost();
				str += getItemBillName(cookie.number+" @"+cookie.pricePerDozen+" /lb") + "\n" + getItemBillName(cookie.name) + "\t" + ds.cents2dollarsAndCentsmethod(cookie.getCost()) + "\n";
				break;
			}
		}
		str+="\n";
		str+=getItemBillName("Tax ")+"\t"+ds.cents2dollarsAndCentsmethod(totalTax())+"\n"+"\n";
		str+=getItemBillName("Total Cost ")+"\t"+ds.cents2dollarsAndCentsmethod(totalCost()+totalTax())+"\n";
		return str;
	}
	
	public String getItemBillName(String itemName) {
		String value;
		if(itemName.length() > 25) {
			return itemName.substring(0, 25);
		}
		else {
			return String.format("%-25s", itemName);
		}
	}

}

