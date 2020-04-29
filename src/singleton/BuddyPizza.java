package singleton;

public class Pizza2 {

    // Singleton class: we are allowed to create one instance of a class at a time.
    // Using private constructor we can ensure that no more than one object can be created at a time.


    public String pizzaPrice="20";
    public String pizzaName="American Pizza";
    public double deliveryFee=2.5;
    private char size='M';
    private boolean isAvailable=true;

    private Pizza2() {
        // private constructor
    }

    // create a instance variable/ object
    private static Pizza2 instance=new Pizza2();

    public static Pizza2 getInstance(){
        return instance;
    }

    public Pizza2(String pizza2Name) {
        this.pizzaName = pizza2Name;
    }

    public Pizza2(String pizzaPrice, String pizzaName) {
        this.pizzaPrice = pizzaPrice;
        this.pizzaName = pizzaName;
    }





}
