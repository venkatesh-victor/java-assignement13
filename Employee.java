import java.util.Scanner;

abstract public class Employee {
    private static String companyName = "ZOHO";
    private int id;
    private String name;
    private String phoneNo;

    public Employee(int id, String name, String phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNO() {
        return phoneNo;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void getEmployeeDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNO());
        System.out.println("Working in: " + getCompanyName());
    }

    public abstract double calcPay();
}

class HourlyEmployee extends Employee {
    private double hourSalary;
    private int hours;

    public HourlyEmployee(int id, String name, String phoneNo,
                          double hourSalary, int hourse)
    {
        super(id, name, phoneNo);
        this.hourSalary = hourSalary;
        this.hours = hourse;
    }

    public void getEmployeeDetails() {
        System.out.println("------------------------------------");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNO());
        System.out.println("Working in: " + getCompanyName());
        System.out.println("Type: Hourly employee");
        System.out.println("Salary for this month: " + calcPay());
        System.out.println("------------------------------------");
    }

    @Override
    public double calcPay() {
        return hours * hourSalary;
    }
}

class SalariedEmployee extends Employee {
    private double bonus;
    private double salary;

    public SalariedEmployee(int id, String name, String phoneNo,
                            double salary, double bonus) 
    {
        super(id, name, phoneNo);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void getEmployeeDetails() {
        System.out.println("------------------------------------");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNO());
        System.out.println("Working in: " + getCompanyName());
        System.out.println("Type: Salaried employee");
        System.out.println("Salary for this month: " + calcPay());
        System.out.println("------------------------------------");
    }

    @Override
    public double calcPay() {
        return salary + bonus;
    }
}

class EmployeeMain {

    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee(101, "Smith", "9090909", 50, 127);
        Employee emp2 = new SalariedEmployee(201, "Anderson", "8999898", 20_000, 5_000);
        emp1.getEmployeeDetails();
        emp2.getEmployeeDetails();
    }

}
