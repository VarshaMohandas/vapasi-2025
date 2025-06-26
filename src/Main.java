

class Parent1{

    Parent1(){
        System.out.println("No Arg Parent Constructor");
    }
    Parent1(String s){
        System.out.println("Parent : "+s);
    }
}

class Child1 extends Parent1{

    Child1(String s){
        System.out.println("Child :"+s);
    }
}


public class Main {

    public static void main(String[] args) {

        //Parent1 p = new Child1("Hello");
        Child child = new Child("Message for Child");


    }
}