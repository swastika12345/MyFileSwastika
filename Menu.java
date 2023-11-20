/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
import Admission.*;
import Education.*;
import java.util.Scanner;

class PackageTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student_details st = null;
		Library li = null;
		Assignment as = null;
		Examination ex = null;
		int ch = 0;
		while(ch!=5){
			System.out.print("\n\n1) Student details\n2) Library details\n3) Assignment details\n4) Examination details\n5) Exit\nEnter Choice : ");
			ch = sc.nextInt();
			//System.out.println("");
			switch(ch){
				case 1:
					if(st == null){
						System.out.println("\nNo student details present\nTaking input for first time\n");
						st = new Student_details();
					}
					st.display();
					break;
				case 2:
					if(li == null){
						System.out.println("\nNo library details present\nTaking input for first time\n");
						li = new Library();
					}
					li.display();
					break;
				case 3:
					if(as == null){
						System.out.println("\nNo assignment details present\nTaking input for first time\n");
						as = new Assignment();
					}
					as.display();
					break;
				case 4:
					if(ex == null){
						System.out.println("\nNo examination details present\nTaking input for first time\n");
						ex = new Examination();
					}
					ex.display();
					break;
				case 5:
					System.out.println("\nExit\n");
					break;
				default:
					System.out.println("\nInvalid Input\n");
			}
		}
	}
}