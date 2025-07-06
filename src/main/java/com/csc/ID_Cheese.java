package com.csc;

public class ID_Cheese {
    public String cheeseID(String line) {
        String [] parts = line.split(",");    
        if (parts.length < 1) {
            throw new IllegalArgumentException("Input line must contain at least one part separated by a comma.");
        }
        String cheeseIdPart = parts[0].trim();
        if (cheeseIdPart.isEmpty()) {
            return "Cheese ID Not Specified";
        }

        return cheeseIdPart;
    }
}
