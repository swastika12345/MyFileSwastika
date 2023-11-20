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
public class Library {
    String book_name,issue_date,return_date;
    public Library(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book_name: ");
        book_name=sc.nextLine();
        System.out.println("Enter Issue date: ");
        issue_date=sc.nextLine();
        System.out.println("Enter Return_date: ");
        return_date=sc.nextLine();
    }
    public void display(){
        System.out.println("Book Name is: "+book_name);
        System.out.println("Book's Issue date is: "+issue_date);
        System.out.println("Book's Return date is: "+return_date);
    }
}
