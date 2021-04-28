package testpackage4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ScreenShot {
	
	
public static void main(String[] args)throws  IOException {
		
	
		String path = "\"C:\\Users\\abc\\Desktop\\Book1.xlsx\"";
		FileInputStream file = new FileInputStream (path);
		
        String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		
	    System.out.println(data);

}
}
