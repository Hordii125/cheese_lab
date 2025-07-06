package com.csc;
import java.util.ArrayList;
import java.util.List;


public class CheeseCSV_file_RowCleaner {

    public String cleanRow(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                inQuotes = !inQuotes; // toggle quoted state
            } else if (c == ',' && !inQuotes) {
                result.add(current.toString().trim());
                current.setLength(0);
            } else {
                // remove commas inside quotes
                if (!(inQuotes && c == ',')) {
                    current.append(c);
                }
            }
        }
        // Add the last field
        result.add(current.toString().trim());

        return String.join(",", result);
    }
}
