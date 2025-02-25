package utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExeclUtils {
	
	public static Map<String, String> data;

	public static void loadTestData() throws Exception, IOException {
		String path="C:\\Users\\suman\\eclipse-workspace730_5\\project2\\src\\test\\resources\\testdata\\framework_data.xlsx";
		data=new HashMap<String,String>();
		XSSFWorkbook w= new XSSFWorkbook(new File(path));
		XSSFSheet s= w.getSheetAt(0);
		int rows=s.getLastRowNum();
		for(int i=1;i<=rows;i++) {
				String key=s.getRow(i).getCell(0).getStringCellValue();
				String value=s.getRow(i).getCell(1).getStringCellValue();
				data.put(key, value);
		}
		System.out.println(data);
	
	}

}
