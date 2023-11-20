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
public class Examination {
    String subject;
    double marks;
    public Examination(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject: ");
        subject=sc.nextLine();
        System.out.println("Enter marks: ");
        marks=sc.nextDouble();
    }
    public void display(){
        System.out.println("Examination Subject is: "+subject);
        System.out.println("Examination Marks is: "+marks);
    }
}
