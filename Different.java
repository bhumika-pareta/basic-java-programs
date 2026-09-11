//inheritance question 2 

class Shape {
    String color;
    String shape;

    public void area(){
        System.out.println("This program displays area of different shapes");
    }

    public void showColor(){
        System.out.println("color of the shape is "+ this.color);
    }

    public void showShape(){
        System.out.println("this shape is :"+ " "+ this.shape);
    }
}
class Triangle extends Shape {

    int l ;
    int h ;
    public void area(int l, int h) {
        System.out.println("area of triangle is"+" "+(1.0/2)*l*h);
    }

}

class Equilateral extends Triangle {



    public void area2(int l , int h){
        
         System.out.println("area of triangle is"+" "+(1.0/2)*l*h);
    }
}

class Circle extends Shape{
    public void area3(int r) {
        System.out.println("Area of circle  is :"+ " "+(3.14)*r*r);
    }
}
public class Different {
    public static void main (String [] args){
    Triangle t1 = new Triangle();
    t1.color = "red";
    t1.shape =" Triangle";

    Equilateral e1 = new  Equilateral();
    e1.color = "yellow";
e1.shape ="Equilateral triangle";

    Circle c1 = new Circle();
    c1.color ="green";
c1.shape= "Circle";

    t1.area();
     t1.showColor();
    t1.showShape();

    e1.area2(2,3);
    e1.showColor();
    e1.showShape();

    c1.area3(2);
    c1.showColor();
    c1.showShape();

}
}