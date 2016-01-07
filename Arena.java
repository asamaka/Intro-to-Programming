
public class Arena {
	
	Robot monte;
	Robot krippler;

	void setup(){
		monte = new Robot();
		krippler = new Robot();
	}
	
	void startFight() {
		monte.move(10);
		krippler.move(10);
		monte.attack();
		monte.move(10);
		monte.attack();
		krippler.move(10);
		krippler.attack();
		monte.moveBack(20);
	}
	
	public static void main(String[] args) {
		Arena streetFight = new Arena();
		streetFight.setup();
		streetFight.startFight();
	}

}
