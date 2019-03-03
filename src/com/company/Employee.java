package com.company;

public class Employee {
    // variables
    String eName = "";
    PositionTitle ePosition;
    boolean eSalary = false;
    double ePayRate = 0.0;
    int eShift = 1;
    String eStartDate = "";

    // default constructor  Note: Does not set employee to salary, that must be done with mutator. Same for start date.
    public Employee(String eName, PositionTitle ePosition, double ePayRate, int eShift) {
        this.eName = eName;
        this.ePosition = ePosition;
        this.ePayRate = ePayRate;
        this.eShift = eShift;
    }

    // Accessors
    public String geteName() {
        return eName;
    }

    public PositionTitle getePosition() {
        return ePosition;
    }

    public boolean iseSalary() {
        return eSalary;
    }

    public double getePayRate() {
        return ePayRate;
    }

    public int geteShift() {
        return eShift;
    }

    public String geteStartDate() {
        return eStartDate;
    }

    // Mutators
    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setePosition(PositionTitle ePosition) {
        this.ePosition = ePosition;
    }

    public void seteSalary(boolean eSalary) {
        this.eSalary = eSalary;
    }

    public void setePayRate(double ePayRate) {
        this.ePayRate = ePayRate;
    }

    public void seteShift(int eShift) {
        this.eShift = eShift;
    }

    public void seteStartDate(String eStartDate) {
        this.eStartDate = eStartDate;
    }

    // special functions

    public void calculate(double hoursIn)
    {
        // second shift gets 5% pay boost, third shift gets 10% boost
        // overtime applies to all non-salary employees over 40 hours at 1.5 times pay
        double weeklyPay = 0.0, overtime = 0, shiftbonus = 0;

        // calculate overtime
        if (hoursIn > 40) {
            overtime = hoursIn - 40;
        }

        // switch through shifts shift 1 is default
        switch(this.geteShift()) {
            case 2:
                if(this.iseSalary() || overtime <= 0) {
                    weeklyPay = hoursIn * (this.getePayRate() * 1.05);
                }
                else {
                    weeklyPay = (this.getePayRate() * 1.05) * 40;
                    weeklyPay += ((this.getePayRate() * 1.05) * 1.5) * overtime;
                }
                break;
            case 3:
                if(this.iseSalary() || overtime <= 0) {
                    weeklyPay = hoursIn * (this.getePayRate() * 1.1);
                }
                else {
                    weeklyPay = (this.getePayRate() * 1.1) * 40;
                    weeklyPay += ((this.getePayRate() * 1.1) * 1.5) * overtime;
                }
                break;
            default:
                if(this.iseSalary() || overtime <= 0) {
                    weeklyPay = hoursIn * this.getePayRate();
                }
                else {
                    weeklyPay = this.getePayRate() * 40;
                    weeklyPay += (this.getePayRate() * 1.5) * overtime;
                }
                break;
        }

        // print information
        System.out.println(this.geteName() + " earned $" + (weeklyPay) + " this week.");
        System.out.println("");
    }

    public void display()
    {
        System.out.println(this.eName);
        System.out.println(this.getePosition() + "  Is salary: " + this.iseSalary() + "  Shift: " + this.geteShift());
        System.out.println("Rate of pay: $" + this.getePayRate() + " per hour.");
    }
}
