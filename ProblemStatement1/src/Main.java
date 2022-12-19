public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Circle circ = new Circle();
        Shape squ = new Square();
        System.out.println("Area of Rectangle: "+rec.calArea(3,4));
        System.out.println("Perimeter of Rectangle: "+rec.calPerimeter(3,4));
        rec.displaydetails();
        System.out.println("Area of Circle: "+circ.calArea(3.0));
        System.out.println("Perimeter of Circle: "+circ.calPerimeter(3.0));
        System.out.println("Area of Square: "+squ.calArea(2));
        System.out.println("Perimeter of Square: "+squ.calPerimeter(2));

    }
}
class Shape{
    int area;
    String color;
    int perimeter;
    String  type;

    int calArea(int a, int b){
        area = a*b;
        return area;
    }
    int calArea(int a){
        area = a*a;
        return area;
    }
    double calArea(double r){
        area = (int) (3.14*r*r);
        return area;
    }

    int calPerimeter(int a, int b){
        perimeter = 2*(a+b);
        return perimeter;
    }
    int calPerimeter(int a){
        perimeter = 4*a;
        return perimeter;
    }
    double calPerimeter(double a){
        perimeter = (int) (2*3.14*a);
        return perimeter;
    }

}
class Rectangle extends Shape{
    int a,b;
    @Override
    int calArea(int a,int b) {
        this.a = a;
        this.b = b;
        return super.calArea(a,b);
    }

    @Override
    int calPerimeter(int a, int b) {
        return super.calPerimeter(a, b);
    }
    void displaydetails(){
        System.out.println("Height of Rectangle: "+a);
        System.out.println("Width of Rectangle: " +b);
    }
}
class Square extends Shape{
    @Override
    int calArea(int a) {
        return super.calArea(a);
    }

    @Override
    int calPerimeter(int a) {
        return super.calPerimeter(a);
    }
}
class Circle extends Shape{
    @Override
    double calArea(double r) {
        return super.calArea(r);
    }

    @Override
    double calPerimeter(double a) {
        return super.calPerimeter(a);
    }
}