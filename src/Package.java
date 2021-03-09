public class Package extends Delivery {

    // properties
    Item packedItem;

    // constructor
    public Package(Item content, Customer sender, Customer receiver, int packageNo) {
        super(sender, receiver, packageNo);
        this.packedItem = content;
    }

    // methods

    /**
     * Returns the weight of the Package
     * 
     * @return double
     */
    public double getWeight() {
        return packedItem.getWeight();
    }

    /**
     * Returns the string representation of the Package
     * 
     * @return String
     */
    public String toString() {
        return "packedItem: " + packedItem + " sender: " + super.getSender() + " receiver: " + this.getReceiver()
                + " packageNo: " + this.getPackageNo();
    }

}
