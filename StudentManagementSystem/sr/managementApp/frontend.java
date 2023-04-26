package managementApp;
import java.util.*;

//Student Management System
public class frontend {
	public static void main(String[]args) {		
		
		//Ask How many new users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		backend[] std=new backend[n-1];
		
		//Create n number of new students
		for(int i=0;i<n;i++) {
			std[i]=new backend();
			std[i].enroll();		
			std[i].payTuition();
			System.out.println(std[i].showInfo());				
		}		
	}
}
