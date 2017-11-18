package ca.utoronto.utm.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileIO {

	public static void consoleIO() {
		// System class System.in, System.out
		// https://docs.oracle.com/javase/8/docs/api/
		char[] c = new char[10];

		try {
			for (int i = 0; i < c.length; i++) {
				c[i] = (char) System.in.read(); // System.in is an InputStream
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println();

		// Would prefer to read a line at a time...
		BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = lineInput.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		// Alternatively, can use a scanner
		// Scanner sc = new Scanner(System.in);
	}

	public static void fileIO() {
		// read words and count the number of lines in the file
		try {
			FileReader fr = new FileReader("words");
			BufferedReader lineInput = new BufferedReader(fr);
			String line;
			int count = 0;
			while ((line = lineInput.readLine()) != null) {
				// System.out.println(line);
				count++;
			}
			fr.close();
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1){
			System.out.println(e1);
		} 
		// read words and print them all out
	}

	public static void main(String[] args) {
		// consoleIO();
		fileIO();
	}
}
