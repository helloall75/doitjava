package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest0 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁 
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a.zip");
			for(int i=0; i<5000000; i++) {
				fos.write((char)(int)(Math.random() * 70000));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) 
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
