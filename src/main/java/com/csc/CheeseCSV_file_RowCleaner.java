package com.csc;

public class CheeseCSV_file_RowCleaner {
    public String cleanRow(String row) {
        // Remove leading and trailing whitespace
        row = row.trim();
        // Replace multiple spaces with a single space
        row = row.replaceAll("\\s+", " ");
        // Remove any unwanted characters (e.g., quotes)
        row = row.replaceAll("[^\\w\\s,.-]", "");
        return row;
    }
}
