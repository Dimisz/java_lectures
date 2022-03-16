package com.javaoo.store;

public class Inventory {
    public static void produceReport(Item[] items){
        for(Item i : items){
            if(i == null) break;
            System.out.println("===================");
            System.out.println("Title:\t\t" + i.getTitle());
            System.out.println("Price:\t\t" + i.getPrice());
            System.out.println("Quantity\navailable:\t\t" + i.getQuantity());
        }
    }
}
