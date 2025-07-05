package com.csc;

public class Cheese {
    private String cheeseId;
    public String numberOfPasteurizedCheeses;
    public String numberOfRawCheeses;
    public String numberOfOrganicCheesesMoistMoreThan41;
    public String theMostPopularMilkCanada;
    
    

    Cheese (String ID, String numberOfPasteurizedCheeses, String numberOfRawCheeses, 
            String numberOfOrganicCheesesMoistMoreThan41, String theMostPopularMilkCanada) {
        this.cheeseId = ID;
        this.numberOfPasteurizedCheeses = numberOfPasteurizedCheeses;
        this.numberOfRawCheeses = numberOfRawCheeses;
        this.numberOfOrganicCheesesMoistMoreThan41 = numberOfOrganicCheesesMoistMoreThan41;
        this.theMostPopularMilkCanada = theMostPopularMilkCanada;
    }
}
