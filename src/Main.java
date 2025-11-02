public class Main {
    public static void main(String[] args) {
        // Create a store (subject)
        Store store = new Store();

        // Create a couple of customers (observers)
        Observer customer1 = new Customer("Customer 1");
        Observer customer2 = new Customer("Customer 2");

        // Add customers to the observer list
        store.addObserver(customer1);
        store.addObserver(customer2);

        // Change product information, all observers will receive the update
        store.setProductInfo("New product: iPhone 15 is now available for sale!");

        // Remove one customer from the observer list
        store.removeObserver(customer2);

        // Change product information again, only the remaining customer will receive the update
        store.setProductInfo("20% discount on all products!");
    }
}
