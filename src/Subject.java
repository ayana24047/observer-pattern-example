public interface Subject {
    // Method to add a new observer
    void addObserver(Observer observer);

    // Method to remove an observer
    void removeObserver(Observer observer);

    // Method to notify all observers of a change
    void notifyObservers();
}
