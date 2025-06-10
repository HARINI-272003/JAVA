package com.tns.fooddeliverysystem.services;

class CustomerService {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getUserId(), customer);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    public void viewCustomers() {
        for (Customer c : customers.values()) {
            System.out.println("Customer ID: " + c.getUserId() + ", Name: " + c.getUsername());
        }
    }
}