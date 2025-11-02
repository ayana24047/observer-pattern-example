# observer-pattern-example
Structure

Subject (Interface): Defines methods for adding, removing, and notifying observers.

Observer (Interface): Defines the method update() that will be used by all concrete observers to receive updates.

Store (Concrete Subject): Implements the Subject interface. It maintains a list of observers and notifies them when the product information changes.

Customer (Concrete Observer): Implements the Observer interface. Each customer receives notifications when the store's product information changes.

Main: Demonstrates how the Observer Pattern works by creating instances of Store and Customer, adding observers, and updating product information.

How it works

Store (the subject) manages a list of Customer (observers).

When the store updates product information, it calls notifyObservers(), which in turn calls the update() method on all registered Customer instances.

The Customer receives the updated information and reacts to it by printing a message.

Installation
<img width="549" height="652" alt="image" src="https://github.com/user-attachments/assets/26633ccc-669b-468a-8757-056e315a5b21" />
