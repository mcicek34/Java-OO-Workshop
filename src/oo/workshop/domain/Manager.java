package oo.workshop.domain;

public class Manager extends Employee {

    protected String department;
    public final static int MANAGEMENT_PAYMENT = 10_000;

    public Manager(int no, String name, int year, String department) {
        super(no, name, year);
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        salary = MANAGEMENT_PAYMENT + super.calculateSalary();
        return salary;
    }
    
    @Override
    public void work() {
        System.out.println("Manager " + name + " is working.");
        manage();
    }

    public void manage() {
        System.out.println("Manager " + name + " is managing.");
    }

}
