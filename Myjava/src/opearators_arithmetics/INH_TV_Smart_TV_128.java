package opearators_arithmetics;

	class tv{
		public void switchOn() {System.out.println("TV is Switched ON");}
		public void changeChannel() {System.out.println("Channel is changed");}
	}
	class smartTv extends tv{
		@Override
		public void switchOn() {System.out.println("Smart TV is Switched ON");}
		@Override
		public void changeChannel() {System.out.println("Smart TV's Channel is Changed");}
		public void browse() {System.out.println("Now Browsing");}
		
		
	}
public class INH_TV_Smart_TV_128 {

	public static void main(String[] args) {
		tv t = new tv();
		t.switchOn();
		t.changeChannel();
		
		System.out.println();
		
		smartTv st = new smartTv();
		st.switchOn();
		st.browse();
		st.changeChannel();
		
		System.out.println();
		
		tv ts = new smartTv(); // this is dynamic dispatch method means we can enter in sub class by these method by creating these type of object
		ts.switchOn();
		ts.changeChannel();
			
		
	
	
	}

}
