import java.util.Scanner;

public class SearchMedicine {
    public static void main(String[] args) {
        // مصفوفة تجريبية بالأدوية المتوفرة في الصيدلية
        String[] medicines = {"Panadol", "Aspirin", "Vitamin C", "Profinal", "Amoxicillin"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Pharmacy System: Search Module ===");
        System.out.print("Enter medicine name to search: ");
        String query = scanner.nextLine();
        
        boolean isFound = false;
        for (String med : medicines) {
            if (med.equalsIgnoreCase(query)) {
                isFound = true;
                break;
            }
        }
        
        if (isFound) {
            System.out.println("[SUCCESS] " + query + " is available in our stock.");
        } else {
            System.out.println("[ERROR] Sorry, " + query + " was not found.");
        }
    }
}