public class Car{
    //MEMBER VARIABLES or ATTRIBUTES
    private String suspension;
    private int cylinder;
    private boolean automatic;
    private String color;
    //METHODS


    //CONSTRUCTOR METHOD
    public Car(){
        System.out.println("DOWN PAYMENT PAID ON CAR, YOUR CAR IS BEING MADE");
        this.suspension = "DEFAULT SUSPENSION";
        this.cylinder = 4;
        this.automatic = true;
        this.color = "Black";

    }
    public Car(String suspension, int cylinder, boolean automatic, String color){
        System.out.println("YOUR CAR IS BEING MADE");
        this.suspension = suspension;
        this.cylinder = cylinder;
        this.automatic = automatic;
        this.color = color;

    }

    //GETTER AND SETTERS
    //SUSPENSION
    public String getSuspension(){
        return this.suspension;
    }
    public void setSuspension(String newSuspension){
        this.suspension = newSuspension;
    }
    //CYLINDER
    public int getCylinder(){
        return this.cylinder;
    }
    public void setCylinder(int newCylinder){
        if(newCylinder >=0){
            this.cylinder = newCylinder;
        }
        else{
            System.out.println("GO GET SOMEONE WHO KNOWS WHAT THEY ARE DOING!");
        }
    }
    //AUTOMATIC
    //COLOR
}