import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4,7);

        boolean isSquare = true;


        Triangle triangle = new Triangle(10,20,30);

        ArrayList<Shape> shapeObjects = new ArrayList<>();
        shapeObjects.add(circle);
        shapeObjects.add(rectangle);
        shapeObjects.add(triangle);


        System.out.println("");
        for(Shape s : shapeObjects){
            System.out.println("Area of "+s.getClass().getCanonicalName()+" is : "+s.calculateArea());
            System.out.println("Perimeter of "+ s.getClass().getCanonicalName() +" is : "+s.calculatePerimeter());
            System.out.println("--------------------------");
        }

    }
}
