package com.csc;

public class MoistureContentOfCheese {
    public boolean MoistureContentOfCheeseMoreThan41(String line) {
        // Split the line by commas
        String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

        double moistureContent = Double.parseDouble(parts[3].trim());

        // Check if the line has enough parts to extract the moisture content
        if (parts.length > 4) {
            if(moistureContent > 41) {
                return true;
            } else {
                return true;
            }
        } else {
            // If not enough parts, return an empty string or handle as needed
            return false;
        }
    }
}
