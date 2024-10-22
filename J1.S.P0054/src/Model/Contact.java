package Model;

public class Contact {
    private int id;
    private String fullname;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String fullname, String group, String address, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;

        // Tách họ và tên từ fullname: họ là từ đầu tiên, tên là từ cuối cùng
        String[] names = fullname.trim().split("\\s+"); // Tách các từ bằng khoảng trắng
        this.firstName = names[0]; // Lấy từ đầu tiên làm first name
        this.lastName = names[names.length - 1]; // Lấy từ cuối cùng làm last name
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s\t%s\t%s", id, fullname, firstName, lastName, group, address, phone);
    }
}
