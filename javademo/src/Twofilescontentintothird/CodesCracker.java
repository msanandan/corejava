package Twofilescontentintothird;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodesCracker {

	public static void main(String[] args) {

		String fileone, filetwo, fileThree, line, content = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name first file: ");

		fileone = scan.nextLine();

		System.out.println("Enter the name second file: ");

		filetwo = scan.nextLine();

		System.out.println("Enter the name third file: ");

		String merge = scan.nextLine();

		File[] files = new File[2];

		files[0] = new File(fileone);

		files[1] = new File(filetwo);

		File mergedFile = new File(merge);

		mergedFile(files, mergedFile);

	}

	private static void mergedFile(File[] files, File mergedFile) {

	}

	public static void mergeFiles(File[] files, File mergedFile) {

		FileWriter fstream = null;
		BufferedWriter out = null;
		try {
			fstream = new FileWriter(mergedFile, true);

			out = new BufferedWriter(fstream);
		} catch (IOException e1) {
			System.out.println("\nMerging the file....");

			for (File f : files)

			{
				FileInputStream fis;
				try

				{
					fis = new FileInputStream(f);

					BufferedReader in = new BufferedReader(new InputStreamReader(fis));

					String aLine;

					while ((aLine = in.readLine()) != null)

					{
						out.write(aLine);
						out.newLine();
					}
					in.close();
				} catch (IOException e) {

					e.printStackTrace();

				}
			}
			System.out.println("\nmerged Successfully!");
			try {
				out.close();
			} catch (IOException e) {

				System.out.println("Exception: " + e);
			}

		}
	}

}
