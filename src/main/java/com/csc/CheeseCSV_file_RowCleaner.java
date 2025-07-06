package com.csc;

public class CheeseCSV_file_RowCleaner {

    public String cleanRow(String line) {
        // 1. Split by commas that are NOT inside quotes
        String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

        // 2. Clean each field
        for (int i = 0; i < fields.length; i++) {
            fields[i] = fields[i].replace("\"", "").trim();
        }

        // 3. Rebuild the line as a clean CSV string
        return String.join(",", fields);
    }
}
