package ViewModel;

import Model.Expense;

import java.util.List;

public class ViewExpense {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.println("=================================");
    }

    public void displayExpenseList(List<Expense> expenses) {
        System.out.println("---------Display all expenses------------");
        System.out.printf("%-5s %-15s %-10s %-15s\n", "ID", "Date", "Amount", "Content");
        for (Expense exp : expenses) {
            System.out.println(exp);
        }
    }

    public void displayTotal(double total) {
        System.out.println("Total: " + total);
    }
}
