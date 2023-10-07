package AmusmentPark;

/**
 * AmusementPark
 */
public class AmusementPark {
    private String name;
    private String location;
    private double ticketprice = 239.00d;
    private int visitorCount = 0;
    private int maxcapacity = 1000;
    private double totalRevenue;
    private boolean isOpen=true;

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
         totalRevenue = visitorCount * ticketprice;  // last ma use krna
        System.out.println("Total revenue: $" + totalRevenue);
        return totalRevenue;
    }
    public void closePark(){
        if(isOpen==false){
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