package com.csc;

public class CheseCSV_file_Process {
    public static void main(String[] args) {
        CheeseCSV_file_Reader reader = new CheeseCSV_file_Reader("cheese_data.csv");
        CheeseList cheeseList = reader.readCheeses();

        String Out = Integer.toString(cheeseList.numberOfCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfPasteurizedCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfRawCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfOrganicCheesesMoistMoreThan41()) + "\n" +
                      "Placeholder for most popular milk type in Canada"; // Placeholder

        CheeseCSV_file_Writer writer = new CheeseCSV_file_Writer("cheese_data_out.csv");
        writer.writeToFile(Out);    
    }
}
