package managementApp;
import java.util.*;			

public class backend {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance=0;
	private static int cost_course=600;
	private static int id=1000;
	
	//Constructor: prompt user to enter student's name and year
	public backend() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
	    firstName=sc.nextLine();
	    
	    System.out.print("Enter Student Last Name: ");
	    lastName=sc.nextLine();
	    
	    System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter Student Class Level: ");
	    gradeYear=sc.nextInt();
	    Studentid();	     
	}	
	//Generate an ID
	private void Studentid() {
		//Grade Level + ID
		id++;
		studentID=gradeYear+""+id;		
	}
	//Enroll in courses
	public void enroll() {
		//get inside a loop,user hits 0
	do {
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")) {
			courses=courses+"\n  "+course;
			tuitionBalance=tuitionBalance+cost_course;
		}else {
			break;
		  }
	   }while(1!=0);
	}
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is:$"+tuitionBalance);		
	}
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter Your Payment: $");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		tuitionBalance=tuitionBalance-p;
		System.out.println("Thank You for your payment of $"+p);
		viewBalance();
	}
	//Show status
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+"\nStudent ID: "+studentID+"\nCourses Enrolled:"+courses+"\nBalance:$ "+tuitionBalance;
	}	
}