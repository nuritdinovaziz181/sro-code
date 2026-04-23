import java.util.Scanner;
import java.util.regex.*;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Email енгізіңіз: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Дұрыс email ✅");
        } else {
            System.out.println("Қате email ❌");
        }
    }
}