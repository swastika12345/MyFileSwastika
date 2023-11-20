/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class Room{
double length,breadth,height;
//constructor
Room(double l,double b,double h){
length=l;
breadth=b;
height=h;
}
public void Cal_Area(){
double area=2*((length*breadth)+(breadth*height)+(height*length));
System.out.println("Area of Room is:"+area);
}
public void Cal_Area1(){
                double area=2*((length*breadth)+(breadth*height)+(height*length));
                System.out.println("Area of Bedroom is:"+area);
        }
public void Cal_Area2(){
                double area=2*((length*breadth)+(breadth*height)+(height*length));
                System.out.println("Area of Drawingroom is:"+area);
        }

}
class Bedroom extends Room{
Boolean attached_bathroom,study_table,night_lamp;
Bedroom(double l,double b,double h,Boolean ab,Boolean st,Boolean nl){
super(l,b,h);
attached_bathroom=ab;
study_table=st;
night_lamp=nl;
}
public void displayBedroom(){
System.out.println("Bedroom contains Attached Bathroom :"+attached_bathroom);
        System.out.println("Bedroom contains Study Table :"+study_table);
        System.out.println("Bedroom contains Night Lamp :"+night_lamp);

}
}
class Drawingroom extends Room{
Boolean sofa,wall_cabinet;
        Drawingroom(double l,double b,double h,Boolean s,Boolean wc){
        super(l,b,h);
        sofa=s;
        wall_cabinet=wc;
        }
        public void displayDrawingroom(){
        System.out.println("Drawingroom contains Sofa :"+sofa);
        System.out.println("Drawingroom contains Wall cabinet :"+wall_cabinet);
        }

}
public class RoomDemo{
public static void main(String args[]){
Room r1=new Room(2,5,8);
r1.Cal_Area();
Bedroom r2=new Bedroom(3,5,10,false,true,false);
r2.displayBedroom();
r2.Cal_Area1();
Drawingroom r3=new Drawingroom(6,7.3,2.5,true,true);
r3.displayDrawingroom();
r3.Cal_Area2();
}
}
