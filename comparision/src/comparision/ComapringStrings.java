package comparision;

public class ComapringStrings {

	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println("Is s1 == s2" + " " + (s1==s2)); //compares memory address
		System.out.println("Is s1 equals to s2" + " " + s1.equals(s2)); //compares values
	}

}
