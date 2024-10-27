package Control;

import Model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public boolean addEmployee(int id, String firstName, String lastName, String phone, String email,
                               String address, String dob, String sex, double salary, String agency) {
        if (isDuplicateId(id)) return false;  // Kiểm tra ID trùng lặp trước khi thêm
        employees.add(new Employee(id, firstName, lastName, phone, email, address, dob, sex, salary, agency));
        return true;
    }

    public boolean isDuplicateId(int id) {
        return employees.stream().anyMatch(emp -> emp.getId() == id);
    }

    public Employee findEmployeeById(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
    }

    public List<Employee> searchEmployeeByName(String name) {
        name = name.trim().toLowerCase();  // Chuẩn hóa chuỗi tìm kiếm
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            String fullName = emp.getFullName().trim().toLowerCase();
            if (fullName.contains(name)) {
                result.add(emp);
            }
        }
        return result;
    }

    public boolean deleteEmployee(int id) {
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            employees.remove(emp);
            return true;
        }
        return false;
    }

    public void sortEmployeesBySalary() {
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
