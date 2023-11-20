/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
//class Learn{
//         public void learn(){
  //              System.out.println("Learn Java programming");
    //    }

//}
//class Write{
  //        public void write(){
    //            System.out.println("Write Java Assignment-7");
      //  }
//}

//class Java extends Learn ,Write{
//      public void learn(){
//              System.out.println("Learn Java programming");
//      }
  //      public void write(){
    //            System.out.println("Write Java Assignment-7");
      //  }
//}
//class multipleInheritance{
  //      public static void main(String args[]){
    //            Java java=new Java();
      //          java.learn();
        //        java.write();
       // }
//}
class Learn{
         public void learn(){
                System.out.println("Learn Java programming");
        }

}
interface Write{
        void write();
}
class Java extends Learn implements Write{
//      public void learn(){
//              System.out.println("Learn Java programming");
//      }
        public void write(){
                System.out.println("Write Java Assignment-7");
        }
}
class multipleInheritance{
        public static void main(String args[]){
                Java java=new Java();
                java.learn();
                java.write();
        }
}

