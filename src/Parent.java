 class Parent extends GrandParent{

    String pVar1 = "Parent Variable 1";
    String pVar2 = "Parent Variable 2";

    Parent(){
        System.out.println("Parent Default Constructor");
    }

     Parent(String pMsg){
         System.out.println("Parent Constructor 2 : "+ pMsg);
     }

     void parentMethod1(){
        //GrandParent gp = new GrandParent("Message to Grand Parent");
        super.gpMethod1();
        super.gpMethod2();
         System.out.println("Parent Method 1");
         System.out.println("Parent Variable 1 : "+pVar1);
     }

     void parentMethod2(){
         System.out.println("Parent Method 2");
         System.out.println("Parent Variable 2 : "+pVar2);
     }

}
