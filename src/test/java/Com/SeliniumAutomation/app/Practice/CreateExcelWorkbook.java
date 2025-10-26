package Com.SeliniumAutomation.app.Practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelWorkbook {
    @Test
    public void TestCreateExcelWorkbook() throws IOException {
        FileOutputStream File = new FileOutputStream("C:\\Users\\JakkaThilak\\IdeaProjects\\Selenium_Automation\\src\\test\\java\\Testdata\\Practicesheet.xlsx");
        Workbook workbook = new XSSFWorkbook();
        XSSFSheet Sheet = (XSSFSheet) workbook.createSheet("Data1");
        XSSFRow Row = Sheet.createRow(0);

        Row.createCell(0).setCellValue("Place");
        Row.createCell(1).setCellValue("location");
        Row.createCell(2).setCellValue("distance");
        Row.createCell(3).setCellValue("members");
        Row.createCell(4).setCellValue("vehicle");
        XSSFRow Row1 = Sheet.createRow(1);
        Row1.createCell(0).setCellValue("Charminar");
        Row1.createCell(1).setCellValue("HYD");
        Row1.createCell(2).setCellValue("500km");
        Row1.createCell(3).setCellValue("3");
        Row1.createCell(4).setCellValue("Bike");
        XSSFRow Row2 = Sheet.createRow(2);
        Row2.createCell(0).setCellValue("Budha Statue");
        Row2.createCell(1).setCellValue("HYD");
        Row2.createCell(2).setCellValue("500km");
        Row2.createCell(3).setCellValue("3");
        Row2.createCell(4).setCellValue("Bike");
        workbook.write(File);
        workbook.close();
        File.close();


        };

    }

