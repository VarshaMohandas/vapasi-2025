public class Laptop {

    Processor processor;
    RAM ram;
    HardDisk harddisk;

    Laptop(Processor p , RAM r, HardDisk h){

        this.processor = p;
        this.ram = r;
        this.harddisk = h;
    }

    public void displayLaptopDetails(String userName){

        System.out.println("User : " + userName);
        System.out.println("Processor Details : "+ processor);
        System.out.println("RAM Details : "+ ram);
        System.out.println("Hard Disk Details : "+ harddisk);
    }


}
