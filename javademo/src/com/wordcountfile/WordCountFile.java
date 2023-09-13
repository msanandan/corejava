package com.wordcountfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFile {
	public static void main(String[] args) {

		BufferedReader reader = null;

		int charCount = 0;

		int wordCount = 0;

		int lineCount = 0;

		try {
			reader = new BufferedReader(new FileReader("D:\\workspace\\javademo\\src\\com\\wordcountfile\\sample.txt"));

			String currentLine = reader.readLine();

			while (currentLine != null) {
				lineCount++;

				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {

					charCount = charCount + word.length();
				}
				currentLine = reader.readLine();

			}
			System.out.println("number of chars In A file:" + charCount);

			System.out.println("number of words In A file:" + wordCount);

			System.out.println("number of lines in A file:" + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}	


