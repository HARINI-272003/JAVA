package com.tns.fooddeliverysystem.services;

class OrderService {
    private Map<Integer, Order> orders = new HashMap<>();
    private Map<Integer, DeliveryPerson> deliveryPeople = new HashMap<>();
    private int orderCounter = 1;

    public int placeOrder(Customer customer) {
        Order order = new Order(orderCounter, customer);
        orders.put(orderCounter, order);
        return orderCounter++;
    }

    public void viewOrders() {
        for (Order o : orders.values()) {
            System.out.println(o);
        }
    }

    public void viewOrdersByCustomer(int customerId) {
        for (Order o : orders.values()) {
            if (o.getCustomer().getUserId() == customerId) {
                System.out.println(o);
            }
        }
    }

    public void addDeliveryPerson(DeliveryPerson dp) {
        deliveryPeople.put(dp.getDeliveryPersonId(), dp);
    }

    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
        if (orders.containsKey(orderId) && deliveryPeople.containsKey(deliveryPersonId)) {
            orders.get(orderId).setDeliveryPerson(deliveryPeople.get(deliveryPersonId));
        }
    }
}