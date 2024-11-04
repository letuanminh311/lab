import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ebank {

    // Kiểm tra số tài khoản (Account number)
    public static String checkAccountNumber(String accountNumber, ResourceBundle bundle) {
        if (!Pattern.matches(Constant.ACCOUNT_NUMBER_REGEX, accountNumber)) {
            return bundle.getString("account_error");
        }
        return null;  // null nếu số tài khoản hợp lệ
    }

    // Kiểm tra mật khẩu (Password)
    public static String checkPassword(String password, ResourceBundle bundle) {
        if (!Pattern.matches(Constant.PASSWORD_REGEX, password)) {
            return bundle.getString("password_error"); // hoặc password_format_error tùy theo quy tắc mà bạn muốn
        }
        return null;  // null nếu mật khẩu hợp lệ
    }

    // Tạo mã captcha ngẫu nhiên
    public static String generateCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder captcha = new StringBuilder();
        Random rnd = new Random();
        while (captcha.length() < 5) {
            int index = (int) (rnd.nextFloat() * chars.length());
            captcha.append(chars.charAt(index));
        }
        return captcha.toString();
    }

    // Kiểm tra mã captcha
    public static String checkCaptcha(String captchaInput, String captchaGenerated, ResourceBundle bundle) {
        if (!captchaInput.trim().toLowerCase().contains(captchaGenerated.toLowerCase())) {
            return bundle.getString("captcha_error");
        }
        return null;  // null nếu captcha hợp lệ
    }


    // Thực hiện chức năng đăng nhập
    public static void login(ResourceBundle bundle, Scanner sc) {
        String accountError, passwordError, captchaError;
        String captchaGenerated;

        // Nhập số tài khoản
        do {
            System.out.print(bundle.getString("account_prompt"));
            String accountNumber = sc.next();
            accountError = checkAccountNumber(accountNumber, bundle);
            if (accountError != null) {
                System.out.println(accountError);
            }
        } while (accountError != null);

        // Nhập mật khẩu
        do {
            System.out.print(bundle.getString("password_prompt"));
            String password = sc.next();
            passwordError = checkPassword(password, bundle);
            if (passwordError != null) {
                System.out.println(passwordError);
            }
        } while (passwordError != null);

        // Tạo và hiển thị captcha
        captchaGenerated = generateCaptcha();
        System.out.println(bundle.getString("captcha_display") + ": " + captchaGenerated);

        // Kiểm tra mã captcha
        do {
            System.out.print(bundle.getString("captcha_prompt"));
            String captchaInput = sc.next();
            captchaError = checkCaptcha(captchaInput, captchaGenerated, bundle);
            if (captchaError != null) {
                System.out.println(captchaError);
            }
        } while (captchaError != null);

        System.out.println(bundle.getString("login_success"));  // Đăng nhập thành công
    }
}

