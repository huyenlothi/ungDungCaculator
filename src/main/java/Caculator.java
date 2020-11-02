public class Caculator {
    public static double addition(double firstOperand,double secondOperand){
        double result = firstOperand+secondOperand;
        return result;
    }
    public static double subtraction(double firstOperand,double secondOperand){
        double result = firstOperand - secondOperand;
        return result;
    }
    public static double multiplication(double firstOperand,double secondOperand){
        double result = firstOperand * secondOperand;
        return result;
    }
    public static double division(double firstOperand,double secondOperand) {
        try {
            double result = firstOperand / secondOperand;
            return result;
        } catch (Exception e) {
            System.out.println("error division zero");
        }
        return firstOperand;
    }
}
