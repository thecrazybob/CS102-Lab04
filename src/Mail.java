public class Mail extends Delivery {

    // properties
    public String content;

    // constructor
    public Mail(String content, Customer sender, Customer receiver, int packageNo) {
        super(sender, receiver, packageNo);
        this.content = content;
    }

    // methods

    /**
     * Returns the weight of the Mail
     * 
     * @return double
     */
    public double getWeight() {
        return 0.1;
    }

    /**
     * Returns the string representation of the Mail
     * 
     * @return String
     */
    public String toString() {
        return "Package No: " + super.getPackageNo() + " Sender: " + super.getSender() + " Receiver: "
                + super.getReceiver() + " Content: " + this.content;
    }

}
