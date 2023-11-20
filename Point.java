/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */

//import java.util.*;
class Point{
	static double x1=3.9,x2=4.0,y1=5.1,y2=7.3;
	static double dis;
	static void distance(){
		System.out.println("First Co-ordinates is:"+x1+","+y1);
		System.out.println("Second Co-ordinates is:"+x2+","+y2);
		dis=Math.sqrt((y2-y1)+(x2-x1));
		System.out.println("Distance between coordinates of a geometrical point is:"+dis);
	}
	public static void main(String args[]){
		distance();
	}
}