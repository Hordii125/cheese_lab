package com.csc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RowCleanerTest {

    @Test
public void testCleanRow() {
    CheeseCSV_file_RowCleaner rowCleaner = new CheeseCSV_file_RowCleaner();

    String input = "242,NB,Farmstead,47.9,\"Sharp, lactic, lightly caramelized\",Uncooked,0,Semi-soft Cheese,Cow,Raw Milk,Washed Rind,Tomme Le Champ Doré,lower fat";
    String expectedOutput = "242,NB,Farmstead,47.9,Sharp lactic lightly caramelized,Uncooked,0,Semi-soft Cheese,Cow,Raw Milk,Washed Rind,Tomme Le Champ Doré,lower fat";

    String actualOutput = rowCleaner.cleanRow(input);

    // Print values for debugging
    System.out.println("EXPECTED: " + expectedOutput);
    System.out.println("ACTUAL:   " + actualOutput);

    assertEquals(expectedOutput, actualOutput);
}


}
