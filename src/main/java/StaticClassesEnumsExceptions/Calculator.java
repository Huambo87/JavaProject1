package StaticClassesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int DIVISION = 2;
//    public static final int ADDITION = 3;
//    public static final int SUBTRACTION = 4;

    //enum final constants

    public static final Logger logger = LogManager.getLogger(Calculator.class);


    public enum Type {

        MULTIPLICATION,
        DIVISION,
        ADDITION,
        SUBTRACTION
    }

    public static double calculate(double a, double b, Type type) {

        logger.info("Running Calculate Method");

        double result = 0;
        // We can do it with "if"

//        if (type == MULTIPLICATION) {
//            return a * b;
//        }

        // We can do it with "Switch Case"

        try {


            switch (type) {

                case MULTIPLICATION:
                    result = a * b;
                    break;

                case DIVISION:
                    result = a / b;
                    break;

                case ADDITION:
                    result = a + b;
                    break;

                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = -1;
            }

        } catch (Exception err) {
            logger.error("Something went wrong!", err);
//            System.out.println("Something went wrong.");
            throw err;
        }

//        finally {
//            System.out.println("Finally block");
//            result = -1;
//        }
        return result;
    }

}
