package com.csc;

public class CheseCSV_file_Process {
    public static void main(String[] args) {
        CheeseCSV_file_Reader reader = new CheeseCSV_file_Reader("cheese_data.csv");
        CheeseList cheeseList = reader.readCheeses();

        String Out = Integer.toString(cheeseList.numberOfCheeses());

        CheeseCSV_file_Writer writer = new CheeseCSV_file_Writer("cheese_data_out.csv");
        writer.writeToFile(Out);    
    }
}
