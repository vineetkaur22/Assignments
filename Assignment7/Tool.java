public class Tool {
	protected int strength;
	protected  char type;

	void setStrength(int strength) {
		this.strength=strength;
	}
}

class Rock extends Tool{
	public Rock (int strength) {
		super.setStrength(strength);
		super.type = 'r';
	}
	public boolean fight (Tool tool) {
		if (tool.type == 'r') { 
			return this.strength > tool.strength ;
		}
		else if (tool.type == 'p') {  
			return (this.strength /2 > tool.strength);
		}
		else if (tool.type == 's') {  
			return (this.strength *2 > tool.strength);
		}
		else 
			return false;
	}
}
class Paper extends Tool {
	
	public Paper (int strength){
		super.setStrength(strength);
		super.type = 'p';
	}
	public boolean fight (Tool tool) {
		if (tool.type == 'p') {
			return (this.strength>tool.strength);
		}
		else if (tool.type == 'r') {
			return (this.strength *2 >tool.strength);
		}
		else if (tool.type == 's') {
			return (this.strength /2 > tool.strength);
		}
		else return false;
	}
}

class Scissors extends Tool{
	public Scissors(int strength) {
		super.setStrength(strength);
		super.type = 's';
	}
	public boolean fight (Tool tool) {
		if (tool.type == 's'){
			return (this.strength > tool.strength);
		}
		else if (tool.type == 'r') {
			return (this.strength/2 > tool.strength);
		}
		else if(tool.type == 'p') {
			return (this.strength*2 >tool.strength);
		}
		else return false;
	}
}







