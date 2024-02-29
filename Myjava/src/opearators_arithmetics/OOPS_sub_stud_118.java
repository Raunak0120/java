package opearators_arithmetics;

class Subject{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObt;
	
	public Subject(String subID, String name, int maxMarks, int marksObt) {
		this.subID=subID;
		this.name=name;
		this.maxMarks=maxMarks;
		this.marksObt=marksObt;
	}
	public String getSubID() {
		return subID;
	}
	public String getName() {
		return name;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public int getMarksObt() {
		return marksObt;
	}
	public void setMaxMarks(int mm) {
		maxMarks=mm;
	}
	public void setMarksObt(int mo) {
		marksObt=mo;
	}
	public boolean isQualified() {
		return marksObt>=(maxMarks/10)*4;
	}
	public String toString() {
		return "\nSubject ID:     "+subID+"\nSubject name:   "+name+"\nMarks Obtained: "+marksObt+"\nMaximum marks:  "+maxMarks;
	}
	class Student{
		private String rollNo;
		private String name;
		private String dept;
		private String subjects;
		
		public Student(String rollNo, String name, String dept, String subjects) {
			this.rollNo=rollNo;
			this.name=name;
			this.dept=dept;
			this.subjects=subjects;
		}
		public String getRollNo() {
			return rollNo;
		}
		public String getName() {
			return name;
		}
		public String getDept() {
			return dept;
		}
		public String getSubjects() {
			return subjects;
		}
		public void setSubjects(String subs) {
			subjects=subs;
		}
		public String toString() {
			return "\nRoll No: "+rollNo+"\nName: "+name+"\nDepartment: "+dept+"\nSubjects: "+subjects;
		}
		
	}
	
}

public class OOPS_sub_stud_118 {

	public static void main(String[] args) {
		Subject subs[]=new Subject[3];
		subs[0]=new Subject("s101", "Maths", 100, 78);
		subs[1]=new Subject("s102", "Physics", 100, 32);
		subs[2]=new Subject("s103", "Chemistry", 100, 62);
		/*for(Subject s:subs) {
			System.out.println(s);
		}
		System.out.println(subs[0].isQualified());
		System.out.println(subs[1].isQualified());
		System.out.println(subs[2].isQualified());*/

		if (subs[0].isQualified()==true) {
			System.out.println("Qualified in "+subs[0]+"\n");
		}
		else {
			System.out.println("Not Qualified in "+subs[0]+"\n");
		}

		if (subs[1].isQualified()==true) {
			System.out.println("Qualified in "+subs[1]+"\n");
		}
		else {
			System.out.println("Not Qualified in "+subs[1]+"\n");
		}

		if (subs[2].isQualified()==true) {
			System.out.println("Qualified in "+subs[2]+"\n");
		}
		else {
			System.out.println("Not Qualified in "+subs[2]+"\n");
		}
	}

}
