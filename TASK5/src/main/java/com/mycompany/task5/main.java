/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task5;

/**
 *
 * @author User
 */
import java.util.Scanner;

        public class main{
public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
    try (Scanner scanner = new Scanner(System.in)) {
        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    system.addStudent(new Student(name, rollNumber, grade));
                    System.out.println("Student added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter roll number to remove: ");
                    int rollToRemove = scanner.nextInt();
                    scanner.nextLine();
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully!");
                }
                case 3 -> {
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    scanner.nextLine();
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                }
                case 4 -> {
                    System.out.println("All students:");
                    system.displayAllStudents();
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
    }
}
        
