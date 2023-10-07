package AmusmentPark;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        AmusementPark park = new AmusementPark("Wonderland Park", "City Center", 50.0);
        Ride rollerCoaster = new Ride("Roller Coaster","vary D");
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