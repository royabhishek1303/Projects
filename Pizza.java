public class Pizza {
    private int price;
    private boolean veg;

    private int extraChessePrice = 100;
    private int extraToppingPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraChesseAdded= false;
    private boolean isExtraToppingAdded= false;
    private boolean isBackPackAdded= false;


    public Pizza(Boolean veg){
        this.veg=veg;
        if (this.veg){
            this.price = 300;
        }
        else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraChesseAdded=true;
        this.price += extraChessePrice;


    }
    public void addExtraTopping(){
        isExtraToppingAdded=true;
        this.price += extraToppingPrice;


    }
    public void takeAway(){
        isBackPackAdded=true;
        this.price += backPackPrice;


    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza " + basePizzaPrice);
        if (isExtraChesseAdded){
            bill += "Extra Cheese added " + extraChessePrice+ "\n";
        }
        if (isExtraToppingAdded){
            bill += "Extra Topping added " + extraToppingPrice+ "\n";
        }
        if (isBackPackAdded){
            bill += "Extra Topping added " + backPackPrice+ "\n";

    }
        bill += "Bill : " + this.price;
        System.out.println(bill);
}
}

