package Control;

import Model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenseList;
    private int nextId;

    public ExpenseManager() {
        expenseList = new ArrayList<>();
        nextId = 1;
    }

    public boolean addExpense(String date, double amount, String content) {
        expenseList.add(new Expense(nextId++, date, amount, content));
        return true;
    }

    public List<Expense> getAllExpenses() {
        return expenseList;
    }

    public boolean deleteExpense(int id) {
        for (Expense exp : expenseList) {
            if (exp.getId() == id) {
                expenseList.remove(exp);
                return true;
            }
        }
        return false;
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense exp : expenseList) {
            total += exp.getAmount();
        }
        return total;
    }
}
