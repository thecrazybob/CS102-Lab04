import java.util.ArrayList;

public class Company implements Locatable {

    // properties
    final int EMPLOYEE_CAPACITY = 15;

    Employee[] employees;
    ArrayList<Customer> customers;
    int numOfEmployees;
    int employeeNo;
    int packageNo;
    int posX;
    int posY;

    // constructor
    Company(int x, int y) {
        this.posX = x;
        this.posY = y;

        this.numOfEmployees = 0;
    }

    /**
     * Returns the X position of the Company
     * 
     * @return int
     */
    public int getX() {
        return this.posX;
    }

    /**
     * Returns the Y position of the Company
     * 
     * @return int
     */
    public int getY() {
        return this.posY;
    }

    /**
     * Sets the X and Y pos for the Company
     * 
     * @param x
     * @param y
     */
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /**
     * Adds an employee to the company and returns true if the employee is
     * successfully added
     * 
     * @param candidate
     * @return
     */
    public boolean addEmployee(Employee candidate) {

        if (this.numOfEmployees < EMPLOYEE_CAPACITY) {

            Employee[] newEmployeesArray = new Employee[this.employees.length + 1];

            for (int i = 0; i < this.employees.length; i++) {
                newEmployeesArray[i] = this.employees[i];
            }

            newEmployeesArray[this.employees.length] = candidate;

            this.employees = newEmployeesArray;

            this.numOfEmployees += 1;

            return true;

        }

        else {

            return false;

        }

    }

    /**
     * Adds the given customer to the Company
     * 
     * @param candidate
     * @return
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Removes an employee from the Company and returns true if the employee at the
     * given index is deleted
     * 
     * @param candidate
     * @return
     */
    public boolean terminateContract(int employeeIndex) {
        Employee[] newEmployeesArray = new Employee[this.employees.length - 1];
        boolean employeeTerminated = false;

        for (int i = 0; i < this.employees.length; i++) {

            if (i != employeeIndex || !employeeTerminated) {
                newEmployeesArray[i] = this.employees[i];
            } else {
                i -= 1;
                employeeTerminated = true;
            }

        }

        this.employees = newEmployeesArray;

        if (employeeTerminated) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Creates a deliverable object from the item if an employee is available and
     * returns true, otherwise it returns false
     * 
     * @param candidate
     * @return
     */
    public boolean createDeliverable(Item sendItem, Customer sender, Customer receiver) {

        // todo
        for (int i = 0; i < this.employees.length; i++) {
            this.employees[i].getAvailability();

        }
    }

    /**
     * Deliver all the packages via Employees and print the delivery information.
     * Displays type, no, sender and receiver info (name and loc) for each delivery.
     * 
     * @param candidate
     * @return
     */
    public void deliverPackages() {
        // todo
    }

    /**
     * Lists and prints all the information related to the Company. Includes
     * deliveries, employees, and customers.
     * 
     * @param candidate
     * @return
     */
    public String toString() {
        // todo
    }

}
