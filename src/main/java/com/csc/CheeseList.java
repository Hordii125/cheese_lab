package com.csc;

import java.util.ArrayList;
import java.util.List;

public class CheeseList {
        ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public int getnumberOfPasteurizedCheeses(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.miklType == "Pasteurized") {
                count++;
            }
        }
        return count;
    }

    public int getnumberOfRawCheeses(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.miklType == "Raw Milk") {
                count++;
            }
        }
        return count;
    }

    /*public int getnumberOfOrganicCheesesMoistMoreThan41(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            
            if (cheese.OrganicOrNot && cheese.moistureContentMoreThan41) {
                count++;
            }
        }
        return count;
    }
    */
    public String getMostPopularMilkType() {
        // Placeholder for the most popular milk type logic
        return "Placeholder for most popular milk type in Canada";
    }
}
