package main;
import user.User;
import user.UserManager;
import item.Item;
import item.ItemManager;

public class Main {
    public static void main(String[] args) {
        // Create managers
        UserManager userManager = new UserManager();
        ItemManager itemManager = new ItemManager();

        // Add users
        userManager.addUser(new User("Baker", "abubaker@gmail.com", 22));
        userManager.addUser(new User("Jalia", "jalia@gmail.com", 24));

        // Add items
        itemManager.addItem(new Item("PanCake", 1000));
        itemManager.addItem(new Item("Chapat", 2000));

        // Display information
        userManager.displayUsers();
        itemManager.displayItems();
    }
}