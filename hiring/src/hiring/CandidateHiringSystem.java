package hiring;


	import java.util.ArrayList;
	import java.util.Scanner;

	class Candidate {
	    String name;
	    String email;
	    String skill;
	    int experience; // in years

	    public Candidate(String name, String email, String skill, int experience) {
	        this.name = name;
	        this.email = email;
	        this.skill = skill;
	        this.experience = experience;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Email: " + email + ", Skill: " + skill + ", Experience: " + experience + " years");
	    }
	}

	public class CandidateHiringSystem {
	    static ArrayList<Candidate> candidates = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        int choice;
	        do {
	            System.out.println("\n--- Candidate Hiring System ---");
	            System.out.println("1. Add Candidate");
	            System.out.println("2. View All Candidates");
	            System.out.println("3. Filter by Skill");
	            System.out.println("4. Filter by Experience");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> addCandidate();
	                case 2 -> viewCandidates();
	                case 3 -> filterBySkill();
	                case 4 -> filterByExperience();
	                case 5 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice.");
	            }
	        } while (choice != 5);
	    }

	    static void addCandidate() {
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter email: ");
	        String email = sc.nextLine();
	        System.out.print("Enter skill: ");
	        String skill = sc.nextLine();
	        System.out.print("Enter experience (in years): ");
	        int experience = sc.nextInt();
	        sc.nextLine();

	        Candidate c = new Candidate(name, email, skill, experience);
	        candidates.add(c);
	        System.out.println("Candidate added successfully.");
	    }

	    static void viewCandidates() {
	        if (candidates.isEmpty()) {
	            System.out.println("No candidates to display.");
	        } else {
	            System.out.println("\n--- Candidate List ---");
	            for (Candidate c : candidates) {
	                c.display();
	            }
	        }
	    }

	    static void filterBySkill() {
	        System.out.print("Enter skill to filter: ");
	        String skill = sc.nextLine();
	        System.out.println("\n--- Candidates with skill: " + skill + " ---");
	        for (Candidate c : candidates) {
	            if (c.skill.equalsIgnoreCase(skill)) {
	                c.display();
	            }
	        }
	    }

	    static void filterByExperience() {
	        System.out.print("Enter minimum experience (in years): ");
	        int minExp = sc.nextInt();
	        sc.nextLine();
	        System.out.println("\n--- Candidates with experience >= " + minExp + " years ---");
	        for (Candidate c : candidates) {
	            if (c.experience >= minExp) {
	                c.display();
	            }
	        }
	    }
	}


