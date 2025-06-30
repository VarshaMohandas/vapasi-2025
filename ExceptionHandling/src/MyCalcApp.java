import java.util.Scanner;

public class MyCalcApp {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        calc.caldouble(number);

        System.out.println("Success : "+number);


    }
}
