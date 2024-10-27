package Common;

public class Constant {
    public final static String REGDATE = "\\d{2}/\\d{2}/\\d{4}";  // Date format: dd/MM/yyyy
    public final static String REGSALARY = "[1-9][0-9]*\\.?[0-9]*";
    public final static String REGNAME = "[\\w\\s]+";
    public final static String REGPHONE = "^(\\d{10}|\\d{3}[-\\.\\s]?\\d{3}[-\\.\\s]?\\d{4}(?:\\s?[xX]\\d{1,5})?)$";
    public final static String REGEMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
}
