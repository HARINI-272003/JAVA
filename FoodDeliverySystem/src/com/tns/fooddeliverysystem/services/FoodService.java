package com.tns.fooddeliverysystem.services;

import java.util.*;

class FoodService {
    private Map<Integer, Restaurant> restaurants = new HashMap<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
    }

    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
        if (restaurants.containsKey(restaurantId)) {
            restaurants.get(restaurantId).addFoodItem(foodItem);
        }
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        if (restaurants.containsKey(restaurantId)) {
            restaurants.get(restaurantId).removeFoodItem(foodItemId);
        }
    }

    public void viewRestaurants() {
        for (Restaurant r : restaurants.values()) {
            System.out.println("Restaurant ID: " + r.getId() + ", Name: " + r.getName());
            for (FoodItem fi : r.getMenu()) {
                System.out.println(" - Food Item ID: " + fi.getId() + ", Name: " + fi.getName() + ", Price: Rs. " + fi.getPrice());
            }
        }
    }

    public FoodItem findFoodItem(int restaurantId, int foodItemId) {
        if (restaurants.containsKey(restaurantId)) {
            for (FoodItem fi : restaurants.get(restaurantId).getMenu()) {
                if (fi.getId() == foodItemId) return fi;
            }
        }
        return null;
    }
}