package com.csc;

public class Cheese {
    private String cheeseId;
    public String miklType;
    public boolean OrganicOrNot;
    public boolean moistureContentMoreThan41;
    
    Cheese (String ID, String milkType, boolean organicOrNot, boolean moistureContentMoreThan41) {
        this.cheeseId = ID;
        this.miklType = milkType;
        this.OrganicOrNot = organicOrNot;
        this.moistureContentMoreThan41 = moistureContentMoreThan41;
    }
}
