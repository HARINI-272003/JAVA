package java_vote;

public class EligibilityForVoting 
	{	
		String PersonName;
		int Age;
	
		//constructor
		
	public EligibilityForVoting(String PersonName, int Age) 
	{
		this.PersonName=PersonName;
		this.Age=Age;
	}
	
			//method to check voting eligibility
			public boolean isEligibleToVote()
			{
				return Age>=18;
			}
		 // Method to display person's info and voting eligibility
	    public void displayInfo() {
	        System.out.println("Name: " + PersonName);
	        System.out.println("Age: " + Age);
	        
	        if (isEligibleToVote()) {
	            System.out.println(PersonName + " is eligible to vote.");
	        } else {
	            System.out.println(PersonName + " is not eligible to vote.");
	        }
	    }
	public static void main(String[] args) {
		EligibilityForVoting  obj1 = new EligibilityForVoting ("Alice", 20);
		EligibilityForVoting  obj2 = new EligibilityForVoting("Bob", 16);

        obj1.displayInfo();
        obj2.displayInfo();
        System.out.println();
        

	}

}
