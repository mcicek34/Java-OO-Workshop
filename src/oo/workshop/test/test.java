package oo.workshop.test;

import oo.workshop.domain.Director;
import oo.workshop.domain.Employee;
import oo.workshop.domain.Manager;
import oo.workshop.domain.hr.HR;

public class test {

    public static void main(String[] args) {
        run1();
        run2();
        run3();
    }

    public static void run1() {

        Employee e1 = new Employee(1, "Ali", 15);
        e1.printInfo();
        double salary = e1.calculateSalary();
        System.out.println(salary);
        e1.work();

        System.out.println();

        Manager m1 = new Manager(2, "Zeynep", 10, "Sales");
        m1.printInfo();
        salary = m1.calculateSalary();
        System.out.println(salary);
        m1.work();

        System.out.println();

        Director d1 = new Director(3, "Mustafa", 5, "Company", 20_000);
        d1.printInfo();
        salary = d1.calculateSalary();
        System.out.println(salary);
        d1.work();
    }

    public static void run2() {

        Employee e = new Employee(1, "Ali", 10);
        e.printInfo();
        double salary = e.calculateSalary();
        System.out.println(salary);
        e.work();

        System.out.println();

        e = new Manager(2, "Zeynep", 10, "Sales");
        e.printInfo();
        salary = e.calculateSalary();
        System.out.println(salary);
        e.work();

        System.out.println();

        e = new Director(3, "Mustafa", 10, "Company", 20_000);
        e.printInfo();
        salary = e.calculateSalary();
        System.out.println(salary);
        e.work();
    }

    public static void run3() {
        HR hr = new HR();

        Employee e = new Employee(1, "Ali", 10);
        hr.paySalary(e);

        System.out.println();

        e = new Manager(2, "Zeynep", 10, "Sales");
        hr.paySalary(e);

        System.out.println();

        e = new Director(3, "Mustafa", 10, "Company", 20_000);
        hr.paySalary(e);

    }
}
