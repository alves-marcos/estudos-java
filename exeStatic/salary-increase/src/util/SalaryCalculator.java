package util;

public class SalaryCalculator {

    public static double calculatorSalary(double salary, double percentage){

        return salary + (salary * (percentage/100));
    }
}
