package com.csc;

public class CheseCSV_file_Process {
    public static void main(String[] args) {
        CheeseCSV_file_Reader reader = new CheeseCSV_file_Reader("cheese_data.csv");
        CheeseList cheeseList = reader.readCheeses();

        // For quick check through the console
        System.out.println("Number of cheeses: " + cheeseList.numberOfCheeses());
        System.out.println("Number of pasteurized cheeses: " + cheeseList.getnumberOfPasteurizedCheeses());
        System.out.println("Number of raw cheeses: " + cheeseList.getnumberOfRawCheeses());
        System.out.println("Number of organic cheeses with more than 41% moisture content: " + cheeseList.getnumberOfOrganicCheesesMoistMoreThan41());
        System.out.println("Most popular milk type: " + cheeseList.getMostPopularMilkType());


        String Out = Integer.toString(cheeseList.numberOfCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfPasteurizedCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfRawCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfOrganicCheesesMoistMoreThan41()) + "\n" +
                      cheeseList.getMostPopularMilkType() + "\n";

        CheeseCSV_file_Writer writer = new CheeseCSV_file_Writer("cheese_data_out.csv");
        writer.writeToFile(Out);    
    }
}
