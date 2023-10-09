package AmusmentPark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        AmusementPark park = new AmusementPark("Wonderland Park", "City Center", 50.0);
        Ride rollerCoaster = new Ride("Roller Coaster", "vary dangras");
        FoodStall fastFood = new FoodStall("Fast-Food");
        GiftShop gshop = new GiftShop("Mr-Jacks-Shop");
        // Create visitors
        Visitor visitor1 = new Visitor("Yaqoob", 25, 1000.0);
        Visitor visitor2 = new Visitor("Mubashir", 30, 150.0);
        Visitor visitor3 = new Visitor("Irfan", 10, 30.0);

        visitor1.purchaseTicket(park);
        visitor2.purchaseTicket(park);

        visitor1.buyFood(fastFood, "Burger");
        visitor2.buyFood(fastFood, "Fries");
        visitor3.buyFood(fastFood, "Pizza"); // Not enough money

        visitor1.buyGift(gshop, "T-shirt");
        visitor2.buyGift(gshop, "Mug");
        // visitor3.buyGift(gshop, "Keychain");

        park.displayParkInfo();
        rollerCoaster.Info();
        gshop.displayInventory();
        visitor1.displayVisitorInfo();
        visitor2.displayVisitorInfo();
        visitor3.displayVisitorInfo();

    }
}

class AmusementPark {
    private String name;
    private String location;
    private double ticketprice = 239.00d;
    private int visitorCount = 0;
    private int maxcapacity = 1000;
    private double totalRevenue;
    private boolean isOpen = true;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getTicketprice() {
        return ticketprice;
    }

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public AmusementPark(String name, String location, double ticketprice) {
        this.name = name;
        this.location = location;
        this.ticketprice = ticketprice;
    }

    public void admitVisitor() {
        if (visitorCount < maxcapacity) {
            visitorCount++;
            System.out.println("Visitor admitted to the park.");
        } else {
            System.out.println("Sorry, the park is currently at full capacity.");
        }

    }

    public double calculateRevenue() {
        totalRevenue = visitorCount * ticketprice; // last ma use krna
        System.out.println("Total revenue: $" + totalRevenue);
        return totalRevenue;
    }

    public void closePark() {
        if (isOpen == false) {
            System.out.println("park is closed..");
        }
    }

    public void displayParkInfo() {
        System.out.println("\n##################  PARK INFO       ######################");
        System.out.println("Park Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Current Visitor Count: " + visitorCount);
        System.out.println("Ticket Price: $" + ticketprice);
        System.out.println("\n##################  PARK INFO       ######################");
    }
}

class FoodStall {
    String name;
    String foodname;
    ArrayList<String> menu = new ArrayList<>();
    double sales;

    FoodStall() {
        menu.add("Nugets");
        menu.add("Pizza");
        menu.add("Fries");
        menu.add("Zinger Burger");
        menu.add("Fried Wings");
        menu.add("Singapore Rice");
        menu.add("Biryani");
        sales = 0;
    }

    FoodStall(String name) {
        this();
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void perpareOrder() {
        System.out.println("order is preaparing please wait..");
        System.out.println("Your food is prepared ..");
        System.out.println(" Thanks for Chosing us. \n");
    }

    public void takeOrder(Visitor v, String item) {
        System.out.println("hey plase Select another   Food we have every thing for 50$ ");
        System.out.println(menu);

        Scanner ch = new Scanner(System.in);

        foodname = ch.next();
        boolean isAvalaible = false;
        for (int i = 0; i < menu.size(); i++) {
            if (foodname.equalsIgnoreCase(menu.get(i))) {
                isAvalaible = true;
                break;
            }
        }

        if (isAvalaible) {
            System.out.println("You have Selected \" " + foodname + " \" ");
            perpareOrder(); // method inside a meht0ds
            sales += 50;
        } else {
            System.out.println("soory sir we are out of stock of " + foodname + " item");

        }

    }

    public double getStallRevenue() {
        return sales;
    }

}

class GiftShop {
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

    public String getName() {
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

class Information {
    String name;
    String description;

    public void Info() {
        // information of class
    }
}

class Ride extends Information {

    private int maxheight = 500;
    private int maxriders = 200;
    private int currentriders = 0;

    public String getRidename() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxheight() {
        return maxheight;
    }

    public int getCurrentriders() {
        return currentriders;
    }

    public int getMaxriders() {
        return maxriders;
    }

    Ride(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startRide() {
        System.out.println("1 2 3 Ride has Started....");

    }

    public void endRide() {
        System.out.println("Ride has stoped Succsesfully");

    }

    public boolean isRidefull() {
        if (currentriders > maxriders) {
            return true;
        }
        return false;
    }

    public void Info() {
        System.out.println("\n##################  ROLLER COSTER         ######################");
        System.out.println("Ride Name " + name);
        System.out.println("current Riders: " + currentriders);
        System.out.println("max rideers: " + maxriders);
        System.out.println("max height :" + maxheight);
        System.out.println("\n##################  ROLLER COSTER         ######################");

    }
}

class Visitor {
    private String name;
    private int age;
    private double money;
    private ArrayList<Ride> ridesTaken = new ArrayList<>();
    private ArrayList<FoodStall> foodPurchases = new ArrayList<>();
    private ArrayList<GiftShop> giftPurchases = new ArrayList<>();

    public Visitor(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void purchaseTicket(AmusementPark park) {
        double ticketPrice = park.getTicketprice();
        if (money >= ticketPrice) {
            System.out
                    .println("\n" + name + " purchased a ticket to " + park.getName() + " for $" + ticketPrice + "\n");
            money -= ticketPrice;
        } else {
            System.out.println(name + " does not have enough money to purchase a ticket to " + park.getName());
        }
    }

    public void buyFood(FoodStall stall, String item) {
        if (money >= 50) { // Assuming each food item costs $50 for simplicity
            System.out.println(
                    name + " is buying " + item + " from " + stall.getname() + " this is complimentry for every one");
            foodPurchases.add(stall);
            money -= 50;
            stall.takeOrder(this, item);
        } else {
            System.out.println(name + " does not have enough money to buy " + item);
        }
    }

    public void buyGift(GiftShop shop, String item) {
        if (money >= 10) { // Assuming each gift item costs $10 for simplicity
            System.out.println(name + " is buying " + item + " from " + shop.getName() + "");
            giftPurchases.add(shop);
            money -= 10;
            shop.sellItem(this, item);
        } else {
            System.out.println(name + " does not have enough money to buy " + item);
        }
    }

    public void displayVisitorInfo() {
        System.out.println("\n##################  Visitor Info       ######################");
        System.out.println("Visitor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Money: $" + money);
        System.out.println("Rides Taken: " + ridesTaken.size());
        System.out.println("Food Purchases: " + foodPurchases.size());
        System.out.println("Gift Shop Purchases: " + giftPurchases.size());
        System.out.println("\n##################  Visitor Info       ######################");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
}
