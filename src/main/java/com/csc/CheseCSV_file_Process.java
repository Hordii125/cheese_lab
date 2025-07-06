package com.csc;

public class CheseCSV_file_Process {
    public static void main(String[] args) {
        CheeseCSV_file_Reader reader = new CheeseCSV_file_Reader("cheese_data.csv");
        CheeseList cheeseList = reader.readCheeses();

        System.out.println("Number of cheeses: " + cheeseList.numberOfCheeses());
        System.out.println("Number of pasteurized cheeses: " + cheeseList.getnumberOfPasteurizedCheeses());
        System.out.println("Number of raw cheeses: " + cheeseList.getnumberOfRawCheeses());


        String Out = Integer.toString(cheeseList.numberOfCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfPasteurizedCheeses()) + "\n" +
                      Integer.toString(cheeseList.getnumberOfRawCheeses()) + "\n" +
                      "Placeholder for number of organic cheeses with moisture content more than 41%: " + "\n" +
                      "Most popular milk type in Canada: " + "\n";

        CheeseCSV_file_Writer writer = new CheeseCSV_file_Writer("cheese_data_out.csv");
        writer.writeToFile(Out);    
    }
}
