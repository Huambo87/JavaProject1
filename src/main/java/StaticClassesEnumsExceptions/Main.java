package StaticClassesEnumsExceptions;

import static StaticClassesEnumsExceptions.Calculator.logger;

public class Main {
    public static void main(String[] args) {

        double result = Calculator.calculate(3, 6, Calculator.Type.MULTIPLICATION);
//        System.out.println("The result is: " + result);
        logger.info ("Result: " + result);

        result = Calculator.calculate(3, 6, Calculator.Type.DIVISION);
//        System.out.println("The result is: " + result);
        logger.info("Result: " + result);

        result = Calculator.calculate(3, 6, Calculator.Type.ADDITION);
//        System.out.println("The result is: " + result);
        logger.info("Result: " + result);

        result = Calculator.calculate(3, 6, null);
//        System.out.println("The result is: " + result);
        logger.info("Result: " + result);

    }


}
