/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class Box{
	double width,height,depth;
	void setData(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double calVol(){
		return(width*height*depth);
	}
}

class BoxDemo{
	public static void main(String args[]){
		double vol1,vol2;
		Box box1=new Box();
		Box box2=new Box();
		box1.setData(10,10,12);
		vol1=box1.calVol();
		System.out.println("Volume of Rectangular box is:"+vol1);
		box2.setData(10,10,10);
		vol2=box2.calVol();
		System.out.println("Volume of Cube box is:"+vol2);
		if(vol1>vol2)
			System.out.println("Rectangular box is bigger");
		else if(vol1<vol2)
			System.out.println("Cube is bigger");
		else
			System.out.println("Incorrect input");
		
	}	
}

