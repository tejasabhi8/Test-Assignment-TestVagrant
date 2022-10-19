package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import baseclass.BaseTest;

public class FileUtils extends BaseTest{
	
	public static void AddDataToFile(String text) throws IOException {
		String final_text = text + "\n";
		File file = new File(System.getProperty("user.dir")+"\\outputdata\\result.txt");
		FileOutputStream fos=new FileOutputStream(file, true);
		byte[] b = final_text.getBytes();
		fos.write(b);
		fos.close();
	}
	
	public static void AddSpearator() throws IOException {
		String separator = "--------------------------------------*************************---------------------------------------------";
		AddDataToFile(separator);
	}

}
