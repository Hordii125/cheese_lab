package com.csc;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseCSV_file_Reader {
    private String filePath;
    private CheeseCSV_file_Parser parser = new CheeseCSV_file_Parser();
    private CheeseCSV_file_RowCleaner rowCleaner = new CheeseCSV_file_RowCleaner();

    public CheeseCSV_file_Reader(String FileName) {
        this.filePath = FileName;
    }

    public CheeseList readCheeses() {
        CheeseList cheeseList = new CheeseList();
        try  {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                
                Cheese cheese = parseCheese(line);
                cheeseList.addCheese(cheese);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cheeseList;
    }

    private Cheese parseCheese(String line) {
        String cleanedLine = rowCleaner.cleanRow(line);
        Cheese cheeseId = parser.parse(cleanedLine);  
        return cheeseId;
    }
}
