import java.util.Scanner;

public class AddMedicine {
    public static void main(String\[ args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Pharmacy System: Add Medicine (KAN-2) ---");
        System.out.print("Enter Medicine Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Unit Price: ");
        double price = scanner.nextDouble();
        
        System.out.println("\\n[DONE] Medicine '" + name + "' added successfully!");
    }
}