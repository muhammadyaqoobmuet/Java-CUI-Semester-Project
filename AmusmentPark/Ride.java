package AmusmentPark;

public class Ride  extends Information{
  
   private int maxheight=500;
   private int maxriders=200;
   private int currentriders=0;
    public String getRidename() {
        return name;
    }
    public String getDescription(){
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
    Ride(String name,String description){
        this.name=name;
        this.description=description;
    }

    public void startRide(){
        System.out.println("1 2 3 Ride has Started....");

    }
    public void endRide(){
        System.out.println("Ride has stoped Succsesfully");

    }
    public boolean isRidefull(){
        if(currentriders>maxriders){
            return true;
        }
        return false;
    }
    public void Info(){
         System.out.println("\n##################  ROLLER COSTER         ######################");
        System.out.println("Ride Name "+ name);
        System.out.println("current Riders: "+currentriders);
        System.out.println("max rideers: "+ maxriders);
        System.out.println("max height :"+maxheight);
        System.out.println("\n##################  ROLLER COSTER         ######################");
       
    }
}
