package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FrameworkUtils {
	public static Properties prop;

	public static void loadProptities() throws Exception, IOException {
		String path="C:\\Users\\suman\\eclipse-workspace730_5\\project2\\src\\main\\resources\\config\\gloabl.properties";
		prop= new Properties();
		prop.load(new FileInputStream(new File(path)));
		ReportUtils.updateReport("info","propeties loaded for ececution");
		
	}

}
