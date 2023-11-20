/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class A{
        public interface NestedIface{
                boolean isNotNegative(int x);
        }
}
class B implements A.NestedIface{
        public boolean isNotNegative(int x){
                return x<0 ? false:true;
        }
}
class NestedInterface{
        public static void main(String args[]){
                A.NestedIface nif=new B();
                if(nif.isNotNegative(13))
                        System.out.println("13 is not negative");
                if(nif.isNotNegative(-20))
                        System.out.println("Won't be printed");
        }
}