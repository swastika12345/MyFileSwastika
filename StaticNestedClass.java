/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */

//Write a program in Java to create a nested class
class OuterClass{
    static int outer_x=10;
    int outer_y=56;
    private static int outer_private=13;
    static class StaticNested{
        void display(){
            System.out.println("Outer_x :"+outer_x);
            //System.out.println("Outer y :"+outer_y);
            System.out.println("Outer_private :"+outer_private);
            OuterClass outer=new OuterClass();
            System.out.println("Outer_y:"+outer.outer_y);
        }
    }
}
public class StaticNestedClass {
    public static void main(String args[]){
        OuterClass.StaticNested obj=new OuterClass.StaticNested();
        obj.display();
    }
}
