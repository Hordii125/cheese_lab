package com.csc;

public class Cheese {
    private String cheeseId;
    public String miklType;
    public String organicOrNot;
    public String moistureContentMoreThan41;
    public String mostPopularMilkType;
    
    Cheese (String ID, String milkType, String organicOrNot, String moistureContentMoreThan41, String mostPopularMilkType) {
        this.cheeseId = ID;
        this.miklType = milkType;
        this.organicOrNot = organicOrNot;
        this.moistureContentMoreThan41 = moistureContentMoreThan41;
        this.mostPopularMilkType = mostPopularMilkType;
    }

    public String getMilkType() {
        return miklType;
    }

    public String isOrganicOrNot() {
        return organicOrNot;
    }

    public String isMoistureContentMoreThan41() {
        return moistureContentMoreThan41;
    }

    public String getCheeseId() {
        return cheeseId;
    }

    public String getMostPopularMilkType() {
        return mostPopularMilkType;
    }
}
