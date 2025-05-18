package java_conversion;

public class DataTypeConversion {
	
    public static void main(String[] args) {
    	
        // Converting int to double
        int intValue = 42;
        double convertedDouble = intValue; // Implicit widening conversion
        System.out.println("Int to Double: " + intValue + " -> " + convertedDouble);

        // Converting double to int
        double doubleValue = 42.99;
        int convertedInt = (int) doubleValue; // Explicit narrowing conversion (type casting)
        System.out.println("Double to Int: " + doubleValue + " -> " + convertedInt);
    }
}

