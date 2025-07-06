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

    public int getnumberOfOrganicCheesesMoistMoreThan41(){
        int count = 0;
        for (Cheese cheese : cheeses) {
            
            if (cheese.isOrganicOrNot() == "Organic" && cheese.isMoistureContentMoreThan41() == "More than 41% Moisture Content") {
                count++;
            }
        }
        return count;
    }
    
    public String getMostPopularMilkType() {
        int CowCounter = 0;
        int GoatCounter = 0;
        int eweCounter = 0;
        int buffaloCounter = 0;

        String mostPopularMilkTypeAnimal = "";

        for (Cheese cheese : cheeses) {
            String milkTypeAnimal = cheese.getMilkType();
            if (milkTypeAnimal == null || milkTypeAnimal.isEmpty()) {
                continue; // Skip if milk type is null or empty
            }

            if (milkTypeAnimal.equalsIgnoreCase("Cow")) {
                CowCounter++;
            } else if (milkTypeAnimal.equalsIgnoreCase("Goat")) {
                GoatCounter++;
            } else if (milkTypeAnimal.equalsIgnoreCase("Ewe")) {
                eweCounter++;
            } else if (milkTypeAnimal.equalsIgnoreCase("Buffalo")) {
                buffaloCounter++;
            } else {
                continue; // Skip if milk type is not recognized
            }
        }

        if (CowCounter >= GoatCounter && CowCounter >= eweCounter && CowCounter >= buffaloCounter) {
            mostPopularMilkTypeAnimal = "Cow";
        } else if (GoatCounter >= CowCounter && GoatCounter >= eweCounter && GoatCounter >= buffaloCounter) {
            mostPopularMilkTypeAnimal = "Goat";
        } else if (eweCounter >= CowCounter && eweCounter >= GoatCounter && eweCounter >= buffaloCounter) {
            mostPopularMilkTypeAnimal = "Ewe";
        } else {
            mostPopularMilkTypeAnimal = "Buffalo";
        }

        return mostPopularMilkTypeAnimal;
    }
}
