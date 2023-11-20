/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 */
class Box1{
	double width,height,depth;
	//normal Constructor
	/*Box1(){
	        height=10;
		width=5;
		depth=5;
	}*/
	Box1(double w){
		width=height=depth=w;
	}
	//parameterized Constructor
	Box1(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double calVol(){
		return(width*height*depth);
	}
}

class BoxDemo1{
	public static void main(String args[]){
		double vol1,vol2;
		Box1 box1=new Box1(2,3,5);
		Box1 box2=new Box1(5);
		
		vol1=box1.calVol();
		System.out.println("Volume of Rectangular box is:"+vol1);
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


