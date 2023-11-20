/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
    //Inheritance Test
class A{
	int i,j;
	void show_ij(){
		System.out.println("i and j :"+i+","+j);
	}
}
class B extends A{
	int k;
	void show_k(){
		System.out.println("k is:"+k);
	}
	void sum(){
		System.out.println("i+j+k is:"+(i+j+k));
	}
}
class Inheritance{
	public static void main(String args[]){
		A superOb=new A();
		B subOb=new B();
		superOb.i=10;
		superOb.j=20;
		superOb.show_ij();
		subOb.i=5;
		subOb.j=6;
		subOb.k=7;
		subOb.show_ij();
		subOb.show_k();
		System.out.println("Sum of subOb variables:");
		subOb.sum();
	}
}
