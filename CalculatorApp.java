public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setInputValues();
        try{
            calc.doOperation();
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
