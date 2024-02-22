package opearators_arithmetics;

class student{
	public int rollno;
	public String name;
	public String course;
	public double m1, m2, m3;
	
	public double total() {
		return m1+m2+m3;
	}
	public double average() {
		return total()/3;
	}
	public  char  grade() {
		if (average()>=60) 
			return 'A';
		else
			return 'B';
		
		
	}
}

public class OOPS_Class_student_110 {

	public static void main(String[] args) {
		student s = new student();
		s.rollno = 25;
		s.name = "Rudra";
		s.course = "Science";
		s.m1 = 68;
		s.m3 = 72;
		s.m2 = 89;
		
		System.out.printf("Percentage is: "+s.average()+"%");
		System.out.println("Your grade is: "+s.grade());
		

	}

}
