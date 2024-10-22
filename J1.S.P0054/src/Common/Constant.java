package Common;

public class Constant {
    public final static String REGPHONE = "^(\\d{10}|\\d{3}[-\\.\\s]?\\d{3}[-\\.\\s]?\\d{4}(?:\\s?[xX]\\d{1,5})?)$";
    public final static String REGNAME = "[\\w\\s]+"; // Tên phải là chuỗi không rỗng
    public final static String REGGROUP = "[\\w\\s]+";
    public final static String REGADDRESS = "[\\w\\s]+";
}
