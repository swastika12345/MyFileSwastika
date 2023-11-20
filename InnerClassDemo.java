
/**
 *
 * @author Swastika Kayal
 */
class OuterClass{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    class InnerClass{
        void display(){
            System.out.println("Outer x :"+outer_x);
            System.out.println("Outer y :"+outer_y);
            System.out.println("Outer private :"+outer_private);
        }
    }
}
public class InnerClassDemo {
 public static void main(String args[]){
     OuterClass obj=new OuterClass();
     OuterClass.InnerClass obj1=obj.new InnerClass();
     obj1.display();
 }
}
