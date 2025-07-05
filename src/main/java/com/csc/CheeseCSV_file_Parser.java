package com.csc;

public class CheeseCSV_file_Parser {

    private CheeseMilkTypeFromLine cheeseMilkTypeFromLine;

    public Cheese parse(String s) {
        Cheese cheese = new Cheese("Put that id here", cheeseMilkTypeFromLine.getMilkType(s));
        return cheese;
    }
}
