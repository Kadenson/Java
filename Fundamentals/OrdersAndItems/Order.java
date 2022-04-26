public class Order{
    //MEMBER VARIABLES or ATTRIBUTES
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    //METHODS

    //CONSTRUCTOR METHOD
    //EMPTY CONSTRUCTOR
    public Order(){
        this.name = "Default";
        this.total = 1;
        this.ready = true;
        this.items = (1,3,4); 
    }
    //FULL CONSTRUCTOR
    public Order(String name, double total, boolean ready, ArrayList<Item> items){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }

    //ADDTIONAL METHODS


    //GETTERS AND SETTERS
    
    //NAME
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    //TOTAL
    public double getTotal(){
        return this.total;
    }
    public void setTotal(double newTotal){
        this.total = newTotal;
    }
    //READY
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean newReady){
        this.ready = newReady;
    }
    //ITEMS
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> newItems){
        this.items = newItems;
    }

}