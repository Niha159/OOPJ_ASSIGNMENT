import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class CollegeFees{

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> branch = new ArrayList<>();
        ArrayList<String> year = new ArrayList<>();
        ArrayList<Integer> management = new ArrayList<>();
        ArrayList<Integer> kea = new ArrayList<>();
        ArrayList<Integer> snq = new ArrayList<>();
        ArrayList<Integer> additionalFees = new ArrayList<>();

        // Reading data from file
        File file = new File("Fees.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String[] data = fileScanner.nextLine().split(",");
            branch.add(data[0].trim());
            year.add(data[1].trim());
            management.add(Integer.parseInt(data[2].trim()));
            kea.add(Integer.parseInt(data[3].trim()));
            snq.add(Integer.parseInt(data[4].trim()));
            additionalFees.add(Integer.parseInt(data[5].trim()));
        }
        fileScanner.close();

        // User input
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter branch name (e.g., Computer Science):");
        String inputBranch = inputScanner.nextLine().trim();

        // Display information for the branch
        boolean found = false;
        for (int i = 0; i < branch.size(); i++) {
            if (branch.get(i).equalsIgnoreCase(inputBranch)) {
                found = true;
                System.out.println("\nBranch: " + branch.get(i));
                System.out.println("Year: " + year.get(i));
                System.out.println("Management: " + management.get(i));
                System.out.println("KEA: " + kea.get(i));
                System.out.println("SNQ: " + snq.get(i));
                System.out.println("Additional Fees: " + additionalFees.get(i));
            }
        }

        if (!found) {
            System.out.println("Branch not found.");
        }
        inputScanner.close();
    }
}
