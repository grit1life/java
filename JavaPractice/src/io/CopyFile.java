package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream(new File("123.txt"));
				FileOutputStream fos = new FileOutputStream(new File("copy.txt"));){
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
