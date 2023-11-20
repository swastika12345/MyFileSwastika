class Shape{
        void draw(){
                System.out.println("Drawing");
        }
}
class Rectangle extends Shape{
        void draw(){
                System.out.println("Drawing Rectangle");
        }
}
class Circle extends Shape{
        void draw(){
                System.out.println("Drawing Circle");
        }
}
class Triangle extends Shape{
        void draw(){
                System.out.println("Drawing Triangle");
        }
}
class RunTimePolymorphism{
        public static void main(String args[]){
                Shape s=new Shape();
                Rectangle r=new Rectangle();
                Circle c=new Circle();
                Triangle t=new Triangle();
                Shape ref;
                ref=s;
                ref.draw();
                ref=r;
                ref.draw();
                ref=c;
                ref.draw();
                ref=t;
                ref.draw();

        }
}