/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Admission;
import java.util.Scanner;
/**
 *
 * @author Swastika Kayal
 */
public class Student_details {
    String student_name,department,DOB;
    public Student_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        student_name=sc.nextLine();
        System.out.println("Enter Department: ");
        department=sc.nextLine();
        System.out.println("Enter Date of Birth: ");
        DOB=sc.nextLine();
    }
    public void display(){
        System.out.println("Student name is: "+student_name);
        System.out.println("Student's department is: "+department);
        System.out.println("Student's Date of Birth is: "+DOB);
    }
}
