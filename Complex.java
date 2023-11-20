/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class Complex {
    int real,imaginary;
    double val;
//    double temp1;
    Complex(){//default constructor
        
    }
    //parameterized constructor to store real and imaginary parts
    Complex(int real1,int imaginary1){
        real=real1;
        imaginary=imaginary1;
    }
     void displayComplex(){
        System.out.println("Complex Number:" +real+"+"+imaginary+"i");
    }
    //Functions for sum,diff,product,mod,comp
    Complex sum(Complex C1,Complex C2){
        Complex temp=new Complex();
        temp.real=C1.real + C2.real;
        temp.imaginary=C1.imaginary +C2.imaginary;
        return temp;
    }
    Complex difference(Complex C1,Complex C2){
        Complex temp=new Complex();
        temp.real=C1.real - C2.real;
        temp.imaginary=C1.imaginary - C2.imaginary;
        return temp;
    }
    Complex product(Complex C1,Complex C2){
        Complex temp=new Complex();
        temp.real=((C1.real * C2.real)-(C1.imaginary * C2.imaginary));
        temp.imaginary=((C1.real * C2.imaginary)+(C1.imaginary * C2.real));
        return temp;
    }
     public void mod(Complex C1){
        
        Complex temp=new Complex();
        temp.real=C1.real * C1.real;
        temp.imaginary=C1.imaginary * C1.imaginary;
        val=Math.sqrt(temp.real+temp.imaginary);
        System.out.println("Modulus of first complex number is:"+val);
    }
      Complex complement(Complex C1){
        Complex temp=new Complex();
        temp.real=C1.real;
        temp.imaginary=C1.imaginary * (-1);
        return temp;
    }
   
}
class ComplexDemo{
    public static void main(String args[]){
        Complex C1=new Complex(3,4);
        C1.displayComplex();
        Complex C2=new Complex(9,5);
        C2.displayComplex();
        Complex temp=new Complex();
        temp=temp.sum(C1, C2);
        System.out.println("Sum of two complex number is:");
        temp.displayComplex();
        temp=temp.difference(C1, C2);
        System.out.println("Difference of two complex number is:");
        temp.displayComplex();
        temp=temp.product(C1, C2);
        System.out.println("Product of two complex number is:");
        temp.displayComplex();
        temp.mod(C1);
        temp=temp.complement(C2);
        System.out.println("Complement of second complex number is:");
        temp.displayComplex();
    }
}
