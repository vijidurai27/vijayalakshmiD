package hello.java;
import java.util.*;

public class Student{
	StringBuffer name;
	int rollno;
	StringBuffer schoolName;
	public Student(StringBuffer sName,int sId,StringBuffer schlName) {
	name = sName;
	rollno = sId;
	schoolName = schlName;
		
	}
	
	public static void main(StringBuffer[] args) {
		Scanner obj = new Scanner(System.in);
		StringBuffer stdName = obj.nextLine();
		int id = obj.nextInt();
		StringBuffer sclName = obj.nextLine();
		Student student1 = new Student (stdName,id,sclName);
		Student student2 = new Student ("hari",123,"mssd");
		Student student3 = new Student ("thanu",124,"mssd");
		System.out.println(student1.name + student1.rollno + student1.schoolName);
		
		}


        //star pattern
	System.out.println("* * * * * *    * ");
	System.out.println("* * * * *    * * * ");
	System.out.println("* * * *    * * * * * ");
	System.out.println("* * *    * * * * * * * ");
	System.out.println("* *    * * * * * * * * * ");
	System.out.println("*    * * * * * * * * * * * ");


}