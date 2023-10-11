
package com.mycompany.mineros;


public class Worker {

    private String name;
    private String ID;
    private int hoursWorked;

    public Worker(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.hoursWorked = 0;
    }

    public void recordWorkday(int hours, String startDate, String endDate) {
        if (hours < 8) {
            System.out.println("You must work at least 8 hours a day.");
        } else {
            this.hoursWorked += hours;
            System.out.println("Workday recorded successfully.");
        }
    }

    public void generateMissingHoursAlert() {
        if (this.hoursWorked < 8) {
            int missingHours = 8 - this.hoursWorked;
            System.out.println("You are missing " + missingHours + " hours to complete.");
        }
    }

    void takeLeave(int daysOff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

 class Novelty {
    public void takeLeave(int days) {
        if (days >= 1 && days <= 20) {
            System.out.println(days + " days of leave have been taken.");
        } else {
            System.out.println("You cannot take more than 20 days of leave.");
        }
    }

    public void takeVacation(int days) {
        if (days >= 1 && days <= 15) {
            System.out.println(days + " days of vacation have been taken.");
        } else {
            System.out.println("You cannot take more than 15 days of vacation.");
        }
    }

    public void takePermissions(int hours) {
        if (hours >= 1 && hours <= 5) {
            System.out.println(hours + " hours of permissions have been taken.");
        } else {
            System.out.println("You cannot take more than 5 hours of permissions.");
        }
    }
}

 class License {
    private int daysTaken;
    private String type;

    public License(String type) {
        this.type = type;
        this.daysTaken = 0;
    }

    public void takeDays(int days) {
        if ("Temporary".equals(type)) {
            if (days >= 1 && days <= 4) {
                this.daysTaken += days;
                System.out.println(days + " days of temporary leave have been taken.");
            } else {
                System.out.println("You cannot take more than 4 days of temporary leave.");
            }
        } else if ("Maternity".equals(type)) {
            if (days + this.daysTaken <= 180) {
                this.daysTaken += days;
                System.out.println(days + " days of maternity leave have been taken.");
            } else {
                System.out.println("You cannot take more than 180 days of maternity leave.");
            }
        } else if ("Paternity".equals(type)) {
            if (days + this.daysTaken <= 15) {
                this.daysTaken += days;
                System.out.println(days + " days of paternity leave have been taken.");
            } else {
                System.out.println("You cannot take more than 15 days of paternity leave.");
            }
        }
    }
}



    
   
    
    

