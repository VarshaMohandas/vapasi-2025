package laptop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Processor processor = new Processor();
        processor.setGeneration(5);
        processor.setgHz(3.5f);

        RAM ram = new RAM();
        ram.setSize("12GB");
        ram.setRamGen(3.2f);

        HardDisk hardDisk = new HardDisk();
        hardDisk.setSize("1TB");
        hardDisk.setType("HDD");

        Laptop manavLaptop = new Laptop(processor,ram,hardDisk);
        manavLaptop.displayLaptopDetails("Manav");

        System.out.println("-----------------------------------");

        Processor processor1 = new Processor();
        processor1.setGeneration(13);
        processor1.setgHz(4.0f);

        RAM ram1 = new RAM();
        ram1.setSize("16GB");
        ram1.setRamGen(3.5f);

        HardDisk hardDisk1 = new HardDisk();
        hardDisk1.setSize("1TB");
        hardDisk1.setType("HDD");

        Laptop rashmiLaptop = new Laptop(processor1,ram1,hardDisk1);
        rashmiLaptop.displayLaptopDetails("Rashmi");




    }
}