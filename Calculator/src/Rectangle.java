public class Rectangle extends Shape {

    int length;
    int width;

    Rectangle(int length, int width){
        if(length == width){
            setDimensions(length);
        }else{
            setDimensions(length,width);
        }
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
        this.length = value;
        this.width = value;
        super.shape = "Square";
    }
}
