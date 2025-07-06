package com.csc;

public class OrganicWithMoreThan41MoistCheese {

    public String isOrganicOrNot(String Line) {
        String [] parts = Line.split(",");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Input line must contain at least two parts separated by a comma.");
        }

        String organicPart = parts[6].trim();
        if (organicPart.equalsIgnoreCase("1")) {
            return "Organic";
        } else if (organicPart.equalsIgnoreCase("0")) {
            return "Not Organic";
        } else {
            return "Unknown Organic Status";
        }
    }

    public String isMoistureContentMoreThan41(String Line) {
        String [] parts = Line.split(",");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Input line must contain at least two parts separated by a comma.");
        }

        String moistureContentPart = parts[3].trim();

        if (moistureContentPart.isEmpty()) {
            return "Moisture Content Not Specified";
        }
        
        try {
            double moistureContent = Double.parseDouble(moistureContentPart);
            if (moistureContent > 41.0) {
                return "More than 41% Moisture Content";
            } else {
                return "Less than or equal to 41% Moisture Content";
            }
        } catch (NumberFormatException e) {
            return "Invalid Moisture Content Value";
        }
    }
}
