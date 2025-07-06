package com.csc;

public class Cheese {
    private String cheeseId;
    public String miklType;
    
    Cheese (String ID, String milkType) {
        this.cheeseId = ID;
        this.miklType = milkType;
    }

    public String getMilkType() {
        return miklType;
    }
}
