package org.example.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        Clothing tShirt = new Clothing("C1", "T-Shirt", 19.99, 100, "M");
        Book java = new Book("B1", "Java Programming", 1599.99, 0, "John Doe");

        items.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        items.add(new Clothing("C1", "T-Shirt", 19.99, 100, "M"));
        items.add(new Book("B1", "Java Programming", 59.99, 50, "John Doe"));

        // sort these items: Sort by name of the items
        // <1,4,2,5,7> : <1,2,4,5,7>
        // <"Shilpa", "Sai", "Alok"> : <>


        System.out.println(items.get(1).compareTo(items.get(2)));

        System.out.println();

        Collections.sort(items);

        Collections.sort(items, new ItemNameComparator());

        Collections.sort(items, new ItemQuantityComparator());


        for (Item item : items) {
            System.out.println(item.getName());
        }

//        4 1 5 3 2 : 1 2 3 4 5

        Inventory<Electronics> inventory = new Inventory<>();

        Electronics laptop = new Electronics("E1", "Laptop", 0, 5, 24);
        Electronics mobilePhone = new Electronics("E2", "Mobile", 5000, 10, 12);
        Electronics earphones = new Electronics("E3", "Earphones", 500, 0, 12);

        try {
            inventory.add(laptop);
            inventory.add(mobilePhone);
            inventory.add(earphones);
        } catch (InvalidQuantityException ex){
            System.out.println(ex.getMessage());
        }

        inventory.remove(mobilePhone);

        Electronics e1 =  inventory.get("E1");
        System.out.println(e1.getName());

        List<Electronics> itemsList = inventory.getAll();
        System.out.println("Printing all items in the inventory");
        for(Electronics item : itemsList) {
            System.out.println(item.getName());
        }

//        Test recently viewed items
        RecentlyViewItems recentlyViewItems = new RecentlyViewItems();

        recentlyViewItems.addRecentlyViewedItem(laptop);
        recentlyViewItems.addRecentlyViewedItem(mobilePhone);
        recentlyViewItems.addRecentlyViewedItem(earphones);
        recentlyViewItems.addRecentlyViewedItem(java);
        recentlyViewItems.addRecentlyViewedItem(tShirt);
        recentlyViewItems.addRecentlyViewedItem(earphones);

        for(Item item : recentlyViewItems.getRecentlyViewedItems()) {
            System.out.println(item.getName());
        }

//        Test Order and OrderProcessor

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order("O1", true));
        orderProcessor.addOrder(new Order("O2", false));
        orderProcessor.addOrder(new Order("O3", false));
        orderProcessor.addOrder(new Order("O4", true));
        orderProcessor.addOrder(new Order("O5", false));

        while(orderProcessor.getSize() > 0){
            System.out.println(orderProcessor.processOrder().getOrderId());
        }
//        test sorting and filtering

        Inventory<Item> inventory2 = new Inventory<>();
//        opened the db connection
        try {
            inventory2.add(laptop);
            inventory2.add(mobilePhone);
            inventory2.add(earphones);
            inventory2.add(java);
            inventory2.add(tShirt);
//            trying to do something with db
        } catch (InvalidQuantityException ex){

            System.out.println(ex.getMessage());
        } finally {
//            finally block is always implemented after the try and catch
            System.out.println("Closing the db connection");
        }

        System.out.println("Closing the db connection");

        List<Item> affordableItems = inventory2.filterByPrice(0, 100.0);
        System.out.println("Affordable items");
        for (Item item : affordableItems) {
            System.out.println(item.getName());
        }

        List<Item> availableItems = inventory2.filterByAvailability();
        System.out.println("Available items");
        for (Item item : availableItems) {
            System.out.println(item.getName());
        }

        List<Item> sortedItems = inventory2.sortItems(new ItemQuantityComparator());
        System.out.println("Sorted items");
        for (Item item : sortedItems) {
            System.out.println(item.getName());
        }

//        WishList testing

        WishList wishList = new WishList();

        wishList.addItem(laptop);
        wishList.addItem(mobilePhone);
        wishList.addItem(earphones);

        System.out.println("Wish list");
        for (Item item : wishList.getWishListItems()){
            System.out.println(item.getName());
        }

        List<Item> itemsList1 = inventory2.getAll();
        System.out.println(itemsList1.size());
        System.out.println("Printing all items id in the inventory");


        // Streams Lab

        /*
        1. Print all item IDs in the inventory using map()

        a. Start a stream from the inventory
        b. use map() to extract item IDs
        c. use forEach() to print them
         */

        itemsList1
                .stream() // Stream<Item>
                .map(item -> item.getId()) // Stream<String>
                .forEach(id -> System.out.println(id));

        /*
        Create a list of item names in lowercase and print it

         */

        List<String> ans = itemsList1
                .stream() // Stream<Item>
                .map(item -> item.getName().toLowerCase()) // Stream<String>
                .toList();

        System.out.println(ans);

        /*
        Generate a list of the lengths of item names
         */

        List<Integer> ans1 = itemsList1
                .stream() // Stream<Item>
                .map(item -> item.getName().length()) // Stream<Integer>
                .toList();

        System.out.println(ans1);


        /*
        Filtering and Matching
        Find all items priced above 1000 and print their names


         */

        itemsList1
                .stream() // Stream<Item>
                .filter(item -> item.getPrice() > 1000)
                .forEach(item -> System.out.println(item.getName()));


        // Reduce function
        // Calculate the total quantity of all items in the inventory
        int total = itemsList1.stream()
                .map(item -> item.getQuantity())
                .reduce(0, (totalSum, quantity) -> totalSum + quantity);

        System.out.println(total);

        // Find the most expensive item using reduce()

        Optional<Item> optionalItem = itemsList1
                .stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);

        optionalItem.ifPresent(item -> System.out.println(item.getName()));

    }
}
