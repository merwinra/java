package java_tutorial.alex_lee;

/**
 * A simple public helper class
 */
public class HelperClass {
    /**
     * A static method that returns a string
     * @return A pre-defined string mentioned within this method
     */
    public static String returnStringFromStaticMethod() {
        return "This string originated from a static method from within the helper class";
    }

    /**
     * A non-static method that returns a string
     * @return A pre-defined string mentioned within this method
     */
    public String returnString() {
        return "This string originated from a non-static method from within the helper class";
    }

    /**
     * A non-static method that uses the if-else conditional ladder
     * @param number
     */
    public void ifElseMethod(Integer number) {
        if(number < 5) {
            System.out.println("The number is lesser than 5");
        } else if(number > 5) {
            System.out.println("This number is greater than 5");
        } else {
            System.out.println("The number is 5");
        }
    }

    /**
     * A non-static method that uses a for loop to repeat a string
     * @param limit
     */
    public void forLoopMethod(Integer limit) {
        for(int i = 0; i < limit; i++) {
            System.out.println("Repeating string in a for loop");
        }
    }

    /**
     * A non-static method that uses a while loop to repeat a string
     * @param limit
     */
    public void whileMethod(Integer limit) {
        Integer number = 0;
        while(number < limit) {
            System.out.println("Repeating string in a while loop");
            number++;
        }
    }

    /**
     * A non-static method that uses the try-catch blocks
     */
    public void tryCatchMethod() {
        try {
            System.out.println("Inside the try block");
        } catch(Exception e) {
            System.out.println("The try block execution failed with the exception: " + e);
        }
    }
}
