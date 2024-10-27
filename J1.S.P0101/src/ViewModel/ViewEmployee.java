package ViewModel;

import Model.Employee;
import java.util.List;

public class ViewEmployee {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        System.out.println("======= Employee Management System =======");
        System.out.println("1. Add an employee");
        System.out.println("2. Update an employee");
        System.out.println("3. Delete an employee");
        System.out.println("4. Search employees by name");
        System.out.println("5. Display employees sorted by salary");
        System.out.println("6. Quit");
        System.out.println("==========================================");
    }

    public void displayEmployeeList(List<Employee> employees) {
        System.out.printf("%-5s %-15s %-10s %-25s %-20s %-12s %-5s %-10s %-10s\n",
                "ID", "Full Name", "Phone", "Email", "Address", "DOB", "Sex", "Salary", "Agency");
        for (Employee emp : employees) {
            System.out.printf("%-5s %-15s %-10s %-25s %-20s %-12s %-5s %-10s %-10s\n",
                    emp.getId(),
                    emp.getFullName(),
                    emp.getPhone(),
                    emp.getEmail(),
                    emp.getAddress(),
                    emp.getDob(),
                    emp.getSex(),
                    emp.getSalary(),
                    emp.getAgency());
        }
    }

    public void displayPhoneFormat() {
        System.out.println("• 1234567890");
        System.out.println("• 123-456-7890");
        System.out.println("• 123-456-7890 x1234");
        System.out.println("• 123-456-7890 ext1234");
        System.out.println("• (123)-456-7890");
        System.out.println("• 123.456.7890");
        System.out.println("• 123 456 7890");
    }
}
