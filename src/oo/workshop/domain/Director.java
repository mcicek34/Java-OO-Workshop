package oo.workshop.domain;

public class Director extends Manager {

    protected int bonus;

    public Director(int no, String name, int year, String department, int bonus) {
        super(no, name, year, department);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        salary = bonus + super.calculateSalary();
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Director " + name + " is working.");
        manage();
    }
    
    @Override
    public void manage() {
        System.out.println("Director " + name + " is managing.");
        makeAstrategicPlan();
    }

    public void makeAstrategicPlan() {
        System.out.println("Director " + name + " is making a strategic plan");
    }

}
