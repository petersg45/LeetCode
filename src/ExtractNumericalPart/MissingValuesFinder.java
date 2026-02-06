package ExtractNumericalPart;

import java.util.*;

public class MissingValuesFinder {

    public static List<String> findMissing(String[] input) {
        Set<Integer> presentNumbers = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String prefix = "";

        // 1. Extract numbers and find min/max
        for (String s : input) {
            // Assuming format "prefix_number", extract the number part
            String[] parts = s.split("_");
            if (parts.length < 2) continue; // Skip invalid formats
            prefix = parts[0]; // Assuming the same prefix for all valid inputs

            try {
                int number = Integer.parseInt(parts[1]);
                presentNumbers.add(number);
                if (number < min) min = number;
                if (number > max) max = number;
            } catch (NumberFormatException e) {
                // Handle cases where the part after '_' isn't a valid integer
                System.err.println("Invalid number format in string: " + s);
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();
        // 2. Iterate from min to max and find missing numbers
        for (int i = min + 1; i < max; i++) {
            if (!presentNumbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        // 3. Format the missing numbers back into the original string format (e.g., "foo_")
        List<String> missingStrings = new ArrayList<>();
        for (int missingNum : missingNumbers) {
            missingStrings.add(prefix + "_" + missingNum);
        }

        // The user asked for values, we return the formatted strings
        // If only the numbers are needed, return missingNumbers
        // For this example, we return the formatted strings
        return missingStrings;
    }

    public static void main(String[] args) {
        String[] values = {"foo_1", "foo_2", "foo_8", "foo_4"};
        List<String> missing = findMissing(values);
        System.out.println("Missing values: " + missing); // Output might be [foo_3, foo_5, foo_6, foo_7]
    }
}
