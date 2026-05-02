package module3;

public class student {
	//static variable total students-shared info
	private static int totalstudents=0;
	//instance variables:
	private String name;
	private int age;
	public student(String n,int a) {
		this.name=n;
		this.age=a;
		totalstudents++;
	}
	public void displaydetails() {
		System.out.println("name:"+name+"age "+age);
	}
	//static method
	public static void showstudent() {
		System.out.println("total:"+totalstudents);
	}
	//static members-class not object
}
