package Control;

import Model.Employee;
import ViewModel.InputData;
import ViewModel.ViewEmployee;

public class EmployeeController {
    EmployeeManager employeeManager = new EmployeeManager();
    ViewEmployee view = new ViewEmployee();
    InputData input = new InputData();

    public void addEmployee() {
        view.displayMessage("-------- Add an Employee --------");

        int id;
        while (true) {
            id = input.inputInteger("Enter Employee ID: ", "\\d+");
            if (!employeeManager.isDuplicateId(id)) {
                break;
            } else {
                view.displayMessage("This ID already exists. Please enter a different ID.");
            }
        }

        String firstName = input.inputString("Enter First Name: ", Common.Constant.REGNAME);
        String lastName = input.inputString("Enter Last Name: ", Common.Constant.REGNAME);

        // Hiển thị các định dạng số điện thoại và lấy đầu vào
        String phone;
        while (true) {
            phone = input.inputPhone("Enter Phone: ");
            if (phone.matches(Common.Constant.REGPHONE)) {
                break;
            } else {
                view.displayMessage("Invalid phone format. Please follow the guidelines.");
                view.displayPhoneFormat();
            }
        }

        String email = input.inputString("Enter Email: ", Common.Constant.REGEMAIL);
        String address = input.inputString("Enter Address: ", Common.Constant.REGNAME);
        String dob = input.inputString("Enter DOB (dd/MM/yyyy): ", Common.Constant.REGDATE);

        // Nhập và chuẩn hóa giới tính
        String sex;
        while (true) {
            sex = input.inputString("Enter Sex (M/F or Male/Female): ", ".*").toLowerCase();
            if (sex.equals("m") || sex.equals("male") || sex.equals("f") || sex.equals("female")) {
                break;
            } else {
                view.displayMessage("Invalid input. Please enter M, F, Male, or Female.");
            }
        }

        double salary = input.inputDouble("Enter Salary: ", Common.Constant.REGSALARY);
        String agency = input.inputString("Enter Agency: ", Common.Constant.REGNAME);

        if (employeeManager.addEmployee(id, firstName, lastName, phone, email, address, dob, sex, salary, agency)) {
            view.displayMessage("Employee added successfully.");
        } else {
            view.displayMessage("Failed to add employee due to duplicate ID.");
        }
    }

    public void updateEmployee() {
        view.displayMessage("-------- Update an Employee --------");
        int id = input.inputInteger("Enter Employee ID: ", "\\d+");
        Employee emp = employeeManager.findEmployeeById(id);

        if (emp != null) {
            emp.setFirstName(input.inputString("Enter New First Name: ", Common.Constant.REGNAME));
            emp.setLastName(input.inputString("Enter New Last Name: ", Common.Constant.REGNAME));

            String phone;
            while (true) {
                phone = input.inputPhone("Enter New Phone: ");
                if (phone.matches(Common.Constant.REGPHONE)) {
                    emp.setPhone(phone);
                    break;
                } else {
                    view.displayMessage("Invalid phone format. Please follow the guidelines.");
                    view.displayPhoneFormat();
                }
            }

            emp.setEmail(input.inputString("Enter New Email: ", Common.Constant.REGEMAIL));
            emp.setSalary(input.inputDouble("Enter New Salary: ", Common.Constant.REGSALARY));

            // Cập nhật giới tính
            String sex;
            while (true) {
                sex = input.inputString("Enter New Sex (M/F or Male/Female): ", ".*").toLowerCase();
                if (sex.equals("m") || sex.equals("male")) {
                    emp.setSex("Male");
                    break;
                } else if (sex.equals("f") || sex.equals("female")) {
                    emp.setSex("Female");
                    break;
                } else {
                    view.displayMessage("Invalid input. Please enter M, F, Male, or Female.");
                }
            }

            view.displayMessage("Employee updated successfully.");
        } else {
            view.displayMessage("Employee not found.");
        }
    }

    public void deleteEmployee() {
        view.displayMessage("-------- Delete an Employee --------");
        int id = input.inputInteger("Enter Employee ID: ", "\\d+");

        if (employeeManager.deleteEmployee(id)) {
            view.displayMessage("Employee deleted successfully.");
        } else {
            view.displayMessage("Employee not found.");
        }
    }

    public void searchEmployee() {
        String name = input.inputString("Enter Employee Name: ", Common.Constant.REGNAME);
        view.displayEmployeeList(employeeManager.searchEmployeeByName(name));
    }

    public void displayEmployeesSortedBySalary() {
        employeeManager.sortEmployeesBySalary();
        view.displayEmployeeList(employeeManager.getAllEmployees());
    }
}
