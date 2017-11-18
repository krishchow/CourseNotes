import java.io.*;
import java.util.Scanner;

public class FileIO {

	private static final String PATH="/Users/sadiasharmin/20169_Work/207/207_L0101/w09/";

	public static void main(String[] args) throws IOException {
		//readCharacters();
		//appendCharacters();
		//readLines();
		//scanLines();
		//filterFile("yellow");
		addToFile("yellow");
	}
	
	public static void readCharacters() throws IOException {
		
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader(PATH+"mock_data.csv");
			out = new FileWriter(PATH+"copy_mock_data.csv");
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
	}
	
	public static void appendCharacters() throws IOException {
		
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader(PATH+"mock_data.csv");
			out = new FileWriter(PATH+"copy_mock_data.csv", true);
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
				out.write("===");
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
	}
	
	public static void readLines() throws IOException {
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			
			in = new BufferedReader(new FileReader(PATH+"mock_data.csv"));
			out = new PrintWriter(new FileWriter(PATH+"copy_mock_data2.csv"));
			
			String l;
			while ((l = in.readLine()) != null) {
				out.println(l);
				out.println("---");
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}			
		}
	}
	
	
	public static void scanLines() throws IOException {
		
		BufferedReader in = null;
		Scanner s = null;
		
		try {
			
			in = new BufferedReader(new FileReader(PATH+"mock_data.csv"));
			
			s = new Scanner(in);
			
			s.useDelimiter(","); // use regex pattern!
			
			// default delimeter is any whitespace
//			while (s.hasNext()) {
//				System.out.println(s.next());
//				System.out.println("===");
//			}
			
			// this seperates it at any new line
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (s != null) {
				s.close();
			}			
		}
	}
	
	public static void filterFile(String c) throws IOException {

		BufferedReader in = null;
		Scanner s = null;
		PrintWriter out = null;
		
		String[] data;
		Person person;
		
		try {
			in = new BufferedReader(new FileReader(PATH+"mock_data.csv"));
			out = new PrintWriter(new FileWriter(PATH+"only_"+c+".csv"));
			s = new Scanner(in);
			
			while (s.hasNextLine()) {
				data = s.nextLine().split(",");
				person = new Person(data[1], data[3]);
				
				if (person.getColor().equalsIgnoreCase(c)) {
					out.println(person);
				}

			}
			
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
			if (s != null)
				s.close();
		}
	}
	
	public static void addToFile(String c) throws IOException {

		BufferedReader in = null;
		Scanner s = null;
		PrintWriter out = null;
		
		String[] data;
		Person person;
		
		try {
			in = new BufferedReader(new FileReader(PATH+"mock_data.csv"));
			out = new PrintWriter(new FileWriter(PATH+"only_"+c+".csv", true));
			s = new Scanner(in);
			
			while (s.hasNextLine()) {
				data = s.nextLine().split(",");
				person = new Person(data[1], data[3]);
				
				if (!(person.getColor().equalsIgnoreCase(c))) {
					out.println(person.getName() + " doesn't like " + c);
				}

			}
			
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
			if (s != null)
				s.close();
		}
	}
}
