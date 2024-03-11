package opearators_arithmetics;

	class car{
		public void start() {
			System.out.println("Car is Started");
		}
		public void accelerate() {
			System.out.println("Car is Acclerated");
		}
		public void changeGear() {
			System.out.println("Gear is Changed");
		}
	}
	class luxaryCar extends car{
		
		public void changeGear() {
			System.out.println("Automatic Gear");
		}
		public void openRoof() {
			System.out.println("Sun Roof is Opened");
		}
	}

public class INH_Car_Luxary_Car_129 {

	public static void main(String[] args) {
		car c = new car();
		c.start();
		c.accelerate();
		c.changeGear();
		
		System.out.print("\n");
		
		luxaryCar lc =new luxaryCar();
		lc.changeGear();
		lc.openRoof();
		
		System.out.print("\n");
		
		car cl = new luxaryCar();
		cl.accelerate();
		cl.start();
		cl.changeGear();
		
		
		

	}

}
