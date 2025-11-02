public class Customer implements Observer {
    // Customer's name
    private String name;

    // Constructor to initialize the customer's name
    public Customer(String name) {
        this.name = name;
    }

    // Handles the update and prints the product information when it changes
    @Override
    public void update(String productInfo) {
        System.out.println(name + " receives notification: " + productInfo);  // Displays the notification
    }
}
