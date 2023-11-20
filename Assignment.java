/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Education;
import java.util.Scanner;
/**
 *
 * @author Swastika Kayal
 */
public class Assignment {
    String assignment_subject;
    int assignment_number,marks_on_assignment;
    public Assignment(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Assignment number: ");
        assignment_number=sc.nextInt();
        System.out.println("Enter Assignment subject: ");
        assignment_subject=sc.nextLine();
        System.out.println("Enter Assignment marks: ");
        marks_on_assignment=sc.nextInt();
    }
    public void display(){
        System.out.println("Assignment number is: "+assignment_number);
        System.out.println("Assignment Subject is: "+assignment_subject);
        System.out.println("Assignment marks is: "+marks_on_assignment);
    }
}
