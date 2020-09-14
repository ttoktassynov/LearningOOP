package checked_uncheked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file  = new File("hello.txt");
		Scanner scanner = new Scanner(file);
		String content = "";
		while(scanner.hasNextLine()) {
			content = content.concat(scanner.nextLine());
		}
		
		FileWriter writer = new FileWriter("/Users/ttoktassynov/Documents/aitu/javaclass/newFile.txt");
		writer.write(content);
		scanner.close();
		writer.close();
	}
}
