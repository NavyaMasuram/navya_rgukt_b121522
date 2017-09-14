import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		try{
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse("02/09/1996");
		Date date2=new SimpleDateFormat("dd/MM/yyyy").parse("02/09/1998");
		Date date3=new SimpleDateFormat("dd/MM/yyyy").parse("02/09/1997");
		Date date4=new SimpleDateFormat("dd/MM/yyyy").parse("02/07/1998");
		Date date5=new SimpleDateFormat("dd/MM/yyyy").parse("02/04/1996");
		Student[] student=new Student[8];
		student[0]=new Student(3,"navya",date1,98.0);
		student[1]=new Student(2,"divya",date1,99.0);
		student[2]=new Student(1,"kavya",date1,97.0);
		student[3]=new Student(4,"ramya",date1,96.0);
		student[4]=new Student(5,"bhavya",date1,95.0);
	
		StudentGroup sg=new StudentGroup(5);
		System.out.println(sg.getStudents());
		sg.setStudents(student);
		Student[] temp=sg.getStudents();
		System.out.println(temp[0].getFullName());
		System.out.println(sg.getStudent(2).getFullName());
		Student a=new Student( 9,"srav",new SimpleDateFormat("dd/MM/yyyy").parse("01/04/1995"),97.0);
		sg.setStudent(a,2);
		System.out.println(sg.getStudent(2).getFullName());
		Student a1=new Student( 11,"srav1",new SimpleDateFormat("dd/MM/yyyy").parse("02/04/1995"),98.0);
		sg.add(a1,3);
		//void add(Student student, int index);
		System.out.println(sg.getStudent(4).getFullName());
		Student a2=new Student( 10,"srav2",new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1995"),88.0);
		//void addFirst(Student student);
		sg.addFirst(a2);
		
		//void addLast(Student student);
		System.out.println(sg.getStudent(0).getFullName());
		Student a3=new Student( 12,"srav3",new SimpleDateFormat("dd/MM/yyyy").parse("04/04/1995"),88.0);
		//void addFirst(Student student);
		sg.addLast(a2);
		//Student temp1[]=sg.getStudents();
		System.out.println(sg.getStudent(7).getFullName());
	/*	void remove(int index);
		void remove(Student student);
		void removeFromIndex(int index);
			void removeFromElement(Student student);
			void removeToIndex(int index);
			void removeToElement(Student student);
			void bubbleSort();*/
		
		}
		catch(Exception e)
		{
			System.out.println("Error Occured");
		}
	}

}
