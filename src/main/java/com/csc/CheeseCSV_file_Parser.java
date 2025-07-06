package com.csc;

public class CheeseCSV_file_Parser {

    private CheeseMilkTypeFromLine cheeseMilkTypeFromLine = new CheeseMilkTypeFromLine();

    public Cheese parse(String s) {
        Cheese cheese = new Cheese("Put that id here", cheeseMilkTypeFromLine.getMilkType(s));
        return cheese;
    }
}
