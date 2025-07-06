package com.csc;

public class CheeseCSV_file_Parser {

    private CheeseMilkTypeFromLine cheeseMilkTypeFromLine = new CheeseMilkTypeFromLine();
    private OrganicWithMoreThan41MoistCheese organicWithMoreThan41MoistCheese = new OrganicWithMoreThan41MoistCheese();
    private ID_Cheese idCheese = new ID_Cheese();
    private MilkTypeAnimalCheese milkTypeAnimalCheese = new MilkTypeAnimalCheese();

    public Cheese parse(String s) {
        Cheese cheese = new Cheese(idCheese.cheeseID(s), cheeseMilkTypeFromLine.getMilkType(s), 
                                   organicWithMoreThan41MoistCheese.isOrganicOrNot(s), 
                                   organicWithMoreThan41MoistCheese.isMoistureContentMoreThan41(s), 
                                   milkTypeAnimalCheese.getMilkTypeAnimalCheese(s));
        return cheese;
    }
}
