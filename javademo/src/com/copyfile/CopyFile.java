package com.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream r = new FileInputStream("D:\\Ravi.txt");
		FileOutputStream w = new FileOutputStream("D:\\Raju.txt");

		int i;
		while ((i = r.read()) != -1) {
			w.write((char) i);
		}
		System.out.println("Data copied successfully...!");

	}
}
