public class Item{
    //MEMBER VARIABLES or ATTRIBUTES
    private String name;
    private double price;
    //METHODS


    //CONSTRUCTOR METHOD
    //EMPTY CONSTRUCTOR
    public Item(){
        this.name = "Default";
        this.price = 5.0;
    }

    //FULL CONSTRUCTOR
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //ADDITIONAL METHODS



    //GETTERS AND SETTERS

    //NAME
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    //PRICE
    public String getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}