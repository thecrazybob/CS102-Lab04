public class Employee extends Person {

    // properties

    final int MAX_JOBS = 5;

    int currentJobs;
    Delivery[] deliveries;
    double salary;
    int employeeNo;
    boolean available;

    // constructor
    public Employee(int employeeNo, String name) {
        super(name);
        deliveries = new Delivery[5];
    }

    // methods

    /**
     * @param value
     */
    public void adjustSalary(double value) {
        this.salary += value;
    }

    /**
     * Returns the availability of the Employee
     * 
     * @return boolean
     */
    public boolean getAvailability() {
        return available;
    }

    /**
     * Assigns a job to the Employee
     * 
     * @param sendItem  The item to be sent
     * @param sender    The sender of the item
     * @param receiver  The receiver of the item
     * @param packageNo The packageNo of the item
     */
    public void addJob(Item sendItem, Customer sender, Customer receiver, int packageNo) {

        if (this.currentJobs < MAX_JOBS) {

            this.currentJobs += 1;

            if (sendItem.getWeight() > 0.1) {
                deliveries[currentJobs] = new Package(sendItem, sender, receiver, packageNo);
            } else {
                deliveries[currentJobs] = new Mail(sendItem.getContent(), sender, receiver, packageNo);
            }

        }
    }

    /**
     * Deliver packages that are assigned to the Employee
     */
    public void deliverPackages() {

        for (int i = 0; i < this.deliveries.length; i++) {
            System.out.println(this.deliveries[i]);
            this.deliveries[i] = null;
        }

        this.currentJobs = 0;

    }

    /**
     * Returns the string representation of the Employee
     * 
     * @return String
     */
    public String toString() {
        return "name: " + super.getName() + " currentJobs: " + this.currentJobs + " deliveries: " + this.deliveries
                + " salary: " + this.salary + " employeeNo: " + this.employeeNo + " available: " + this.available;
    }

}
