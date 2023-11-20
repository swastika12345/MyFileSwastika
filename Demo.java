class TwoDFigure{
        double dim1,dim2;
        TwoDFigure(double a,double b){
                dim1=a;
                dim2=b;
        }
        double Calc_Area(){
                System.out.println("Area of the figure is undefined");
                return 0;
        }
}
class Rectangle extends TwoDFigure{
        Rectangle(double a,double b){
                super(a,b);
        }
        double Calc_Area(){
                return dim1*dim2;
        }
}
class Triangle extends TwoDFigure{
        Triangle(double a,double b){
                super(a,b);
        }
        double Calc_Area(){
                return (dim1*dim2)/2;
        }

}
class Demo{
        public static void main(String args[]){
                TwoDFigure f=new TwoDFigure(1,2);
                Rectangle r=new Rectangle(5.1,6.3);
                Triangle t=new Triangle(3.0,5.0);
                TwoDFigure fig;
                fig=f;
                fig.Calc_Area();
                fig=r;
                System.out.println("Area of Rectangle is:"+fig.Calc_Area());
                //fig.Calc_Area();
                fig=t;
                System.out.println("Area of Triangle is:"+fig.Calc_Area());
                //fig.Calc_Area();
        }
}




