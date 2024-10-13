import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    // Kiểm tra số điện thoại
    public static String checkPhone(String phone) {
        if (!phone.matches("\\d+")) {
            return "Phone number must is number";
        } else if (!phone.matches(Constant.PHONE_REGEX)) {
            return "Phone number must be 10 digits";
        }
        return "";
    }

    // Kiểm tra email
    public static String checkEmail(String email) {
        Pattern pattern = Pattern.compile(Constant.EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            return "Email must is correct format";
        }
        return "";
    }

    // Kiểm tra ngày tháng
    public static String checkDate(String date) {
        if (!date.matches(Constant.DATE_REGEX)) {
            return "Date to correct format(dd/MM/yyyy)";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
        return "";
    }
}
