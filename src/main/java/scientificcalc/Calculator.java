package scientificcalc;
import java.lang.*;

public class Calculator {
    public int currentValue = 0;
    public int memory = 0;

    public Calculator(int currentValue){
        this.currentValue = currentValue;
    }

    public int numOnDisplay(){
        return currentValue;
    }

    public int clearDisplay(){
        return currentValue = 0;
    }

    public int memoryPlus(int currentValue){
        return currentValue;
    }

    public int memoryClear(int currentValue){
        return memory = 0;
    }

    public int add(int num, int numTwo){
        return num + numTwo;
    }

    public int sub(int num, int numTwo){
        return num - numTwo;
    }

    public int multiply(int num, int numTwo){
        return num * numTwo;
    }

    public int divide(int num, int numTwo){
        return num / numTwo;
    }

    public double square(double num){
        return Math.exp(num);
    }

    public double squareRoot(double num){
        return Math.sqrt(num);
    }

    public double exponentiation(double num, double numTwo){
        return Math.pow(num, numTwo);
    }

    public double inverse(double num){
        return 1 / num;
    }

    public int invertSign(int num){
        return num = -num;
    }

    public double sine(double num){
        return Math.sin(num);
    }

    public double cos(double num){
        return Math.cos(num);
    }

    public double tan(double num){
        return Math.tan(num);
    }

//    public String error(){
//        if ();
//    }

//    public int switchDisplayMode(int num){
//
//    }

    public double inverseSin(double num){
        return Math.asin(num);
    }

    public double inverseCos(double num){
        return Math.acos(num);
    }

    public double inverseTan(double num){
        return Math.atan(num);
    }

    public double log(int num){
        return Math.log(num);
    }

    public double inverseLog(int num){
        return Math.log10(num);
    }

    public double naturalLogarithm(int num){
        return Math.log(num);
    }

    public double inverseNaturalLog(int num){
        return Math.log10(num);
    }

    public long factorial(int num){
        int i, fact = 1;
        for(i = 1;i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
