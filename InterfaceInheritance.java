/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
interface Subhas{
        void relation();
}
interface Swastika extends Subhas{
        void study();
        void dept();
}
class Demo{
        public void dept(){
                System.out.println("Computer Science Engineering");
        }
        public void study(){
                System.out.println("Study in St. Thomas' College of " +
                        "Engineering and Technology");
        }
        public void relation(){
                System.out.println("Father");
        }
}
class InterfaceInheritance{
        public static void main(String args[]){
                Demo demo=new Demo();
                demo.relation();
                demo.study();
                demo.dept();
                
        }
}