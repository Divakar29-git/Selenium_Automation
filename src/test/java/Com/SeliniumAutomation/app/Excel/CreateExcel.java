package Com.SeliniumAutomation.app.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.apache.poi.ss.util.CellUtil.createCell;

public  class CreateExcel {
    @Test
    public void Createexcel() throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\JakkaThilak\\IdeaProjects\\Selenium_Automation\\src\\test\\java\\Testdata\\Emptyfile.xlsx");
        Workbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = (XSSFSheet) workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row.createCell(2).setCellValue("Gender");
        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Div");
        row1.createCell(1).setCellValue("26");
        row1.createCell(2).setCellValue("male");
        XSSFRow row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Thilak");
        row2.createCell(1).setCellValue("28");
        row2.createCell(2).setCellValue("male");

        workbook.write(file);
        workbook.close();
        file.close();





    }

}
