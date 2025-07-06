package com.csc;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public int getnumberOfPasteurizedCheeses(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            if ("Pasteurized".equals(cheese.miklType.trim())) {
                count++;
            }
        }
        return count;
    }

    public int getnumberOfRawCheeses(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            if ("Raw Milk".equals(cheese.miklType.trim())) {
                count++;
            }
        }
        return count;
    }

    public int getnumberOfOrganicCheesesMoistMoreThan41(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            // Assuming we have a method to check moisture content
            // This is a placeholder condition, replace with actual logic
            if (cheese.OrganicOrNot && cheese.moistureContentMoreThan41) {
                count++;
            }
        }
        return count;
    }
/*
    public int getnumberOfOrganicCheesesMoistMoreThan41(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.numberOfOrganicCheesesMoistMoreThan41 == "whatever condition") {
                count++;
            }
        }
        return count;
    }

    public String getTheMostPopularMilkCanada() {
        // This method should return the most popular milk type in Canada
        // For now, we will return a placeholder value
        return "Placeholder for most popular milk type in Canada";
    }
    */
}
