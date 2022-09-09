package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		
		File inputFile = new File("C:\\Users\\admin\\git\\JavaBasics\\JavaCode\\JavaCodingBasic\\Resume.pdf");
		File outputFile = new File("C:\\Users\\admin\\git\\JavaBasics\\JavaCode\\JavaCodingBasic\\ResumeCopy.pdf");
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		
		
		try {
			 inputStream = new FileInputStream(inputFile);
			 outputStream = new FileOutputStream(outputFile);
			 
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(inputStream.available());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
