package ExamExamples;

public class Customer {
    private String name;
    private String lastName;
    private int bankBalance;
    private String balanceStatus;
    private static int numberOfCustomers;
    private static int totalAmountOfBalance = 0;

    public Customer(String name, String lastName, int bankBalance) {
        this.name = name;
        this.lastName = lastName;
        this.bankBalance = bankBalance;
        this.balanceStatus = getBalanceStatus();
        numberOfCustomers++;
        totalAmountOfBalance = totalAmountOfBalance + this.bankBalance;
    }
    public String getName() {return name;}
    public String getLastName() {return lastName;}
    public int getBankBalance() {return bankBalance;}

    public String getBalanceStatus() {
        String status = "Zero";
        if(bankBalance<0){
            status = "Negative";
        }else if(bankBalance>0){
            status = "Positive";
        }
        return status;}

    public static int getAverageBalance(){
        return totalAmountOfBalance/numberOfCustomers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bankBalance=" + bankBalance +
                ", balance status=" + balanceStatus +
                '}';
    }
}
class run{
    public static void main(String[] args) {
        Customer c1 = new Customer("Nicolas","Mousten",10000);
        Customer c2 = new Customer("Andreas","Mousten",20000);
        Customer c3 = new Customer("Jhonny","Mousten",30000);
        Customer c4 = new Customer("Nina","Mousten",40000);
        Customer c5 = new Customer("Cathrine","Mousten",50000);
        System.out.println(Customer.getAverageBalance());
        System.out.println(c4);
    }
}
