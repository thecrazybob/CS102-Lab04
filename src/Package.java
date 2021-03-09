public class Package extends Delivery {

    Item packedItem;

    public Package(Item content, Customer sender, Customer receiver, int packageNo) {
        super(sender, receiver, packageNo);
        this.packedItem = content;
    }

    public double getWeight() {
       return packedItem.getWeight();
    }

    public String toString() {
        return "packedItem: " + packedItem + " sender: " + super.getSender() + " receiver: " + this.getReceiver() + " packageNo: " + this.getPackageNo();
    }

}
