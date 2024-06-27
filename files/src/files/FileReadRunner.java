package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = Paths.get("./resources/data.txt");

		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		// reads file one line at a time
		// Files.lines(pathFileToRead).forEach(System. out::println);

		// create map and filter
		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println);
	}

}
