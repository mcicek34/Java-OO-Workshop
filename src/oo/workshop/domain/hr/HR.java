package oo.workshop.domain.hr;

import oo.workshop.domain.Employee;

public class HR {
    
    public void paySalary(Employee e){
        double salary = e.calculateSalary();
        System.out.println("Paying " + e.getName() + " salary: " + salary);
        
    }
    
}
