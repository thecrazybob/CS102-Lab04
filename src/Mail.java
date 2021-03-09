public class Mail extends Delivery {
    public String content;

    public Mail(String content, Customer sender, Customer receiver, int packageNo) {
        super(sender, receiver, packageNo);
        this.content = content;
    }

    public double getWeight() {
        return 0.1;
    }

    public String toString() {
        return "Package No: " + super.getPackageNo() + " Sender: " + super.getSender() + " Receiver: " + super.getReceiver() + " Content: " + this.content;
    }
}
