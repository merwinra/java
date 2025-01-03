package java_tutorial.alex_lee;

/**
 * A simple public class that goes over some of the fundamentals of Java
 * based on the <a href="https://www.youtube.com/watch?v=RRubcjpTkks">tutorial</a>
 * published by Alex Lee.
 */
public class LearnJava {
    public static void main(String[] args) {

        // primitive data types
        int number = 5;
        char letter = 'M';
        long bigNumber = 500;
        double decimalNumber = 5.5;

        // non-primitive data types
        String name = "Merwin";

        // console out functions
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // calling a method which doesn't return
        addExclamation(name);

        // calling a method that returns something
        System.out.println(addExclamationTwice(name));

        // instantiating the helper class to access its method
        HelperClass helperClass = new HelperClass();
        String stringResult1 = helperClass.returnString();
        System.out.println(stringResult1);

        // accessing the static method without instantiating
        String stringResult2 = HelperClass.returnStringFromStaticMethod();
        System.out.println(stringResult2);

        // calling the rest of the methods
        helperClass.ifElseMethod(number);
        helperClass.forLoopMethod(number);
        helperClass.whileMethod(number);
        helperClass.tryCatchMethod();
    }

    /**
     * A method that doesnt return
     *
     * @param string
     */
    public static void addExclamation(String string) {
        System.out.println(string + "!");
    }

    /**
     * A method that returns a string
     *
     * @param string
     * @return the input string with two exclamations concatenated at the end
     */
    public static String addExclamationTwice(String string) {
        return string + "!!";
    }
}
