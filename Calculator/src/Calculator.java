import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args) {

        Shape circle = new Circle(10);

        Shape rectangle = new Rectangle(5,8);
        Shape square = new Rectangle(7,7);

        Shape triangle = new Triangle(10,20,30);

        ArrayList<Shape> shapeObjects = new ArrayList<>();
        shapeObjects.add(circle);
        shapeObjects.add(rectangle);
        shapeObjects.add(square);
        shapeObjects.add(triangle);


        System.out.println("");
        for(Shape s : shapeObjects){

            if(s.shape != null && s.shape.equalsIgnoreCase("Square")){
                System.out.println("Area of Square is : "+s.calculateArea());
                System.out.println("Perimeter of Square is : "+s.calculatePerimeter());
            }else{
                System.out.println("Area of "+s.getClass().getCanonicalName()+" is : "+s.calculateArea());
                System.out.println("Perimeter of "+ s.getClass().getCanonicalName() +" is : "+s.calculatePerimeter());
            }

            System.out.println("--------------------------");
        }

    }
}
