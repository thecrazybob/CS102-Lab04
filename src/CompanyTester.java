public class CompanyTester {

    public static void main(String[] args) {

        // 1. Create several items with different weights.
        Item item1 = new Item(0.05, "A sample mail item");
        Item item2 = new Item(0.1, "A mail that fits the limit");
        Item item3 = new Item(0.2, "A small package");
        Item item4 = new Item(1, "A mobile phone");

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);

        // 2. Create at least 2 Customers and 2 Employees.
        Customer customer1 = new Customer("Jeff Bezos");
        Customer customer2 = new Customer("Elon Musk");

        Employee employee1 = new Employee(1, "Employee 1");
        Employee employee2 = new Employee(2, "Employee 2");

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println(employee1);
        System.out.println(employee2);

        // 3. Customers send items to each other. Have a case where the Customer
        // couldn’t send the item, because there was no available Employee.

        Company amazon = new Company(5, 5);

        amazon.addEmployee(employee1);
        amazon.addEmployee(employee2);

        amazon.addCustomer(customer1);
        amazon.addCustomer(customer2);

        customer1.sendItem(amazon, item1, customer2);
        customer1.sendItem(amazon, item1, customer2);
        customer1.sendItem(amazon, item2, customer2);
        customer1.sendItem(amazon, item2, customer2);
        customer1.sendItem(amazon, item3, customer2);
        customer1.sendItem(amazon, item3, customer2);
        customer1.sendItem(amazon, item4, customer2);
        customer1.sendItem(amazon, item4, customer2);
        customer1.sendItem(amazon, item1, customer2);
        customer1.sendItem(amazon, item1, customer2);
        customer1.sendItem(amazon, item1, customer2);

        // 4. Get an employee busy by giving it the maximum amount of jobs

        // 5. Deliver items between customers.
        amazon.deliverPackages();

    }

}
