package core;

//business logic class
public class Customer {
    String customerName;
    double customerSalary;

    public void  acceptData(String name, double  salary ) {
        customerName = name;
        customerSalary = salary;
    }

    public  void show(){
        System.out.println("customer Name: "+customerName);
        System.out.println(" customer Salary: "+customerSalary);
    }
//execution login class
    public void getCustomers() {
        Customer adi = new Customer();
        adi.acceptData("adi", 10000);
        adi.show();


        Customer pooja = new Customer();
        pooja.acceptData("pooja", 20000);
        pooja.show();
    }
}
