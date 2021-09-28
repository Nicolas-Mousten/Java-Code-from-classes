package Classes;

public class Employee {
    String firstName;
    String lastName;
    int salary;
    public Employee(String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee nicolas = new Employee("Nicolas","Mousten",25000);
        Employee david = new Employee("David","Guetta",100000);

        System.out.println(nicolas +"\n" + david);
        david.salary = (int)(david.salary*1.1);
        nicolas.salary = (int)(nicolas.salary*1.1);
        System.out.println(nicolas +"\n" + david);
    }
}
