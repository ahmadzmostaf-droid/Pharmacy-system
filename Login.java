import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("   PHARMACY MANAGEMENT SYSTEM       ");
        System.out.println("====================================");
        
        System.out.print("Enter Username: ");
        String user = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = scanner.nextLine();

        // استخدام equalsIgnoreCase للأمان، و equals للباسورد للدقة
        if(user.equalsIgnoreCase("admin") && pass.equals("123")) {
            System.out.println("\n[SUCCESS] Welcome, Administrator.");
            System.out.println("Accessing Pharmacy Dashboard...");
        } else {
            System.out.println("\n[ERROR] Invalid credentials. Access Denied.");
        }
        
        scanner.close(); // إضافة إغلاق السكنر (ممارسة برمجية جيدة)
    }
}