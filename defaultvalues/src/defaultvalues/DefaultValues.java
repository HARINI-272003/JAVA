package defaultvalues;

public class DefaultValues {
	
	//Class variables
	int intValue;
	boolean booleanValue;
	char charValue;
	double doubleValue;
	String stringValue;
	byte byteValue;
	short shortValue;
	long longValue;
	float floatValue;
	
	//method to display default values
	void displayDefault()
	{
		System.out.println("Default int Value: "+intValue);
		System.out.println("Default boolean Value: "+booleanValue);
		System.out.println("Default char Value: ["+charValue +"]");
		System.out.println("Default double Value: "+doubleValue);
		System.out.println("Default string Value: "+stringValue);
		System.out.println("Default byte Value: "+byteValue);
		System.out.println("Default short Value: "+shortValue);
		System.out.println("Default long Value: "+longValue);
		System.out.println("Default float Value: "+floatValue);
	}

	public static void main(String[] args)
	{
		// create an object of the class
		DefaultValues obj=new DefaultValues();
		
		//call the method to display default values
		obj.displayDefault();

	}

}
