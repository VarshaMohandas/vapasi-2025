public class Triangle extends Shape{

    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea(){
        return (side1 * side2 * side3);
    }
    @Override
    double calculatePerimeter(){
        return (side1 + side2 + side3);
    }
}
