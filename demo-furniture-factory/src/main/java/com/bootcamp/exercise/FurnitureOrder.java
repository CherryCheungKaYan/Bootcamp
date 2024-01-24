package com.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float total = 0;
        for (Map.Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()) {
            total += order.getKey().cost() * order.getValue();
        }
        return total;
    }

    public int getTypeCount(Furniture type) {
        int count = 0;
        for (Map.Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()) {
            if (type.label().equals(order.getKey().label())) {
                count += order.getValue();
            }
        }
        return count;
    }

    public float getTypeCost(Furniture type) {
        float totalCost = 0;
        totalCost = type.cost() * this.getTypeCount(type);
        return totalCost;
    }

    public int getTotalOrderQuantity() {
        int totalOrderQty = 0;
        for (Map.Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()) {
            totalOrderQty +=order.getValue();
        }
        return totalOrderQty; 
    }
}