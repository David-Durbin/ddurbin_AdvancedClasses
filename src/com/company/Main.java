package com.company;

public class Main {

    public static void main(String[] args) {
	    // employee objects
        Employee emp1 = new Employee("Bill Clinton", PositionTitle.SALES,18.00, 1);
        Employee emp2 = new Employee("Bill Nye", PositionTitle.TECHNICAL, 20.00, 2);
        Employee emp3 = new Employee("Mister Bill", PositionTitle.PRODUCTION, 14.50, 3);

        // adjust emp1 to salary
        emp1.seteSalary(true);

        // display
        emp1.display();
        emp1.calculate(45);
        emp2.display();
        emp2.calculate(50);
        emp3.display();
        emp3.calculate(35);



    }
}
