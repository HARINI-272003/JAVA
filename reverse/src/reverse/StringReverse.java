package reverse;

public class StringReverse {
	
public static void main(String[] args) {

	String a= "desserts";
	String b= "";
	
	for (int i= a.length()-1; i>=0;i--)
	{
		b+=a.charAt(i);
	}
	System.out.println("Original:" + a.toUpperCase());
	System.out.println("Reversed:" + b.toUpperCase());
}	
}
