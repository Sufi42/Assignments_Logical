package com.assignments.employeewage;

public class EmployeeWage {
    final int WAGE_PER_HOUR = 20;
    final int MAX_WORKING_DAYS = 20;
    final int FULL_TIME = 8;
    final int PART_TIME = 4;
    static EmployeeWage e = new EmployeeWage();

     static int emptype;
    private boolean CalculateDailyWage;

    public static int main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        System.out.println(e.CalculateDailyWage);
        System.out.println();
        return 0;
    }

    static int Emptype(int emptype){
        return (int)(Math.random()*100)%3;
    }
    static int dailyempwage(int emptype){
        switch(emptype){
            case 1:
                return 8;
            case 2:
                return 4;

            default:
                return 0;
        }
    }
    public static int CalculateDailyWage(){
        return dailyempwage(emptype)*20;

    }
}
