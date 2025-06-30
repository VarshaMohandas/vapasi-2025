public class Calculator {


    double caldouble(int number){

        if(number == 0){
            throw new MyArithException("Zero Not Allowed");
        }else if(number < 0){
            throw new MyArithException("Negative Not Allowed");
        }else{
            return number;
        }
    }
}
