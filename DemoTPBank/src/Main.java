import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    private static ResourceBundle bundle;

    // Set the locale for language switching
    public static void setLocate(String language, String country) {
        Locale locale = new Locale(language, country);
        bundle = ResourceBundle.getBundle("Language", locale);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------Login Program-------");
            System.out.println("1. Vietnamese");
            System.out.println("2. English");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    setLocate("vi", "VN");  // Chuyển ngôn ngữ sang tiếng Việt
                    break;
                case 2:
                    setLocate("en", "US");  // Chuyển ngôn ngữ sang tiếng Anh
                    break;
                case 3:
                    System.exit(0);         // Thoát chương trình
                default:
                    System.out.println("Invalid option, please select again.");
            }

            // Thực hiện chức năng đăng nhập
            if (choice == 1 || choice == 2) {
                Ebank.login(bundle, sc);
            }

        } while (choice != 3);
    }
}