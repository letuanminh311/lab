package Common;

public class Constant {
    public final static String REGDATE = "\\d{2}-\\w{3}-\\d{4}";  // Date format: dd-MMM-yyyy
    public final static String REGAMOUNT = "[1-9][0-9]*\\.?[0-9]*";  // Amount of money must be a positive number
    public final static String REGCONTENT = "[\\w\\s]+";  // Content must be non-empty
}
