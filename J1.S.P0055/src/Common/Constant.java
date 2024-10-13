package Common;

public class Constant {
    public final static String REGCODE = "[\\w]+";  // Mã bác sĩ phải là chuỗi ký tự không rỗng
    public final static String REGNAME = "(?=.*[A-Za-z])[\\w\\s\\.#]+";  // Tên bác sĩ phải có ít nhất một ký tự chữ cái
    public final static String REGSPECIALIZATION = "(?=.*[A-Za-z])[\\w\\s]+";  // Chuyên môn phải có ít nhất một chữ cái
    public final static String REGAVAILABILITY = "[1-9][0-9]*";  // Availability phải là số nguyên dương
}
