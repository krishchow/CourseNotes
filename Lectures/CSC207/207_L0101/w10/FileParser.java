import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParser {

	private String basePath;
	private int lineNumber = 0;
	
	private HashMap<String, Student> utoridToStudent = new HashMap<String, Student>();
	
	public FileParser(String basePath) {
		
		this.basePath = basePath;
		
		try {
			
			this.parseUtorids();
			//this.getUtorids();
			this.parseMarks();
			
		} catch (IOException e) {
			
		}

	}
	
	private void parseUtorids() throws IOException {

		BufferedReader input = null;
		
		try {
			
			input = new BufferedReader(new FileReader(basePath+"utorids.csv"));
			
			String line;
			String[] data;
			
			input.readLine();
			
			while ((line = input.readLine()) != null) {

				data = line.split(",");
				utoridToStudent.put(data[1], new Student(data[0], data[1], data[4], data[3]));
				//System.out.println(utoridToStudent.get(data[1]));
			}
			
			
		} finally {
			if (input != null)
				input.close();
		}
	}
	
	private void getUtorids() throws IOException {
		
		BufferedReader in = null;
		
		try {
			
			Pattern p = Pattern.compile("^(.+)/JugPuzzleGame/src/JugPuzzleGUIController\\.java\\s*$");
			in = new BufferedReader(new FileReader(basePath + "marks.txt"));
			
			String line;
			while ((line = in.readLine()) != null) {
				
				Matcher m = p.matcher(line);
				if (m.matches()) {
					System.out.println(m.group(1));
				}
				
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
		}
		
	}

	private void parseMarks() throws IOException {
	
		BufferedReader in = null;
		
		try {
			 
			Pattern pAsterisks = Pattern.compile("\\*{3}");
			Pattern pUtorid = Pattern.compile("^(.+)/JugPuzzleGame/src/JugPuzzleGUIController\\.java\\s*$");
			Pattern pStartMarks = Pattern.compile("MARKS For Assignment 1, Part 2");
			Pattern pGUI = Pattern.compile("^GUI:\\s*(\\d(\\.\\d)?)/5\\s*$");
			Pattern pCode = Pattern.compile("^CODE:\\s*(\\d(\\.\\d)?)/5\\s*$");
			Pattern pEndMarks = Pattern.compile("END MARKS");
			
			in = new BufferedReader(new FileReader(basePath+"marks.txt"));
			
			int state = 0;
			
			Matcher m;
			String l, utorid = "";
			float guiMark = 0, codeMark = 0;
			
			lineNumber = 0;
			
			while ((l = in.readLine()) != null) {
				
				lineNumber++;
	
				switch (state) {
				
					case 0:
						m = pAsterisks.matcher(l);
						if (m.matches()) {
							utorid = ""; guiMark = 0; codeMark = 0;
							state = 1;
						}
						break;
					
					case 1:
						m = pUtorid.matcher(l);
						if (m.matches()) {
							utorid = m.group(1);
							state = 2;
						} else {
							System.err.println("Expecting utorid line at: " + lineNumber);
						}
						break;
					
					case 2:
						m = pAsterisks.matcher(l);
						if (m.matches()) {
							state = 3;
						} else {
							System.err.println("Expecting asterisks line at: " + lineNumber);
						}
						break;
						
					case 3:
						m = pStartMarks.matcher(l);
						if (m.matches()) {
							state = 4;
						} else {
							System.err.println("Expecting start marks line at: " + lineNumber);
						}
						break;
						
					case 4:
						m = pGUI.matcher(l);
						if (m.matches()) {
							guiMark = Float.parseFloat(m.group(1));
							state = 5;
						} else {
							System.err.println("Expecting gui marks line at: " + lineNumber);
						}
					
						break;
					
					case 5:
						m = pCode.matcher(l);
						if (m.matches()) {
							codeMark = Float.parseFloat(m.group(1));
							state = 6;
						} else {
							System.err.println("Expecting code marks line at: " + lineNumber);
						}
					
						break;
			
					case 6:
						m = pEndMarks.matcher(l);
						if (m.matches()) {
							this.utoridToStudent.get(utorid).setGuiMark(guiMark);
							this.utoridToStudent.get(utorid).setCodeMark(codeMark);
							state = 0;
						} else {
							System.err.println("Expecting end marks line at: " + lineNumber);
						}
						break;
				}

			}
			
			
			if (state != 0) {
				System.err.println("Expected end of file at " + lineNumber);
			} else {
				
				for (String s: this.utoridToStudent.keySet()) {
					Student student = utoridToStudent.get(s);
					if ((student.getCodeMark() != 0) && (student.getGuiMark() != 0)) {
						System.out.println(student);
					}
				}
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FileParser mp = new FileParser("/Users/sadiasharmin/20169_Work/207/207_L0101/w10/");
		
	}
}
