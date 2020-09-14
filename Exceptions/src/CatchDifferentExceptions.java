import java.io.*;
import java.util.Scanner;

public class CatchDifferentExceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/Users/ttoktassynov/Documents/aitu/javaclass/hello.txt");
	
		Scanner scanner = new Scanner(file);
		String content = "";
		while (scanner.hasNextLine()) {
			content += scanner.nextLine() + "\n";
		}
		System.out.println(content);
		FileWriter writer = new FileWriter("/Users/ttoktassynov/Documents/aitu/javaclass/mynewfile.txt");
		writer.write(content);
		scanner.close();
		writer.close();
		
	}

}
