package com.csc;

public class Cheese {
    private String cheeseId;
    public String miklType;
    public String OrganicOrNot;
    public String moistureContentMoreThan41;
    
    Cheese (String ID, String milkType, String organicOrNot, String moistureContentMoreThan41) {
        this.cheeseId = ID;
        this.miklType = milkType;
        this.OrganicOrNot = organicOrNot;
        this.moistureContentMoreThan41 = moistureContentMoreThan41;
    }
}
