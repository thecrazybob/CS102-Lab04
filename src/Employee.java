public class Employee extends Person {

    final int MAX_JOBS = 5;
    int currentJobs;
    Delivery[] deliveries;
    double salary;
    int employeeNo;
    boolean available;

    public Employee(int employeeNo, String name) {
        super(name);
        deliveries = new Delivery[5];
    }

    public void adjustSalary(double value) {
        this.salary += value;
    }

    public boolean getAvailability() {
        return available;
    }

    public void addJob(Item sendItem, Customer sender, Customer receiver, int packageNo) {
        
        if (this.currentJobs < MAX_JOBS) {

            this.currentJobs += 1;

            if (sendItem.getWeight() > 0.1) {
                deliveries[currentJobs] = new Package(sendItem, sender, receiver, packageNo);
            }
            else {
                deliveries[currentJobs] = new Mail(sendItem.getContent(), sender, receiver, packageNo);
            }

        }
    }

    public void deliverPackages() {

        for (int i = 0; i < this.deliveries.length; i++) {
            System.out.println(this.deliveries[i]);
            this.deliveries[i] = null;
        }

        this.currentJobs = 0;

    }

    public String toString() {
        return "name: " + super.getName() + " currentJobs: " + this.currentJobs + " deliveries: " + this.deliveries + " salary: " + this.salary + " employeeNo: " + this.employeeNo + " available: " + this.available;
    }

}
