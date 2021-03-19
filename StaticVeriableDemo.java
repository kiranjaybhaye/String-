class Student{
		int rollno;
		String name;
		static String college="SIT";    // Static Variable
		
		Student(int r,String n){
			rollno = r;
			name = n;
		}
		void display(){
			System.out.println("Student Roll No is = "+rollno+" Student Name is = "+name+" Student college = "+college);
		}
}
public class StaticVeriableDemo{
	public static void main(String[] args){
		Student std = new Student(111,"Ram Sanap");
		Student std1 = new Student(112,"Vishal Ubale");
		
		std.display();
		std1.display();
	}
} 