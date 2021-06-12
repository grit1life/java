package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileBuffered {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("score.dat");
				FileOutputStream fos = new FileOutputStream("copy_buffered.dat");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
