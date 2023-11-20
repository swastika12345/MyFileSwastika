/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
interface A{
        void meth1();
        void meth2();
        void meth3();
}
class MyClass implements A{
        public void meth1(){
                System.out.println("Welcome to Java program");
        }
        public void meth2(){
                System.out.println("Welcome to OS world");
        }
          public void meth3(){
                System.out.println("Welcome to Software Engineering");
        }

}
class Interface{
        public static void main(String args[]){
        MyClass ob=new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        }
}
/*Fault class become abstract
interface A{
        void meth1();
        void meth2();
        void meth3();
}
class MyClass implements A{
        public void meth1(){
        System.out.println("Inside Java");
}
}
class Interface{
        public static void main(String args[]){
        MyClass ob=new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        }
}*/