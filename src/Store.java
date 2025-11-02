import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    // List to hold all observers (customers)
    private List<Observer> observers = new ArrayList<>();
    // Product information that will be updated and communicated to observers
    private String productInfo = "";

    // Add a new observer to the list
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);  // Adds a new observer
    }

    // Remove an observer from the list
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);  // Removes the observer
    }

    // Notify all the observers about the change in product information
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productInfo);  // Notifies each observer with the updated product info
        }
    }

    // Updates the product information and notifies all observers
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;  // Updates the product information
        notifyObservers();  // Notifies observers about the new product information
    }
}
