package com.javaoo.store.drivers;

import com.javaoo.store.*;

import java.util.Date;

public class InventoryDriver {
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];

        // Adding 5 Books to inventory
        myInventory[0] = new Book("Godzilla on Holiday", 24.95, 5,
                "Wesley Maryam-Price", "Ransum House", "FICTION");
        myInventory[1] = new Book("Loch Ness Memories", 49.95, 1,
                "Fred MmacMurray", "Penguin Press", "FICTION");
        myInventory[2] = new Book("MVS 3CL", 89.95, 3,
                "Steve Balmer", "Microsoft Press", "NON-FICTION");
        myInventory[3] = new Book("Lingo in a nutshell", 19.95, 8,
                "Bill Bates", "O'Reilly", "NON-FICTION");
        myInventory[4] = new Book("Grid Computing", 79.95, 2,
                "Bobby Beowold", "Trouser Press", "NON-FICTION");



        // Adding 3 CDs
        myInventory[5] = new CD("Going For The One", 12.95, 4, new Artist("YES"), new Date("07/07/1977"));
        myInventory[6] = new CD("Going Down The Country", 12.95, 10, new Artist("Bozos"), new Date("09/07/1987"));
        myInventory[7] = new CD("Polka Favorites", 2.95, 4, new Artist("Jimmy and the Yuppers"), new Date("07/07/1955"));


        String[] performers1 = {"Henry", "Elizabeth", "Franz", "Arther"};
        myInventory[8] = new ClassicalCD("Romeo and Julliet", 22.95, 1,
                "Joe Green", performers1, "New York", new Date("01/01/2011"));


        Inventory.produceReport(myInventory);

    }
}
