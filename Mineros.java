package com.mycompany.mineros;

import java.util.ArrayList;
import java.util.Scanner;

public class Mineros {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   
    ArrayList<Worker> workers = new ArrayList<>();

    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Enter a workday");
        System.out.println("2. Enter a novelty");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                System.out.print("Worker's name: ");
                String name = scanner.nextLine();
                System.out.print("Worker's ID: ");
                String ID = scanner.nextLine();
                Worker worker = new Worker(name, ID);

                System.out.print("Worked hours: ");
                int hours = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Start date (yyyy-MM-dd HH:mm): ");
                String startDate = scanner.nextLine();
                System.out.print("End date (yyyy-MM-dd HH:mm): ");
                String endDate = scanner.nextLine();

                worker.recordWorkday(hours, startDate, endDate);
                worker.generateMissingHoursAlert();
                workers.add(worker);
                break;

            case 2:
                System.out.println("Types of novelties:");
                System.out.println("1. Leaves");
                System.out.println("2. Disabilities");
                System.out.println("3. Vacations");
                System.out.println("4. Permissions");
                System.out.print("Select a novelty type: ");
                int noveltyType = scanner.nextInt();
                scanner.nextLine();

                switch (noveltyType) {
                    case 1:
                        System.out.println("Types of leaves:");
                        System.out.println("1. Temporary");
                        System.out.println("2. Maternity");
                        System.out.println("3. Paternity");
                        System.out.print("Select a leave type: ");
                        int leaveType = scanner.nextInt();
                        scanner.nextLine();  

                        System.out.print("Days to take: ");
                        int days = scanner.nextInt();
                        scanner.nextLine(); 

                        if (leaveType == 1) {
                            License temporaryLeave = new License("Temporary");
                            temporaryLeave.takeDays(days);
                        } else if (leaveType == 2) {
                            License maternityLeave = new License("Maternity");
                            maternityLeave.takeDays(days);
                        } else if (leaveType == 3) {
                            License paternityLeave = new License("Paternity");
                            paternityLeave.takeDays(days);
                        }
                        break;

                    case 2:
                        System.out.print("Disability days: ");
                        int disabilityDays = scanner.nextInt();
                        scanner.nextLine(); 
                        Novelty disabilityNovelty = new Novelty();
                        disabilityNovelty.takeLeave(disabilityDays);
                        scanner.nextLine();
                        break;

                    case 3:
                        System.out.print("Vacation days: ");
                        int vacationDays = scanner.nextInt();
                        scanner.nextLine(); 
                        Novelty vacationNovelty = new Novelty();
                        vacationNovelty.takeVacation(vacationDays);
                        break;

                    case 4:
                        System.out.print("Permission hours: ");
                        int permissionHours = scanner.nextInt();
                        scanner.nextLine();
                        Novelty permissionNovelty = new Novelty();
                        permissionNovelty.takePermissions(permissionHours);
                        break;
                   
                }
                break;

            case 3:
                System.out.println("Exiting the program.");
                return;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        }
    }
}
