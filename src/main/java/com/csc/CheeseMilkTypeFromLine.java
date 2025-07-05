package com.csc;

public class CheeseMilkTypeFromLine {
    public String getMilkType(String line) {
        // Split the line by commas
        String[] parts = line.split(",");
        
        // Check if the line has enough parts to extract the milk type
        if (parts.length > 4) {
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].trim().equals("Raw Milk")) {
                    return "Raw Milk";
                } else if (parts[i].trim().equals("Pasteurized")) {
                    return "Pasteurized";
                }
            }
            return "Unknown Milk Type";
        } else {
            // If not enough parts, return an empty string or handle as needed
            return "Row is too short to determine milk type. Please check the data.";
        }
    }
}
