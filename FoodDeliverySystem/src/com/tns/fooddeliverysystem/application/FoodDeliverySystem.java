package com.tns.fooddeliverysystem.application;

import java.util.Scanner;
import java.util.Map;

public class FoodDeliverySystem {

    private static FoodService foodService = new FoodService();
    private static OrderService orderService = new OrderService();
    private static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerChoice, adminChoice;
        while (true) {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Add Restaurant");
                        System.out.println("2. Add Food Item to Restaurant");
                        System.out.println("3. Remove Food Item from Restaurant");
                        System.out.println("4. View Restaurants and Menus");
                        System.out.println("5. View Orders");
                        System.out.println("6. Add Delivery Person");
                        System.out.println("7. Assign Delivery Person to Order");
                        System.out.println("8. Exit");
                        System.out.print("Choose an option: ");
                        adminChoice = scanner.nextInt();

                        switch (adminChoice) {
                            case 1:
                                addRestaurant(scanner);
                                break;
                            case 2:
                                addFoodItemToRestaurant(scanner);
                                break;
                            case 3:
                                removeFoodItemFromRestaurant(scanner);
                                break;
                            case 4:
                                viewRestaurantsAndMenus();
                                break;
                            case 5:
                                viewOrders();
                                break;
                            case 6:
                                addDeliveryPerson(scanner);
                                break;
                            case 7:
                                assignDeliveryPersonToOrder(scanner);
                                break;
                            case 8:
                                System.out.println("Exiting Admin Module");
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    } while (adminChoice != 8);
                    break;

                case 2:
                    do {
                        System.out.println("\nCustomer Menu:");
                        System.out.println("1. Add Customer");
                        System.out.println("2. View Food Items");
                        System.out.println("3. Add Food to Cart");
                        System.out.println("4. View Cart");
                        System.out.println("5. Place Order");
                        System.out.println("6. View Orders");
                        System.out.println("7. Exit");
                        System.out.print("Choose an option: ");
                        customerChoice = scanner.nextInt();

                        switch (customerChoice) {
                            case 1:
                                createCustomer(scanner);
                                break;
                            case 2:
                                viewRestaurantsAndMenus();
                                break;
                            case 3:
                                addToCart(scanner);
                                break;
                            case 4:
                                viewCart(scanner);
                                break;
                            case 5:
                                placeOrder(scanner);
                                break;
                            case 6:
                                viewOrders();
                                break;
                            case 7:
                                System.out.println("Exiting Customer Module");
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    } while (customerChoice != 7);
                    break;

                case 3:
                    System.out.println("Thanks for using Food Delivery System!!");
                    return;
                default:
                    System.out.println("Invalid main menu option.");
            }
        }
    }

	private static void placeOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void viewCart(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void addToCart(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void createCustomer(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void assignDeliveryPersonToOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void addDeliveryPerson(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void viewOrders() {
		// TODO Auto-generated method stub
		
	}

	private static void viewRestaurantsAndMenus() {
		// TODO Auto-generated method stub
		
	}

	private static void removeFoodItemFromRestaurant(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void addFoodItemToRestaurant(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void addRestaurant(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

    // All helper methods (addRestaurant, addFoodItemToRestaurant, etc.) remain unchanged
    // as you've defined them correctly in your original post
}
