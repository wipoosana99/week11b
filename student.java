package week11b;

public class student {
	int id;
	String name,grade,subject;
	public student() {
		super();
		System.out.println("Default Consturctor");
	}
	student(int i,String n,String g){
		id = i;
		name=n;
		grade=g;
	}
	student(int i,String n,String g,String s){
		id=i;
		name=n;
		grade=g;
		subject=s;
	}
	student(student s){
		id = s.id;
		name = s.name;
		grade = s.grade;
		subject = s.subject;
	}
	void display() {
		System.out.println(id + " " + grade + " " + subject);
	}
	public static void main(String[]args) {
		student std1 = new student(390100,"Lisa","A");
		student std2 = new student(390102,"Jane","B");
		student std3 = new student(390103,"Lisa","C","C-Programming");
		student std4 = new student(std1);
		
		std1.display();
		std2.display();
		std3.display();
		std4.display();
	}
}
