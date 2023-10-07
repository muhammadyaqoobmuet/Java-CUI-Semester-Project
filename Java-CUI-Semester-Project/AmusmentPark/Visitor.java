package AmusmentPark;

import java.util.ArrayList;

public class Visitor {
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
            System.out.println("\n"+name + " purchased a ticket to " + park.getName() + " for $" + ticketPrice +"\n");
            money -= ticketPrice;
        } else {
            System.out.println(name + " does not have enough money to purchase a ticket to " + park.getName());
        }
    }

    public void buyFood(FoodStall stall, String item) {
        if (money >= 50) { // Assuming each food item costs $50 for simplicity
            System.out.println(name + " is buying " + item + " from " + stall.getname() + " this is complimentry for every one");
            foodPurchases.add(stall);
            money -= 50;
            stall.takeOrder(this, item);
        } else {
            System.out.println(name + " does not have enough money to buy " + item);
        }
    }
    
    public void buyGift(GiftShop shop, String item) {
        if (money >= 10) { // Assuming each gift item costs $10 for simplicity
            System.out.println(name + " is buying " + item + " from " + shop.getName() +"");
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
