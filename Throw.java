/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class Throw{
        static void demoProc(){
                try{
                        throw new NullPointerException("Demo");
                }
                catch(NullPointerException e){
                        System.out.println("Caught Inside demoProc");
                        throw e;
                }
        }
        public static void main(String args[]){
                try{
                        demoProc();
                }
                catch(NullPointerException e){
                        System.out.println("Recaught: "+e);
                }
        }
}

