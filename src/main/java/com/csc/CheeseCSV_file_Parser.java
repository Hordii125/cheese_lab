package com.csc;

public class CheeseCSV_file_Parser {

    private CheeseMilkTypeFromLine cheeseMilkTypeFromLine = new CheeseMilkTypeFromLine();
    private OrganicCheeses organicCheeses = new OrganicCheeses();
    private MoistureContentOfCheese moistureContentOfCheese = new MoistureContentOfCheese();

    public Cheese parse(String s) {
        Cheese cheese = new Cheese("Put that id here", cheeseMilkTypeFromLine.getMilkType(s), organicCheeses.OrganicCheese(s), moistureContentOfCheese.MoistureContentOfCheeseMoreThan41(s));
        return cheese;
    }
}
