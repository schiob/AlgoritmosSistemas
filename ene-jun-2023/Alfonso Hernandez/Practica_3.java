import java.util.Scanner;
public class Practica_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] medicines = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            medicines[i] = scanner.nextLine();
        }
        scanner.close();

        sortMedicines(medicines);

        for (String medicine : medicines) {
            System.out.println(medicine);
        }
    }

    private static void sortMedicines(String[] medicines) {
        for (int i = 0; i < medicines.length - 1; i++) {
            for (int j = i + 1; j < medicines.length; j++) {
                if (medicines[i].length() > medicines[j].length()) {
                    String temp = medicines[i];
                    medicines[i] = medicines[j];
                    medicines[j] = temp;
                }
            }
        }
    }
}