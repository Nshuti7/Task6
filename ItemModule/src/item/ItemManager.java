package item;

public class ItemManager {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if(itemCount < 10) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        for(int i = 0; i < itemCount; i++) {
            System.out.println("Item Name: " + items[i].name + " Price: UGX " + items[i].price  );
        }
    }
}