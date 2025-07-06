package com.csc;

public class MilkTypeAnimalCheese {
    
    public String getMilkTypeAnimalCheese(String line) {
        String [] parts = line.split(",");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Input line must contain at least two parts separated by a comma.");
        }
        String milkTypeAnimal = parts[8].trim();

        if (milkTypeAnimal.isEmpty()) {
            return "Unknown";
        }

        return milkTypeAnimal;
    }
}
