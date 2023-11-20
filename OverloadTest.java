/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class A{
        double n1,n2;
        A(int a,int b){
                n1=a;
                n2=b;
        }
        void Cal(int a){
                System.out.println("Sum of three numbers:"+(n1+n2+a));
        }
}
class B extends A{
        B(int a,int b){
                super(a,b);
        }
         void Cal(double a ){
                System.out.println("Sum of three  numbers:"+(n1+n2+a));
        }
}
class C extends A{
        C(int a,int b){
                super(a,b);
        }
         void Cal(double a){
                System.out.println("Multiplication of three numbers:"+(n1*n2*a));
        }

}
class OverloadTest{
        public static void main(String args[]){
                B b=new B(12,10);
                C c=new C(23,41);
                b.Cal(3.4);
                b.Cal(3);
                c.Cal(5.9);
                c.Cal(5);

        }
}
