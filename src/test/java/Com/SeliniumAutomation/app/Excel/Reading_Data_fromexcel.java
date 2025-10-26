package Com.SeliniumAutomation.app.Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reading_Data_fromexcel {
@Test
    public void readdatafromexcel() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\JakkaThilak\\IdeaProjects\\Selenium_Automation\\src\\test\\java\\Testdata\\JFAX-23093_JFAX-22217_testcases.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("JFAX-23093");
     int totalrow = sheet.getLastRowNum();
     int totalcell =sheet.getRow(1).getLastCellNum();

        System.out.println("No .of . rows " + totalrow);
        System.out.println("No .of . Cell " + totalcell);
    for (int i = 0; i <= totalrow; i++) { // Include last row
        XSSFRow row = sheet.getRow(i);
        if (row == null) continue; // Skip empty rows

        for (int c = 0; c < totalcell; c++) {
            XSSFCell cell = row.getCell(c);
            if (cell == null) {
                System.out.print("NULL\t");
            } else {
                System.out.print(cell.toString() + "\t");
            }
        }
        System.out.println();
    }
}

     }


