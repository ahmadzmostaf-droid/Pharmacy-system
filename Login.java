import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Pharmacy Login System ---");
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if(user.equals("admin") && pass.equals("123")) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}