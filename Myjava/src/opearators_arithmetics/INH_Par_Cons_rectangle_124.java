package opearators_arithmetics;

class rect{
	int length,breadth;
	rect() {
		length=breadth=1;
	}
	rect(int l, int b){
		length = l;
		breadth = b;
	}
}
class cubiod1 extends rect {
	int height;
	cubiod1(){
		height=1;
	}
	cubiod1(int h){
		height = h;
	}
	cubiod1(int l, int b, int h){
		super(l,b);
		height = h;
	}
	public int volume() {
		return length*breadth*height;
	}
}

public class INH_Par_Cons_rectangle_124 {

	public static void main(String[] args) {
		
		//cubiod1 c = new cubiod1();// her volume will be 1 as i do not give any parameter
		//cubiod1 c = new cubiod1(10);//here volume will be 10 as i give only value of height 
		cubiod1 c = new cubiod1(5, 3, 10);// here i give all he parameters so volume will be 150
		System.out.println("volume is: "+c.volume());

	}

}
