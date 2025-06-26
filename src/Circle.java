public class Circle extends Shape{

    int radius;


    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return (3.14 * radius);
    }

    @Override
    double calculatePerimeter(){
        return (2 * 3.14 * radius);

    }

}
