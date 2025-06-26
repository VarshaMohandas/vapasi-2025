 class Child extends Parent{

    String childVar1 = "Child Variable 1";
    String childVar2 = "Child Variable 2";

    Child(){
        System.out.println("Child Default Constructor");
    }

    Child(String childMsg){
        this();
        System.out.println("Child Constructor 2 : "+ childMsg);
        childMethod1();
        childMethod2();
    }

     void childMethod1(){
        Parent parent  = new Parent("Message for parent");
         parent.parentMethod1();
         parent.parentMethod2();
         System.out.println("Child Method 1");
         System.out.println("Child Variable 1 : "+childVar1);
     }

     void childMethod2(){
         System.out.println("Child Method 2");
         System.out.println("Child Variable 2 : "+childVar2);
     }
}
