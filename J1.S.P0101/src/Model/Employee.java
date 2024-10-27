package Model;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String dob;
    private String sex;
    private double salary;
    private String agency;

    public Employee(int id, String firstName, String lastName, String phone, String email,
                    String address, String dob, String sex, double salary, String agency) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.sex = normalizeSex(sex);
        this.salary = salary;
        this.agency = agency;
    }

    private String normalizeSex(String sex) {
        String normalizedSex = sex.trim().toLowerCase();
        if (normalizedSex.equals("m") || normalizedSex.equals("male")) {
            return "Male";
        } else if (normalizedSex.equals("f") || normalizedSex.equals("female")) {
            return "Female";
        } else {
            return "Unknown";
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getDob() { return dob; }
    public String getSex() { return sex; }
    public double getSalary() { return salary; }
    public String getAgency() { return agency; }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-10s %-20s %-20s %-12s %-6s %-10.2f %-10s",
                id, getFullName(), phone, email, address, dob, sex, salary, agency);
    }
}
