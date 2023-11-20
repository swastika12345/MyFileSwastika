/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
import javax.swing.*;
public class SwingDemo {
    SwingDemo(){
        JFrame jfrm=new JFrame("A Simple Swing Application");
        jfrm.setSize(500,200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab=new JLabel("HAPPY CHILDRENS' DAY");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
        public static void main(String args[]){
            SwingUtilities.invokeLater(new Runnable(){public void run(){new SwingDemo();}});
        }
}
