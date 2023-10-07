package AmusmentPark;

import java.util.ArrayList;

public class GiftShop {
    private String name;
    private ArrayList<String> inventory = new ArrayList<>();
    private double sales;

    public GiftShop() {
        inventory.add("T-shirt");
        inventory.add("Mug");
        inventory.add("Keychain");
        sales = 0;
    }
    public GiftShop(String name) {
        this();
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void displayInventory() {
        System.out.println("\n##################  INVENTRY-items left       ######################");
        System.out.println("Inventory for " + name + ":");
        for (String item : inventory) {
            System.out.println("- " + item);
              System.out.println("\n##################  INVENTRY-items left      ######################");

        }
    }

    public void sellItem(Visitor visitor, String item) {

        if (inventory.contains(item)) {
            System.out.println("Selling " + item + " to " + visitor.getName());
            inventory.remove(item);
            sales += getItemPrice(item);
        } else {
            System.out.println("Sorry, " + item + " is out of stock.");
        }
    }

    public void restockItem(String item) {
        inventory.add(item);
        System.out.println("Restocked " + item);
    }
    private double getItemPrice(String item) {
       
        // For simplicity, assume all items are priced the same ($10)
        return 10.0;
    }
}
