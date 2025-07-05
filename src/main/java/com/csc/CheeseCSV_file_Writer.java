package com.csc;

import java.io.File;
import java.io.FileOutputStream;

public class CheeseCSV_file_Writer {
    private String filePath;

    public CheeseCSV_file_Writer(String FileName) {
        this.filePath = FileName;
    }

    public void writeToFile(String content) {
        try (FileOutputStream out = new FileOutputStream(new File(filePath))) {
            byte [] StringBytes = content.getBytes();
            out.write(StringBytes);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
