abstract class Delivery {
    
    // properties
    int packageNo;
    Customer sender;
    Customer receiver;

    // constructor
    public Delivery(Customer sender, Customer receiver, int packageNo) {
        this.sender = sender;
        this.receiver = receiver;
        this.packageNo = packageNo;
    }

    /** 
     * Returns the package no of the Delivery
     * @return int
     */
    public int getPackageNo() {
        return packageNo;
    }
    
    /** 
     * Returns the sender of the Delivery
     * @return Customer
     */
    public Customer getSender() {
        return sender;
    }
    
    /** 
     * Returns the receiver of the Delivery
     * @return Customer
     */
    public Customer getReceiver() {
        return receiver;
    }

    /**
     * Abstract method for returning the weight
     * @return
     */
    abstract double getWeight();

}
