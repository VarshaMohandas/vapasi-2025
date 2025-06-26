public class Rectangle extends Shape{

    int length;
    int width;

    Rectangle(int length, int width){
        if(length)
    }
    @Override
    double calculateArea(){
        return (length * width);
    }

    @Override
    double calculatePerimeter(){
        return ((length + width) * 2);
    }

    void setDimensions(int length, int width){
        this.length = length;
        this.width = width;
    }

    void setDimensions(int value){
        System.out.println("Square");
        this.length = value;
        this.width = value;
    }
}
