package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args)  {
		try(FileInputStream fis = new FileInputStream("123.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("copy.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			int b;
			while((b= bis.read())!=-1) {
				bos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
