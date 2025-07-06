package com.csc;

// 0 means organic, 1 means not organic

public class OrganicCheeses {
    public boolean OrganicCheese(String line) {
        // Split the line by commas
        String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

        // Check if the line has enough parts to extract the organic status
        if (parts.length > 4) {
            // Check if the organic status is "Organic"
            if (parts[6].trim().equalsIgnoreCase("0")) {
                return true;
            } else {
                return false;
            }
        } else {
            // If not enough parts, return an empty string or handle as needed
            return false;
        }
    }
}
