package com.csc;

public class MoistureContentOfCheese {
    public String getMoistureContent(String line) {
        // Split the line by commas
        String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

        double moistureContent = Double.parseDouble(parts[3].trim());

        // Check if the line has enough parts to extract the moisture content
        if (parts.length > 4) {
            if(moistureContent > 41) {
                return "Moisture content is more than 41%";
            } else {
                return "Moisture content is 41% or less";
            }
        } else {
            // If not enough parts, return an empty string or handle as needed
            return "Row is too short to determine moisture content. Please check the data.";
        }
    }
}
