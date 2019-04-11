package com.taxcalculator;

public class Taxcalculator {
    private double salary;
    double tax =0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double Taxcal(){
        if(this.getSalary() <= 200000){
            tax = (this.getSalary() *12) * 0.01;
        }
        else if (this.getSalary() > 200000 && this.getSalary() <= 350000){
            tax = ((this.getSalary() *12) * 0.01) + (((this.getSalary() *12) - 200000)*0.15);
        }
        else  if(this.getSalary() > 350000){
            tax = (24500 + (((this.getSalary() *12) - 350000)*0.25));
        }
        return tax;

    }
}



