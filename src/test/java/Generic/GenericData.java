package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericData {
	public static String getData(String sheet,int row,int col) throws EncryptedDocumentException, IOException
	{
		File f=new File("D:\\Online Shopping\\YourLogoShopping\\Data\\UnamepwdData.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		String val = wb.getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
		return val;
	}

}
