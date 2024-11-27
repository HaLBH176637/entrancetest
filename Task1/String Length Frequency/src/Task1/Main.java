package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = getIntInRange("Please enter a valid positive integer: ", 1, 1000, sc);

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        Utility util = new Utility();
        List<String> result = util.mostFrequentLengths(strings);

        System.out.println("\nInput Strings: " + Arrays.toString(strings));
        System.out.println("Strings with the most frequent length: " + result);
    }

    public static int getIntInRange(String msg, int min, int max, Scanner sc) {
        int result = 0;
        do {
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.println("Number must be between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println(msg);
            }
        } while (true);
    }
}
