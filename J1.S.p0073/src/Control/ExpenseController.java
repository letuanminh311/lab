package Control;

import Model.Expense;
import ViewModel.InputData;
import ViewModel.ViewExpense;

import java.util.List;

public class ExpenseController {
    ExpenseManager expenseManager = new ExpenseManager();
    ViewExpense viewExpense = new ViewExpense();
    InputData inp = new InputData();

    // Add an expense
    public void addExpense() {
        viewExpense.displayMessage("-------- Add an expense --------");
        String date = inp.inputDate("Enter Date (dd-MMM-yyyy): ");
        double amount = inp.inputDouble("Enter Amount: ", Common.Constant.REGAMOUNT);
        String content = inp.inputString("Enter Content: ", Common.Constant.REGCONTENT);

        expenseManager.addExpense(date, amount, content);
        viewExpense.displayMessage("Expense added successfully.");
    }

    // Display all expenses
    public void displayAllExpenses() {
        List<Expense> expenses = expenseManager.getAllExpenses();
        if (expenses.isEmpty()) {
            viewExpense.displayMessage("No expenses available.");
        } else {
            viewExpense.displayExpenseList(expenses);
            viewExpense.displayTotal(expenseManager.getTotalExpenses());
        }
    }

    // Delete an expense
    public void deleteExpense() {
        viewExpense.displayMessage("-------- Delete an expense --------");
        int id = inp.inputInteger("Enter ID: ", "\\d+");

        if (expenseManager.deleteExpense(id)) {
            viewExpense.displayMessage("Expense deleted successfully.");
        } else {
            viewExpense.displayMessage("Expense ID is not available.");
        }
    }
}
