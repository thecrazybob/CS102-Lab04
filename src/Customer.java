public class Customer extends Person {

    public Item currentItem;

    public Customer(String name) {
        super(name);
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item item) {
        this.currentItem = item;
    }

    public boolean sendItem(Company company, Item item, Customer receiver) {

        Item itemToBeSent;

        itemToBeSent = currentItem == null ? item : currentItem;

        return company.createDeliverable(itemToBeSent, this, receiver);

    }

    public String toString() {
        return "currentItem: " + this.currentItem;
    }

}
