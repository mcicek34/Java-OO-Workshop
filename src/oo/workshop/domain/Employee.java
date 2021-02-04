package oo.workshop.domain;

public class Employee extends Object{

    protected int no;
    protected String name;
    protected double salary;
    protected int year;
    
    public static final int BASE_SALARY = 1_000;

    public Employee(int no, String name, int year) {
        this.no = no;
        this.name = name;
        this.year = year;

    }

    public void work() {
        System.out.println("Employe " + name + "is working.");
    }

    public double calculateSalary() {
        salary = year * BASE_SALARY;   
        return salary;
    }

    public void printInfo() {
        System.out.println("--------Employee Info-------");
        System.out.println("No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        calculateSalary();
        System.out.println("Salary: " + salary + "\n");
    }
    
        public String getName() {
        return name;
    }


}
