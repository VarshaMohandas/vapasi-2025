 class GrandParent {

    String gpVar1 = "GranParent Variable 1";
    String gpVar2 = "GranParent Variable 2";

    GrandParent(){
        System.out.println("GrandParent Default Constructor");
    }

    GrandParent(String gpMsg){
        System.out.println("GrandParent Constructor 2 : "+ gpMsg);
    }

    void gpMethod1(){
        System.out.println("GrandParent Method 1");
        System.out.println("GrandParent Variable 1 : "+gpVar1);
    }

    void gpMethod2(){
        System.out.println("GrandParent Method 2");
        System.out.println("GrandParent Variable 2 : "+gpVar2);
    }
}
