package com.csc;

public class OrganicWithMoreThan41MoistCheese {
    private boolean OrganicOrNot;
    private boolean moistureContentMoreThan41;

    public OrganicWithMoreThan41MoistCheese(boolean organicOrNot, boolean moistureContentMoreThan41) {
        this.OrganicOrNot = organicOrNot;
        this.moistureContentMoreThan41 = moistureContentMoreThan41;
    }

    public boolean isOrganicOrNot(String Line) {
        return OrganicOrNot;
    }

    public boolean isMoistureContentMoreThan41(String Line) {
        return moistureContentMoreThan41;
    }
}
