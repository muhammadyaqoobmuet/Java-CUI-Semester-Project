package AmusmentPark;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStall {
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
        public String getname(){
            return name;
        }
    public void perpareOrder() {
        System.out.println("order is preaparing please wait..");
        System.out.println("Your food is prepared ..");
        System.out.println(" Thanks for Chosing us. \n");
    }

    public void takeOrder(Visitor v , String item) {
        System.out.println("hey plase Select another   Food we have every thing for 50$ ");
        System.out.println(menu);
        
        Scanner ch = new Scanner(System.in);
        
        foodname = ch.next();
         boolean isAvalaible=false;
        for (int i = 0 ; i<menu.size() ;i++) {
            if (foodname.equalsIgnoreCase(menu.get(i))) {
               isAvalaible= true;
               break;
            } 
            }

            if(isAvalaible){
                 System.out.println("You have Selected \" " + foodname + " \" "  );
                perpareOrder(); // method inside a meht0ds
                sales+=50;
            }
            else{
                System.out.println("soory sir we are out of stock of "+foodname+" item");
                
            }
            
        }
       

    
        public double getStallRevenue(){
            return sales;
        }

}
